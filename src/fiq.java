import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fiq {
   private final GameProfile a;
   private final Supplier<fzl> b;
   private cpj c = cpj.e;
   private int d;
   @Nullable
   private tf e;
   @Nullable
   private tv f;
   private ua g;

   public fiq(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<fzl>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<fzl> a(GameProfile $$0) {
      eqm $$1 = eqm.O();
      fzm $$2 = $$1.al();
      CompletableFuture<fzl> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      fzl $$5 = fzd.a($$0);
      return () -> {
         fzl $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.e() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public tv b() {
      return this.f;
   }

   public ua c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(tv $$0) {
      this.f = $$0;
      this.g = $$0.a(cbq.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static ua b(boolean $$0) {
      return $$0 ? ua.c : ua.b;
   }

   public cpj e() {
      return this.c;
   }

   protected void a(cpj $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public fzl g() {
      return this.b.get();
   }

   @Nullable
   public eib h() {
      return eqm.O().u.I().g(this.a().getName());
   }

   public void a(@Nullable tf $$0) {
      this.e = $$0;
   }

   @Nullable
   public tf i() {
      return this.e;
   }
}
