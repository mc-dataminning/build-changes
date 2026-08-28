import java.util.Set;

public record afu(int b, bvt c, Set<bvu> d, boolean e) implements yw<abl> {
   public static final yn<vl, afu> a = yn.a(yl.h, afu::b, bvt.a, afu::e, bvu.m, afu::f, yl.b, afu::g, afu::new);

   public static afu a(int $$0, bvt $$1, Set<bvu> $$2, boolean $$3) {
      return new afu($$0, $$1, $$2, $$3);
   }

   @Override
   public yy<afu> a() {
      return age.bd;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public bvt e() {
      return this.c;
   }

   public Set<bvu> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
