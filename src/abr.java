import java.util.function.BiFunction;

public class abr implements yz<abk> {
   public static final yq<wd, abr> a = yq.a(im.b, abr::b, yo.a(ld.h), abr::e, yo.o, abr::f, abr::new);
   private final im b;
   private final dnf<?> c;
   private final ty d;

   public static abr a(dnd $$0, BiFunction<dnd, jj, ty> $$1) {
      jj $$2 = $$0.i().H_();
      return new abr($$0.az_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static abr a(dnd $$0) {
      return a($$0, dnd::a);
   }

   private abr(im $$0, dnf<?> $$1, ty $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zb<abr> a() {
      return afv.i;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public im b() {
      return this.b;
   }

   public dnf<?> e() {
      return this.c;
   }

   public ty f() {
      return this.d;
   }
}
