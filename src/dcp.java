import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dcp extends daa {
   public static final MapCodec<dcp> a = b(dcp::new);
   public static final dnt b = ddv.aE;
   public static final dnq c = dnp.h;
   protected static final eqk d = daa.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eqk e = daa.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eqk f = eqh.a(d, e);
   private static dne g;

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public dcp(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }

   public static dne b() {
      if (g == null) {
         g = dnf.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dnd.a(dni.a))
            .a('^', dnd.a(dni.a(dac.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.d))))
            .a('>', dnd.a(dni.a(dac.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.e))))
            .a('v', dnd.a(dni.a(dac.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.c))))
            .a('<', dnd.a(dni.a(dac.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
