import com.mojang.serialization.MapCodec;

public class dme extends dli {
   public static final MapCodec<dme> a = b(dme::new);
   private static final xe b = xe.c("container.loom");

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   protected dme(dur.d $$0) {
      super($$0);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awq.ax);
      }

      return brs.a;
   }

   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return new bsa(($$2x, $$3, $$4) -> new csg($$2x, $$3, crm.a($$1, $$2)), b);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF);
   }
}
