import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhb extends czf {
   public static final MapCodec<dhb> a = b(dhb::new);
   private static final vs d = vs.c("container.stonecutter");
   public static final dmy b = dda.aE;
   protected static final epo c = czf.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atz.ay);
         return bml.b;
      }
   }

   @Nullable
   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return new bmv(($$2x, $$3, $$4) -> new cmt($$2x, $$3, clf.a($$1, $$2)), d);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
