import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fiv {
   private final GameProfile a;
   private final Supplier<fzu> b;
   private cpi c = cpi.e;
   private int d;
   @Nullable
   private tf e;
   @Nullable
   private tv f;
   private ua g;

   public fiv(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<fzu>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<fzu> a(GameProfile $$0) {
      eql $$1 = eql.O();
      fzv $$2 = $$1.al();
      CompletableFuture<fzu> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      fzu $$5 = fzm.a($$0);
      return () -> {
         fzu $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
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
      this.g = $$0.a(cbp.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static ua b(boolean $$0) {
      return $$0 ? ua.c : ua.b;
   }

   public cpi e() {
      return this.c;
   }

   protected void a(cpi $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public fzu g() {
      return this.b.get();
   }

   @Nullable
   public eia h() {
      return eql.O().r.I().g(this.a().getName());
   }

   public void a(@Nullable tf $$0) {
      this.e = $$0;
   }

   @Nullable
   public tf i() {
      return this.e;
   }
}
