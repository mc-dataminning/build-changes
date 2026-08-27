import java.util.function.BiFunction;

public class abh implements yp<aba> {
   public static final yg<vt, abh> a = yg.a(id.b, abh::b, ye.a(ku.h), abh::e, ye.o, abh::f, abh::new);
   private final id b;
   private final dmq<?> c;
   private final to d;

   public static abh a(dmo $$0, BiFunction<dmo, jb, to> $$1) {
      jb $$2 = $$0.i().H_();
      return new abh($$0.az_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static abh a(dmo $$0) {
      return a($$0, dmo::a);
   }

   private abh(id $$0, dmq<?> $$1, to $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public yr<abh> a() {
      return afl.i;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public id b() {
      return this.b;
   }

   public dmq<?> e() {
      return this.c;
   }

   public to f() {
      return this.d;
   }
}
