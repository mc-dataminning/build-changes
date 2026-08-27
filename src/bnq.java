import com.google.common.collect.ImmutableMap;

public class bnq extends bmp<bla> {
   public static final int c = 100;
   private final bib d;
   private final aqm e;

   public bnq(bib $$0, aqm $$1) {
      super(ImmutableMap.of(btz.n, bua.c, btz.S, bua.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ama $$0, bla $$1, long $$2) {
      return !$$1.aA();
   }

   protected void b(ama $$0, bla $$1, long $$2) {
      $$1.p(true);
      $$1.b(blk.g);
   }

   protected void c(ama $$0, bla $$1, long $$2) {
      if ($$1.aA()) {
         $$1.f($$1.do().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aqo.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(blk.a);
      $$1.dN().b(btz.S);
      $$1.dN().a(btz.R, this.d.a($$0.z));
   }
}
