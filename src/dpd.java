import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dpd extends dmm {
   public static final MapCodec<dpd> a = b(dpd::new);
   public static final ebm<jb> b = dqn.e;
   public static final ebf c = ebe.k;
   private static final ffr d = dmm.b(16.0, 0.0, 13.0);
   private static final ffr e = ffo.a(d, dmm.b(8.0, 13.0, 16.0));
   private static eat f;

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   public static eat b() {
      if (f == null) {
         f = eau.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', eas.a(eax.a))
            .a('^', eas.a(eax.a(dmo.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.d))))
            .a('>', eas.a(eax.a(dmo.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.e))))
            .a('v', eas.a(eax.a(dmo.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.c))))
            .a('<', eas.a(eax.a(dmo.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
