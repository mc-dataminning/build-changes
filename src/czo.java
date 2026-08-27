public class czo extends crj {
   public static final int a = dgg.a();
   private static final int e = a + 1;
   public static final dga b = dfq.ba;
   protected static final ehx c = csm.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   protected static final ehx d = csm.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);

   protected czo(czo.a $$0, dez.d $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.a() == czo.b.f ? d : c;
   }

   @Override
   public ehx f(dfa $$0, cos $$1, gu $$2) {
      return ehu.a();
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(b, Integer.valueOf(dgg.a($$0.i())));
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), e)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), e)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }

   public interface a {
   }

   public static enum b implements czo.a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
