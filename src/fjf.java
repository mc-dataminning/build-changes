import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjf {
   private final GameProfile a;
   private final Supplier<gae> b;
   private cps c = cps.e;
   private int d;
   @Nullable
   private tl e;
   @Nullable
   private ub f;
   private ug g;

   public fjf(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gae>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gae> a(GameProfile $$0) {
      eqv $$1 = eqv.O();
      gaf $$2 = $$1.al();
      CompletableFuture<gae> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gae $$5 = fzw.a($$0);
      return () -> {
         gae $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public ub b() {
      return this.f;
   }

   public ug c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(ub $$0) {
      this.f = $$0;
      this.g = $$0.a(cbx.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static ug b(boolean $$0) {
      return $$0 ? ug.c : ug.b;
   }

   public cps e() {
      return this.c;
   }

   protected void a(cps $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gae g() {
      return this.b.get();
   }

   @Nullable
   public eik h() {
      return eqv.O().r.I().g(this.a().getName());
   }

   public void a(@Nullable tl $$0) {
      this.e = $$0;
   }

   @Nullable
   public tl i() {
      return this.e;
   }
}
