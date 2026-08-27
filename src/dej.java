import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dej extends dcz {
   public static final String a = "SkullOwner";
   public static final String b = "note_block_sound";
   @Nullable
   private static Executor c;
   @Nullable
   private static LoadingCache<String, CompletableFuture<Optional<GameProfile>>> d;
   private static final Executor e = $$0 -> {
      Executor $$1 = c;
      if ($$1 != null) {
         $$1.execute($$0);
      }
   };
   @Nullable
   private GameProfile f;
   @Nullable
   private aez g;
   private int h;
   private boolean i;

   public dej(gw $$0, dfd $$1) {
      super(ddb.p, $$0, $$1);
   }

   public static void a(final afr $$0, Executor $$1) {
      c = $$1;
      final BooleanSupplier $$2 = () -> d == null;
      d = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<String, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(String $$0x) {
               return $$2.getAsBoolean() ? CompletableFuture.completedFuture(Optional.empty()) : dej.a($$0, $$0, $$2);
            }
         });
   }

   public static void c() {
      c = null;
      d = null;
   }

   static CompletableFuture<Optional<GameProfile>> a(String $$0, afr $$1, BooleanSupplier $$2) {
      return $$1.e().b($$0).thenApplyAsync($$2x -> {
         if ($$2x.isPresent() && !$$2.getAsBoolean()) {
            UUID $$3 = ((GameProfile)$$2x.get()).getId();
            ProfileResult $$4 = $$1.b().fetchProfile($$3, true);
            return $$4 != null ? Optional.ofNullable($$4.profile()) : $$2x;
         } else {
            return Optional.empty();
         }
      }, ac.f());
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (this.f != null) {
         qw $$1 = new qw();
         rj.a($$1, this.f);
         $$0.a("SkullOwner", $$1);
      }

      if (this.g != null) {
         $$0.a("note_block_sound", this.g.toString());
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("SkullOwner", 10)) {
         this.a(rj.a($$0.p("SkullOwner")));
      } else if ($$0.b("ExtraType", 8)) {
         String $$1 = $$0.l("ExtraType");
         if (!asv.b($$1)) {
            this.a(new GameProfile(ac.d, $$1));
         }
      }

      if ($$0.b("note_block_sound", 8)) {
         this.g = aez.a($$0.l("note_block_sound"));
      }
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, dej $$3) {
      if ($$2.b(dac.a) && $$2.c(dac.a)) {
         $$3.i = true;
         $$3.h++;
      } else {
         $$3.i = false;
      }
   }

   public float a(float $$0) {
      return this.i ? (float)this.h + $$0 : (float)this.h;
   }

   @Nullable
   public GameProfile d() {
      return this.f;
   }

   @Nullable
   public aez f() {
      return this.g;
   }

   public xe g() {
      return xe.a(this);
   }

   @Override
   public qw as_() {
      return this.o();
   }

   public void a(@Nullable GameProfile $$0) {
      synchronized (this) {
         this.f = $$0;
      }

      this.i();
   }

   private void i() {
      if (this.f != null && !ac.b(this.f.getName()) && !b(this.f)) {
         a(this.f.getName()).thenAcceptAsync($$0 -> {
            this.f = $$0.orElse(this.f);
            this.e();
         }, e);
      } else {
         this.e();
      }
   }

   @Nullable
   public static GameProfile d(qw $$0) {
      if ($$0.b("SkullOwner", 10)) {
         return rj.a($$0.p("SkullOwner"));
      } else {
         if ($$0.b("SkullOwner", 8)) {
            String $$1 = $$0.l("SkullOwner");
            if (!ac.b($$1)) {
               $$0.r("SkullOwner");
               a($$0, $$1);
            }
         }

         return null;
      }
   }

   public static void e(qw $$0) {
      String $$1 = $$0.l("SkullOwner");
      if (!ac.b($$1)) {
         a($$0, $$1);
      }
   }

   private static void a(qw $$0, String $$1) {
      a($$1).thenAccept($$2 -> $$0.a("SkullOwner", rj.a(new qw(), $$2.orElse(new GameProfile(ac.d, $$1)))));
   }

   private static CompletableFuture<Optional<GameProfile>> a(String $$0) {
      LoadingCache<String, CompletableFuture<Optional<GameProfile>>> $$1 = d;
      return $$1 != null && cca.c($$0) ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   private static boolean b(GameProfile $$0) {
      return $$0.getProperties().containsKey("textures");
   }
}
