import java.util.function.BiFunction;

public class abx implements zc<abr> {
   public static final yt<wg, abx> a = yt.a(jj.b, abx::b, yr.a(me.h), abx::e, yr.s, abx::f, abx::new);
   private final jj b;
   private final dvn<?> c;
   private final tw d;

   public static abx a(dvl $$0, BiFunction<dvl, kg, tw> $$1) {
      kg $$2 = $$0.i().F_();
      return new abx($$0.aw_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static abx a(dvl $$0) {
      return a($$0, dvl::a);
   }

   private abx(jj $$0, dvn<?> $$1, tw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ze<abx> a() {
      return agk.h;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public jj b() {
      return this.b;
   }

   public dvn<?> e() {
      return this.c;
   }

   public tw f() {
      return this.d;
   }
}
