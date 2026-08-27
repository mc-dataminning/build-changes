import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fls {
   private final GameProfile a;
   private final Supplier<gcu> b;
   private crx c = crx.e;
   private int d;
   @Nullable
   private ur e;
   @Nullable
   private vi f;
   private vn g;

   public fls(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gcu>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gcu> a(GameProfile $$0) {
      etd $$1 = etd.N();
      gcv $$2 = $$1.ak();
      CompletableFuture<gcu> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gcu $$5 = gcm.a($$0);
      return () -> {
         gcu $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public vi b() {
      return this.f;
   }

   public vn c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(vi $$0) {
      this.f = $$0;
      this.g = $$0.a(cdx.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static vn b(boolean $$0) {
      return $$0 ? vn.c : vn.b;
   }

   public crx e() {
      return this.c;
   }

   protected void a(crx $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gcu g() {
      return this.b.get();
   }

   @Nullable
   public ekr h() {
      return etd.N().r.J().g(this.a().getName());
   }

   public void a(@Nullable ur $$0) {
      this.e = $$0;
   }

   @Nullable
   public ur i() {
      return this.e;
   }
}
