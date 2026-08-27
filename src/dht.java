import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dht extends dfc {
   public static final MapCodec<dht> a = b(dht::new);
   public static final dtw b = djc.aE;
   public static final dtt c = dts.h;
   protected static final exn d = dfc.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final exn e = dfc.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final exn f = exk.a(d, e);
   private static dth g;

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }

   public static dth b() {
      if (g == null) {
         g = dti.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dtg.a(dtl.a))
            .a('^', dtg.a(dtl.a(dfe.gq).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(iw.d))))
            .a('>', dtg.a(dtl.a(dfe.gq).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(iw.e))))
            .a('v', dtg.a(dtl.a(dfe.gq).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(iw.c))))
            .a('<', dtg.a(dtl.a(dfe.gq).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(iw.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
