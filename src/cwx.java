import java.util.function.ToIntFunction;

public class cwx extends csm implements czn {
   public static final int a = 15;
   public static final dga b = dfq.aP;
   public static final dfr c = dfq.C;
   public static final ToIntFunction<dfa> d = $$0 -> $$0.c(b);

   public cwx(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(15)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b, c);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if (!$$1.B && $$3.gn()) {
         $$1.a($$2, $$0.a(b), 2);
         return bgq.a;
      } else {
         return bgq.b;
      }
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return $$3.a(cjb.hg) ? ehu.b() : ehu.a();
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return true;
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.a;
   }

   @Override
   public float b(dfa $$0, cos $$1, gu $$2) {
      return 1.0F;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(c) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(b));
   }

   public static ciy a(ciy $$0, int $$1) {
      if ($$1 != 15) {
         qr $$2 = new qr();
         $$2.a(b.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
