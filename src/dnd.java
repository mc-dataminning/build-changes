import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dnd extends dkm {
   public static final MapCodec<dnd> a = b(dnd::new);
   public static final dys<jm> b = dok.aF;
   public static final dym c = dyl.h;
   protected static final fcs d = dkm.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fcs e = dkm.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fcs f = fcp.a(d, e);
   private static dya g;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   public static dya b() {
      if (g == null) {
         g = dyb.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dxz.a(dye.a))
            .a('^', dxz.a(dye.a(dko.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.d))))
            .a('>', dxz.a(dye.a(dko.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.e))))
            .a('v', dxz.a(dye.a(dko.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.c))))
            .a('<', dxz.a(dye.a(dko.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
