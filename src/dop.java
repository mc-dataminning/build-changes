import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dop extends dnd {
   private static final String b = "profile";
   private static final String c = "note_block_sound";
   private static final String d = "custom_name";
   private static final Logger e = LogUtils.getLogger();
   @Nullable
   private static Executor f;
   @Nullable
   private static LoadingCache<String, CompletableFuture<Optional<GameProfile>>> g;
   public static final Executor a = $$0 -> {
      Executor $$1 = f;
      if ($$1 != null) {
         $$1.execute($$0);
      }
   };
   @Nullable
   private cvd h;
   @Nullable
   private akf i;
   private int j;
   private boolean k;
   @Nullable
   private ws l;

   public dop(im $$0, dpy $$1) {
      super(dnf.p, $$0, $$1);
   }

   public static void a(final aky $$0, Executor $$1) {
      f = $$1;
      final BooleanSupplier $$2 = () -> g == null;
      g = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<String, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(String $$0x) {
               return $$2.getAsBoolean() ? CompletableFuture.completedFuture(Optional.empty()) : dop.a($$0, $$0, $$2);
            }
         });
   }

   public static void b() {
      f = null;
      g = null;
   }

   static CompletableFuture<Optional<GameProfile>> a(String $$0, aky $$1, BooleanSupplier $$2) {
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
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      if (this.h != null) {
         $$0.a("profile", ac.a(cvd.a.encodeStart(um.a, this.h), IllegalStateException::new));
      }

      if (this.i != null) {
         $$0.a("note_block_sound", this.i.toString());
      }

      if (this.l != null) {
         $$0.a("custom_name", ws.a.a(this.l, $$1));
      }
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("profile")) {
         cvd.a.parse(um.a, $$0.c("profile")).resultOrPartial($$0x -> e.error("Failed to load profile from player head: {}", $$0x)).ifPresent(this::a);
      }

      if ($$0.b("note_block_sound", 8)) {
         this.i = akf.a($$0.l("note_block_sound"));
      }

      if ($$0.b("custom_name", 8)) {
         this.l = ws.a.a($$0.l("custom_name"), $$1);
      } else {
         this.l = null;
      }
   }

   public static void a(czu $$0, im $$1, dpy $$2, dop $$3) {
      if ($$2.b(djx.a) && $$2.c(djx.a)) {
         $$3.k = true;
         $$3.j++;
      } else {
         $$3.k = false;
      }
   }

   public float a(float $$0) {
      return this.k ? (float)this.j + $$0 : (float)this.j;
   }

   @Nullable
   public cvd c() {
      return this.h;
   }

   @Nullable
   public akf d() {
      return this.i;
   }

   public abr f() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      return this.d($$0);
   }

   public void a(@Nullable cvd $$0) {
      synchronized (this) {
         this.h = $$0;
      }

      this.j();
   }

   private void j() {
      if (this.h != null && !this.h.b()) {
         this.h.a().thenAcceptAsync($$0 -> {
            this.h = $$0;
            this.e();
         }, a);
      } else {
         this.e();
      }
   }

   public static CompletableFuture<Optional<GameProfile>> a(String $$0) {
      LoadingCache<String, CompletableFuture<Optional<GameProfile>>> $$1 = g;
      return $$1 != null && ayr.f($$0) ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   @Override
   public void a(jv $$0) {
      this.a($$0.a(jz.L));
      this.i = $$0.a(jz.M);
      this.l = $$0.a(jz.d);
   }

   @Override
   public void a(jv.a $$0) {
      $$0.a(jz.L, this.h);
      $$0.a(jz.M, this.i);
      $$0.a(jz.d, this.l);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      $$0.r("profile");
      $$0.r("note_block_sound");
      $$0.r("custom_name");
   }
}
