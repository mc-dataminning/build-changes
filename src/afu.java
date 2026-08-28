import java.util.Set;

public record afu(int b, bvu c, Set<bvv> d, boolean e) implements yw<abl> {
   public static final yn<vl, afu> a = yn.a(yl.h, afu::b, bvu.a, afu::e, bvv.m, afu::f, yl.b, afu::g, afu::new);

   public static afu a(int $$0, bvu $$1, Set<bvv> $$2, boolean $$3) {
      return new afu($$0, $$1, $$2, $$3);
   }

   @Override
   public yy<afu> a() {
      return age.bd;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public bvu e() {
      return this.c;
   }

   public Set<bvv> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
