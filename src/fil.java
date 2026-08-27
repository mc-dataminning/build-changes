import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fil {
   private final GameProfile a;
   private final Supplier<fzg> b;
   private cph c = cph.e;
   private int d;
   @Nullable
   private te e;
   @Nullable
   private tu f;
   private tz g;

   public fil(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<fzg>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<fzg> a(GameProfile $$0) {
      eqn $$1 = eqn.N();
      CompletableFuture<fzg> $$2 = a($$0, $$1.ak(), $$1.aj());
      boolean $$3 = !$$1.b($$0.getId());
      fzg $$4 = fyy.a($$0);
      return () -> {
         fzg $$3x = $$2.getNow($$4);
         return $$3 && !$$3x.e() ? $$4 : $$3x;
      };
   }

   private static CompletableFuture<fzg> a(GameProfile $$0, fzh $$1, MinecraftSessionService $$2) {
      CompletableFuture<GameProfile> $$3;
      if ($$1.d($$0)) {
         $$3 = CompletableFuture.completedFuture($$0);
      } else {
         $$3 = CompletableFuture.supplyAsync(() -> a($$0, $$2), ac.g());
      }

      return $$3.thenCompose($$1::c);
   }

   private static GameProfile a(GameProfile $$0, MinecraftSessionService $$1) {
      eqn $$2 = eqn.N();
      $$0.getProperties().clear();
      if ($$2.b($$0.getId())) {
         $$0.getProperties().putAll($$2.V());
      } else {
         GameProfile $$3 = $$1.fetchProfile($$0.getId(), true);
         if ($$3 != null) {
            $$3.getProperties().putAll($$3.getProperties());
         }
      }

      return $$0;
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public tu b() {
      return this.f;
   }

   public tz c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(tu $$0) {
      this.f = $$0;
      this.g = $$0.a();
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static tz b(boolean $$0) {
      return $$0 ? tz.b : tz.a;
   }

   public cph e() {
      return this.c;
   }

   protected void a(cph $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public fzg g() {
      return this.b.get();
   }

   @Nullable
   public eic h() {
      return eqn.N().s.I().g(this.a().getName());
   }

   public void a(@Nullable te $$0) {
      this.e = $$0;
   }

   @Nullable
   public te i() {
      return this.e;
   }
}
