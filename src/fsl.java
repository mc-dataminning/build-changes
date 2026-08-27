import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsl {
   private final GameProfile a;
   private final Supplier<gkb> b;
   private cwy c = cwy.e;
   private int d;
   @Nullable
   private vu e;
   @Nullable
   private wl f;
   private wq g;

   public fsl(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gkb>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gkb> a(GameProfile $$0) {
      ezi $$1 = ezi.Q();
      gkc $$2 = $$1.an();
      CompletableFuture<gkb> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gkb $$5 = gju.a($$0);
      return () -> {
         gkb $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public wl b() {
      return this.f;
   }

   public wq c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(wl $$0) {
      this.f = $$0;
      this.g = $$0.a(cix.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static wq b(boolean $$0) {
      return $$0 ? wq.c : wq.b;
   }

   public cwy e() {
      return this.c;
   }

   protected void a(cwy $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gkb g() {
      return this.b.get();
   }

   @Nullable
   public eqs h() {
      return ezi.Q().r.K().e(this.a().getName());
   }

   public void a(@Nullable vu $$0) {
      this.e = $$0;
   }

   @Nullable
   public vu i() {
      return this.e;
   }
}
