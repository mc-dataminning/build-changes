import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dhu extends dff {
   public static final MapCodec<dhu> a = b(dhu::new);
   public static final dtb b = djb.aE;
   public static final dsy c = dsx.h;
   protected static final ews d = dff.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ews e = dff.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ews f = ewp.a(d, e);
   private static dsm g;

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public dhu(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   public static dsm b() {
      if (g == null) {
         g = dsn.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dsl.a(dsq.a))
            .a('^', dsl.a(dsq.a(dfh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.d))))
            .a('>', dsl.a(dsq.a(dfh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.e))))
            .a('v', dsl.a(dsq.a(dfh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.c))))
            .a('<', dsl.a(dsq.a(dfh.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jf.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
