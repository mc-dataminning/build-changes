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

public class doa extends dmo {
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
   private cup h;
   @Nullable
   private ajv i;
   private int j;
   private boolean k;
   @Nullable
   private wi l;

   public doa(id $$0, dpi $$1) {
      super(dmq.p, $$0, $$1);
   }

   public static void a(final ako $$0, Executor $$1) {
      f = $$1;
      final BooleanSupplier $$2 = () -> g == null;
      g = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<String, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(String $$0x) {
               return $$2.getAsBoolean() ? CompletableFuture.completedFuture(Optional.empty()) : doa.a($$0, $$0, $$2);
            }
         });
   }

   public static void b() {
      f = null;
      g = null;
   }

   static CompletableFuture<Optional<GameProfile>> a(String $$0, ako $$1, BooleanSupplier $$2) {
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
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      if (this.h != null) {
         $$0.a("profile", ac.a(cup.a.encodeStart(uc.a, this.h), IllegalStateException::new));
      }

      if (this.i != null) {
         $$0.a("note_block_sound", this.i.toString());
      }

      if (this.l != null) {
         $$0.a("custom_name", wi.a.a(this.l, $$1));
      }
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("profile")) {
         cup.a.parse(uc.a, $$0.c("profile")).resultOrPartial($$0x -> e.error("Failed to load profile from player head: {}", $$0x)).ifPresent(this::a);
      }

      if ($$0.b("note_block_sound", 8)) {
         this.i = ajv.a($$0.l("note_block_sound"));
      }

      if ($$0.b("custom_name", 8)) {
         this.l = wi.a.a($$0.l("custom_name"), $$1);
      } else {
         this.l = null;
      }
   }

   public static void a(czg $$0, id $$1, dpi $$2, doa $$3) {
      if ($$2.b(dji.a) && $$2.c(dji.a)) {
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
   public cup c() {
      return this.h;
   }

   @Nullable
   public ajv d() {
      return this.i;
   }

   public abh f() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      return this.d($$0);
   }

   public void a(@Nullable cup $$0) {
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
      return $$1 != null && ayh.f($$0) ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   @Override
   public void a(jn $$0) {
      this.a($$0.a(jr.L));
      this.i = $$0.a(jr.M);
      this.l = $$0.a(jr.d);
   }

   @Override
   public void a(jn.a $$0) {
      $$0.a(jr.L, this.h);
      $$0.a(jr.M, this.i);
      $$0.a(jr.d, this.l);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      $$0.r("profile");
      $$0.r("note_block_sound");
      $$0.r("custom_name");
   }
}
