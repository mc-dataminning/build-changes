import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dew extends dch {
   public static final MapCodec<dew> a = b(dew::new);
   public static final dqc b = dgc.aE;
   public static final dpz c = dpy.h;
   protected static final etc d = dch.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final etc e = dch.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final etc f = esz.a(d, e);
   private static dpn g;

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }

   public static dpn b() {
      if (g == null) {
         g = dpo.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dpm.a(dpr.a))
            .a('^', dpm.a(dpr.a(dcj.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ij.d))))
            .a('>', dpm.a(dpr.a(dcj.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ij.e))))
            .a('v', dpm.a(dpr.a(dcj.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ij.c))))
            .a('<', dpm.a(dpr.a(dcj.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ij.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
