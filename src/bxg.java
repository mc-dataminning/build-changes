import com.google.common.collect.ImmutableMap;

public class bxg extends bwf<bup> {
   public static final int c = 100;
   private final brd d;
   private final awf e;

   public bxg(brd $$0, awf $$1) {
      super(ImmutableMap.of(cdq.n, cdr.c, cdq.T, cdr.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(arj $$0, bup $$1, long $$2) {
      return !$$1.aH();
   }

   protected void b(arj $$0, bup $$1, long $$2) {
      $$1.r(true);
      $$1.b(buz.g);
   }

   protected void c(arj $$0, bup $$1, long $$2) {
      if ($$1.aH()) {
         $$1.h($$1.dv().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, awh.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(buz.a);
      $$1.dY().b(cdq.T);
      $$1.dY().a(cdq.S, this.d.a($$0.z));
   }
}
