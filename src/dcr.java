import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dcr extends dac {
   public static final MapCodec<dcr> a = b(dcr::new);
   public static final dnv b = ddx.aE;
   public static final dns c = dnr.h;
   protected static final eqm d = dac.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eqm e = dac.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eqm f = eqj.a(d, e);
   private static dng g;

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   public dcr(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }

   public static dng b() {
      if (g == null) {
         g = dnh.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dnf.a(dnk.a))
            .a('^', dnf.a(dnk.a(dae.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.d))))
            .a('>', dnf.a(dnk.a(dae.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.e))))
            .a('v', dnf.a(dnk.a(dae.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.c))))
            .a('<', dnf.a(dnk.a(dae.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
