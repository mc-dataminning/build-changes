import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fja {
   private final GameProfile a;
   private final Supplier<fzz> b;
   private cpn c = cpn.e;
   private int d;
   @Nullable
   private ti e;
   @Nullable
   private ty f;
   private ud g;

   public fja(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<fzz>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<fzz> a(GameProfile $$0) {
      eqq $$1 = eqq.O();
      gaa $$2 = $$1.al();
      CompletableFuture<fzz> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      fzz $$5 = fzr.a($$0);
      return () -> {
         fzz $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public ty b() {
      return this.f;
   }

   public ud c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(ty $$0) {
      this.f = $$0;
      this.g = $$0.a(cbs.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static ud b(boolean $$0) {
      return $$0 ? ud.c : ud.b;
   }

   public cpn e() {
      return this.c;
   }

   protected void a(cpn $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public fzz g() {
      return this.b.get();
   }

   @Nullable
   public eif h() {
      return eqq.O().r.I().g(this.a().getName());
   }

   public void a(@Nullable ti $$0) {
      this.e = $$0;
   }

   @Nullable
   public ti i() {
      return this.e;
   }
}
