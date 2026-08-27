import java.util.function.ToIntFunction;

public class cvt extends cxk implements cso, czn {
   private static final dfr b = dfq.C;
   private final cxl c = new cxl(this);

   public cvt(dez.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dfa> b(int $$0) {
      return $$1 -> cxk.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      return !$$1.n().a(cjb.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return ha.a().anyMatch($$3 -> this.c.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      this.c.a($$3, $$0, $$2, $$1);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(b) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return $$0.u().c();
   }

   @Override
   public cxl b() {
      return this.c;
   }
}
