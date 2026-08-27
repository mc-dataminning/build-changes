import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyf extends dcb {
   public static final MapCodec<cyf> a = b(cyf::new);
   public static final dmy b = dda.aE;
   private static final epo c = czf.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final epo d = czf.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final epo e = czf.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final epo f = czf.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final epo g = czf.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final epo h = czf.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final epo i = czf.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final epo j = epl.a(c, d, e, f);
   private static final epo k = epl.a(c, g, h, i);
   private static final vs l = vs.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cyf> a() {
      return a;
   }

   public cyf(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atz.aC);
         return bml.b;
      }
   }

   @Nullable
   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return new bmv(($$2x, $$3, $$4) -> new ckw($$2x, $$3, clf.a($$1, $$2)), l);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      ih $$4 = $$0.c(b);
      return $$4.o() == ih.a.a ? j : k;
   }

   @Override
   protected void a(cek $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, dme $$3, cek $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, cek $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bne a(bof $$0) {
      return $$0.dK().b($$0);
   }

   @Nullable
   public static dme e(dme $$0) {
      if ($$0.a(czh.gS)) {
         return czh.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(czh.gT) ? czh.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   public int b(dme $$0, cvk $$1, ib $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
