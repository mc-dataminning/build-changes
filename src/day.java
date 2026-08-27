import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class day extends deu {
   public static final MapCodec<day> a = b(day::new);
   public static final dpt b = dft.aE;
   private static final est c = dby.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final est d = dby.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final est e = dby.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final est f = dby.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final est g = dby.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final est h = dby.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final est i = dby.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final est j = esq.a(c, d, e, f);
   private static final est k = esq.a(c, g, h, i);
   private static final wg l = wg.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<day> a() {
      return a;
   }

   public day(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.g().h());
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auw.aC);
         return boa.b;
      }
   }

   @Nullable
   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return new bok(($$2x, $$3, $$4) -> new cmr($$2x, $$3, cna.a($$1, $$2)), l);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      ih $$4 = $$0.c(b);
      return $$4.o() == ih.a.a ? j : k;
   }

   @Override
   protected void a(cgc $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, doz $$3, cgc $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cyx $$0, ib $$1, cgc $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bot a(bpv $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static doz e(doz $$0) {
      if ($$0.a(dca.gS)) {
         return dca.gT.n().a(b, $$0.c(b));
      } else {
         return $$0.a(dca.gT) ? dca.gU.n().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   public int b(doz $$0, cyd $$1, ib $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
