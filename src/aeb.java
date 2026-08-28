import java.util.Set;

public record aeb(int b, bxm c, Set<bxn> d) implements zd<abs> {
   public static final yu<vs, aeb> a = yu.a(ys.h, aeb::b, bxm.a, aeb::e, bxn.m, aeb::f, aeb::new);

   public static aeb a(int $$0, bxm $$1, Set<bxn> $$2) {
      return new aeb($$0, $$1, $$2);
   }

   @Override
   public zf<aeb> a() {
      return agl.ai;
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
}
