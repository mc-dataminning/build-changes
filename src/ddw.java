import com.mojang.serialization.MapCodec;

public class ddw extends dda {
   public static final MapCodec<ddw> a = b(ddw::new);
   private static final vs b = vs.c("container.loom");

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   protected ddw(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atz.ax);
         return bml.b;
      }
   }

   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return new bmv(($$2x, $$3, $$4) -> new clz($$2x, $$3, clf.a($$1, $$2)), b);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(aE);
   }
}
