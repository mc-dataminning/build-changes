import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dpi extends dmr {
   public static final MapCodec<dpi> a = b(dpi::new);
   public static final ebr<jb> b = dqs.e;
   public static final ebk c = ebj.k;
   private static final ffw d = dmr.b(16.0, 0.0, 13.0);
   private static final ffw e = fft.a(d, dmr.b(8.0, 13.0, 16.0));
   private static eay f;

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   public dpi(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   public static eay b() {
      if (f == null) {
         f = eaz.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', eax.a(ebc.a))
            .a('^', eax.a(ebc.a(dmt.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.d))))
            .a('>', eax.a(ebc.a(dmt.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.e))))
            .a('v', eax.a(ebc.a(dmt.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.c))))
            .a('<', eax.a(ebc.a(dmt.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
