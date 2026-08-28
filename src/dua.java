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

public class dua extends dsm {
   private static final String b = "profile";
   private static final String c = "note_block_sound";
   private static final String d = "custom_name";
   private static final Logger e = LogUtils.getLogger();
   @Nullable
   private static Executor f;
   @Nullable
   private static LoadingCache<String, CompletableFuture<Optional<GameProfile>>> g;
   @Nullable
   private static LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> h;
   public static final Executor a = $$0 -> {
      Executor $$1 = f;
      if ($$1 != null) {
         $$1.execute($$0);
      }
   };
   @Nullable
   private cza i;
   @Nullable
   private ali j;
   private int k;
   private boolean l;
   @Nullable
   private xi m;

   public dua(jh $$0, dvj $$1) {
      super(dso.p, $$0, $$1);
   }

   public static void a(final amd $$0, Executor $$1) {
      f = $$1;
      final BooleanSupplier $$2 = () -> h == null;
      g = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<String, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(String $$0x) {
               return dua.a($$0, $$0);
            }
         });
      h = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<UUID, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(UUID $$0x) {
               return dua.a($$0, $$0, $$2);
            }
         });
   }

   static CompletableFuture<Optional<GameProfile>> a(String $$0, amd $$1) {
      return $$1.f()
         .b($$0)
         .thenCompose(
            $$0x -> {
               LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> $$1x = h;
               return $$1x != null && !$$0x.isEmpty()
                  ? ((CompletableFuture)$$1x.getUnchecked(((GameProfile)$$0x.get()).getId())).thenApply($$1xx -> $$1xx.or(() -> $$0x))
                  : CompletableFuture.completedFuture(Optional.empty());
            }
         );
   }

   static CompletableFuture<Optional<GameProfile>> a(UUID $$0, amd $$1, BooleanSupplier $$2) {
      return CompletableFuture.supplyAsync(() -> {
         if ($$2.getAsBoolean()) {
            return Optional.empty();
         } else {
            ProfileResult $$3 = $$1.c().fetchProfile($$0, true);
            return Optional.ofNullable($$3).map(ProfileResult::profile);
         }
      }, ae.g().a("fetchProfile"));
   }

   public static void b() {
      f = null;
      g = null;
      h = null;
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      if (this.i != null) {
         $$0.a("profile", (vh)cza.a.encodeStart(uy.a, this.i).getOrThrow());
      }

      if (this.j != null) {
         $$0.a("note_block_sound", this.j.toString());
      }

      if (this.m != null) {
         $$0.a("custom_name", xi.a.a(this.m, $$1));
      }
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("profile")) {
         cza.a.parse(uy.a, $$0.c("profile")).resultOrPartial($$0x -> e.error("Failed to load profile from player head: {}", $$0x)).ifPresent(this::a);
      }

      if ($$0.b("note_block_sound", 8)) {
         this.j = ali.c($$0.l("note_block_sound"));
      }

      if ($$0.b("custom_name", 8)) {
         this.m = a($$0.l("custom_name"), $$1);
      } else {
         this.m = null;
      }
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dua $$3) {
      if ($$2.b(dpg.a) && $$2.c(dpg.a)) {
         $$3.l = true;
         $$3.k++;
      } else {
         $$3.l = false;
      }
   }

   public float a(float $$0) {
      return this.l ? (float)this.k + $$0 : (float)this.k;
   }

   @Nullable
   public cza c() {
      return this.i;
   }

   @Nullable
   public ali d() {
      return this.j;
   }

   public acl f() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
      return this.e($$0);
   }

   public void a(@Nullable cza $$0) {
      synchronized (this) {
         this.i = $$0;
      }

      this.j();
   }

   private void j() {
      if (this.i != null && !this.i.b()) {
         this.i.a().thenAcceptAsync($$0 -> {
            this.i = $$0;
            this.e();
         }, a);
      } else {
         this.e();
      }
   }

   public static CompletableFuture<Optional<GameProfile>> a(String $$0) {
      LoadingCache<String, CompletableFuture<Optional<GameProfile>>> $$1 = g;
      return $$1 != null && bah.f($$0) ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   public static CompletableFuture<Optional<GameProfile>> a(UUID $$0) {
      LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> $$1 = h;
      return $$1 != null ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   @Override
   protected void a(dsm.b $$0) {
      super.a($$0);
      this.a($$0.a(ku.ag));
      this.j = $$0.a(ku.ah);
      this.m = $$0.a(ku.g);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ag, this.i);
      $$0.a(ku.ah, this.j);
      $$0.a(ku.g, this.m);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("profile");
      $$0.r("note_block_sound");
      $$0.r("custom_name");
   }
}
