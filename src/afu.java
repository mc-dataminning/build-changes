import java.util.Set;

public record afu(int b, bvv c, Set<bvw> d, boolean e) implements yw<abl> {
   public static final yn<vl, afu> a = yn.a(yl.h, afu::b, bvv.a, afu::e, bvw.m, afu::f, yl.b, afu::g, afu::new);

   public static afu a(int $$0, bvv $$1, Set<bvw> $$2, boolean $$3) {
      return new afu($$0, $$1, $$2, $$3);
   }

   @Override
   public yy<afu> a() {
      return age.bd;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public bvv e() {
      return this.c;
   }

   public Set<bvw> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
