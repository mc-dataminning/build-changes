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

public class dnr extends dmf {
   private static final String b = "SkullOwner";
   private static final String c = "note_block_sound";
   @Nullable
   private static Executor d;
   @Nullable
   private static LoadingCache<String, CompletableFuture<Optional<GameProfile>>> e;
   public static final Executor a = $$0 -> {
      Executor $$1 = d;
      if ($$1 != null) {
         $$1.execute($$0);
      }
   };
   @Nullable
   private GameProfile f;
   @Nullable
   private ajt g;
   private int h;
   private boolean i;

   public dnr(ib $$0, doz $$1) {
      super(dmh.p, $$0, $$1);
   }

   public static void a(final akm $$0, Executor $$1) {
      d = $$1;
      final BooleanSupplier $$2 = () -> e == null;
      e = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<String, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(String $$0x) {
               return $$2.getAsBoolean() ? CompletableFuture.completedFuture(Optional.empty()) : dnr.a($$0, $$0, $$2);
            }
         });
   }

   public static void b() {
      d = null;
      e = null;
   }

   static CompletableFuture<Optional<GameProfile>> a(String $$0, akm $$1, BooleanSupplier $$2) {
      return $$1.f().b($$0).thenApplyAsync($$2x -> {
         if ($$2x.isPresent() && !$$2.getAsBoolean()) {
            UUID $$3 = ((GameProfile)$$2x.get()).getId();
            ProfileResult $$4 = $$1.c().fetchProfile($$3, true);
            return $$4 != null ? Optional.ofNullable($$4.profile()) : $$2x;
         } else {
            return Optional.empty();
         }
      }, ac.f());
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (this.f != null) {
         tm $$2 = new tm();
         ub.a($$2, this.f);
         $$0.a("SkullOwner", $$2);
      }

      if (this.g != null) {
         $$0.a("note_block_sound", this.g.toString());
      }
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("SkullOwner", 10)) {
         this.a(ub.a($$0.p("SkullOwner")));
      } else if ($$0.b("ExtraType", 8)) {
         String $$2 = $$0.l("ExtraType");
         if (!ayf.b($$2)) {
            this.a(new GameProfile(ac.e, $$2));
         }
      }

      if ($$0.b("note_block_sound", 8)) {
         this.g = ajt.a($$0.l("note_block_sound"));
      }
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dnr $$3) {
      if ($$2.b(diz.a) && $$2.c(diz.a)) {
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
   public GameProfile c() {
      return this.f;
   }

   @Nullable
   public ajt d() {
      return this.g;
   }

   public abf f() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   public void a(@Nullable GameProfile $$0) {
      synchronized (this) {
         this.f = $$0;
      }

      this.j();
   }

   private void j() {
      if (this.f != null && !ayf.h(this.f.getName()) && !b(this.f)) {
         a(this.f.getName()).thenAcceptAsync($$0 -> {
            this.f = $$0.orElse(this.f);
            this.e();
         }, a);
      } else {
         this.e();
      }
   }

   public static CompletableFuture<Optional<GameProfile>> a(String $$0) {
      LoadingCache<String, CompletableFuture<Optional<GameProfile>>> $$1 = e;
      return $$1 != null && ayf.f($$0) ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   private static boolean b(GameProfile $$0) {
      return $$0.getProperties().containsKey("textures");
   }

   @Override
   public void a(jl $$0) {
      cug $$1 = $$0.a(jp.L);
      this.a($$1 != null ? $$1.f() : null);
      this.g = $$0.a(jp.M);
   }

   @Override
   public void a(jl.a $$0) {
      if (this.f != null) {
         $$0.a(jp.L, new cug(this.f));
      }

      $$0.a(jp.M, this.g);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      $$0.r("SkullOwner");
      $$0.r("note_block_sound");
   }
}
