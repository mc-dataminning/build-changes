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

public class dzs extends dyc {
   private static final String b = "profile";
   private static final String c = "note_block_sound";
   private static final String d = "custom_name";
   @Nullable
   private static Executor e;
   @Nullable
   private static LoadingCache<String, CompletableFuture<Optional<GameProfile>>> f;
   @Nullable
   private static LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> g;
   public static final Executor a = $$0 -> {
      Executor $$1 = e;
      if ($$1 != null) {
         $$1.execute($$0);
      }
   };
   @Nullable
   private dcy h;
   @Nullable
   private ali i;
   private int j;
   private boolean k;
   @Nullable
   private xa l;

   public dzs(iv $$0, ebe $$1) {
      super(dye.q, $$0, $$1);
   }

   public static void a(final amd $$0, Executor $$1) {
      e = $$1;
      final BooleanSupplier $$2 = () -> g == null;
      f = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<String, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(String $$0x) {
               return dzs.a($$0, $$0);
            }
         });
      g = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<UUID, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(UUID $$0x) {
               return dzs.a($$0, $$0, $$2);
            }
         });
   }

   static CompletableFuture<Optional<GameProfile>> a(String $$0, amd $$1) {
      return $$1.f()
         .b($$0)
         .thenCompose(
            $$0x -> {
               LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> $$1x = g;
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
      }, ag.h().a("fetchProfile"));
   }

   public static void a() {
      e = null;
      f = null;
      g = null;
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.b("profile", dcy.a, this.h);
      $$0.b("note_block_sound", ali.a, this.i);
      $$0.b("custom_name", xc.a, $$1.a(un.a), this.l);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a($$0.<dcy>a("profile", dcy.a).orElse(null));
      this.i = $$0.<ali>a("note_block_sound", ali.a).orElse(null);
      this.l = a($$0.a("custom_name"), $$1);
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dzs $$3) {
      if ($$2.b(duo.a) && $$2.c(duo.a)) {
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
   public dcy c() {
      return this.h;
   }

   @Nullable
   public ali d() {
      return this.i;
   }

   public acc f() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public void a(@Nullable dcy $$0) {
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
      LoadingCache<String, CompletableFuture<Optional<GameProfile>>> $$1 = f;
      return $$1 != null && ban.f($$0) ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   public static CompletableFuture<Optional<GameProfile>> a(UUID $$0) {
      LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> $$1 = g;
      return $$1 != null ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.a($$0.a(kk.ak));
      this.i = $$0.a(kk.al);
      this.l = $$0.a(kk.g);
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.ak, this.h);
      $$0.a(kk.al, this.i);
      $$0.a(kk.g, this.l);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("profile");
      $$0.r("note_block_sound");
      $$0.r("custom_name");
   }
}
