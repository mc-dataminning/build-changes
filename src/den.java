import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class den extends dby {
   public static final MapCodec<den> a = b(den::new);
   public static final dpt b = dft.aE;
   public static final dpq c = dpp.h;
   protected static final est d = dby.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final est e = dby.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final est f = esq.a(d, e);
   private static dpe g;

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }

   public static dpe b() {
      if (g == null) {
         g = dpf.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dpd.a(dpi.a))
            .a('^', dpd.a(dpi.a(dca.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.d))))
            .a('>', dpd.a(dpi.a(dca.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.e))))
            .a('v', dpd.a(dpi.a(dca.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.c))))
            .a('<', dpd.a(dpi.a(dca.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ih.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
