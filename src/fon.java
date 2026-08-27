import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fon {
   private final GameProfile a;
   private final Supplier<gga> b;
   private ctu c = ctu.e;
   private int d;
   @Nullable
   private vg e;
   @Nullable
   private vx f;
   private wc g;

   public fon(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gga>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gga> a(GameProfile $$0) {
      evr $$1 = evr.O();
      ggb $$2 = $$1.al();
      CompletableFuture<gga> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gga $$5 = gft.a($$0);
      return () -> {
         gga $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public vx b() {
      return this.f;
   }

   public wc c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(vx $$0) {
      this.f = $$0;
      this.g = $$0.a(cft.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static wc b(boolean $$0) {
      return $$0 ? wc.c : wc.b;
   }

   public ctu e() {
      return this.c;
   }

   protected void a(ctu $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gga g() {
      return this.b.get();
   }

   @Nullable
   public enb h() {
      return evr.O().r.K().e(this.a().getName());
   }

   public void a(@Nullable vg $$0) {
      this.e = $$0;
   }

   @Nullable
   public vg i() {
      return this.e;
   }
}
