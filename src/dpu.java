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

public class dpu extends doi {
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
   private cws i;
   @Nullable
   private akn j;
   private int k;
   private boolean l;
   @Nullable
   private wx m;

   public dpu(io $$0, drd $$1) {
      super(dok.p, $$0, $$1);
   }

   public static void a(final alh $$0, Executor $$1) {
      f = $$1;
      final BooleanSupplier $$2 = () -> h == null;
      g = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<String, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(String $$0x) {
               return dpu.a($$0, $$0);
            }
         });
      h = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<UUID, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(UUID $$0x) {
               return dpu.a($$0, $$0, $$2);
            }
         });
   }

   static CompletableFuture<Optional<GameProfile>> a(String $$0, alh $$1) {
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

   static CompletableFuture<Optional<GameProfile>> a(UUID $$0, alh $$1, BooleanSupplier $$2) {
      return CompletableFuture.supplyAsync(() -> {
         if ($$2.getAsBoolean()) {
            return Optional.empty();
         } else {
            ProfileResult $$3 = $$1.c().fetchProfile($$0, true);
            return Optional.ofNullable($$3).map(ProfileResult::profile);
         }
      }, ac.g());
   }

   public static void b() {
      f = null;
      g = null;
      h = null;
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (this.i != null) {
         $$0.a("profile", (va)cws.a.encodeStart(ur.a, this.i).getOrThrow());
      }

      if (this.j != null) {
         $$0.a("note_block_sound", this.j.toString());
      }

      if (this.m != null) {
         $$0.a("custom_name", wx.a.a(this.m, $$1));
      }
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("profile")) {
         cws.a.parse(ur.a, $$0.c("profile")).resultOrPartial($$0x -> e.error("Failed to load profile from player head: {}", $$0x)).ifPresent(this::a);
      }

      if ($$0.b("note_block_sound", 8)) {
         this.j = akn.a($$0.l("note_block_sound"));
      }

      if ($$0.b("custom_name", 8)) {
         this.m = wx.a.a($$0.l("custom_name"), $$1);
      } else {
         this.m = null;
      }
   }

   public static void a(daz $$0, io $$1, drd $$2, dpu $$3) {
      if ($$2.b(dlc.a) && $$2.c(dlc.a)) {
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
   public cws c() {
      return this.i;
   }

   @Nullable
   public akn d() {
      return this.j;
   }

   public abx f() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return this.e($$0);
   }

   public void a(@Nullable cws $$0) {
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
      return $$1 != null && aza.f($$0) ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   public static CompletableFuture<Optional<GameProfile>> a(UUID $$0) {
      LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> $$1 = h;
      return $$1 != null ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   @Override
   protected void a(doi.b $$0) {
      super.a($$0);
      this.a($$0.a(kb.U));
      this.j = $$0.a(kb.V);
      this.m = $$0.a(kb.f);
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.U, this.i);
      $$0.a(kb.V, this.j);
      $$0.a(kb.f, this.m);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      $$0.r("profile");
      $$0.r("note_block_sound");
      $$0.r("custom_name");
   }
}
