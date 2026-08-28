import java.util.Set;

public record aga(int b, bxm c, Set<bxn> d, boolean e) implements zd<abs> {
   public static final yu<vs, aga> a = yu.a(ys.h, aga::b, bxm.a, aga::e, bxn.m, aga::f, ys.b, aga::g, aga::new);

   public static aga a(int $$0, bxm $$1, Set<bxn> $$2, boolean $$3) {
      return new aga($$0, $$1, $$2, $$3);
   }

   @Override
   public zf<aga> a() {
      return agl.bd;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public bxm e() {
      return this.c;
   }

   public Set<bxn> f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }
}
