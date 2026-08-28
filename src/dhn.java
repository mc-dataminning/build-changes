import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dhn extends dey {
   public static final MapCodec<dhn> a = b(dhn::new);
   public static final dsv b = diu.aE;
   public static final dss c = dsr.h;
   protected static final ewj d = dey.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ewj e = dey.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ewj f = ewg.a(d, e);
   private static dsg g;

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public dhn(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   public static dsg b() {
      if (g == null) {
         g = dsh.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dsf.a(dsk.a))
            .a('^', dsf.a(dsk.a(dfa.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.d))))
            .a('>', dsf.a(dsk.a(dfa.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.e))))
            .a('v', dsf.a(dsk.a(dfa.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.c))))
            .a('<', dsf.a(dsk.a(dfa.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
