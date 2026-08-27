import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cza extends dcw {
   public static final MapCodec<cza> a = b(cza::new);
   public static final dnt b = ddv.aE;
   private static final eqk c = daa.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eqk d = daa.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eqk e = daa.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eqk f = daa.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eqk g = daa.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eqk h = daa.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eqk i = daa.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eqk j = eqh.a(c, d, e, f);
   private static final eqk k = eqh.a(c, g, h, i);
   private static final vu l = vu.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cza> a() {
      return a;
   }

   public cza(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.aC);
         return bnc.b;
      }
   }

   @Nullable
   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return new bnm(($$2x, $$3, $$4) -> new clq($$2x, $$3, clz.a($$1, $$2)), l);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      ih $$4 = $$0.c(b);
      return $$4.o() == ih.a.a ? j : k;
   }

   @Override
   protected void a(cfc $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, dmz $$3, cfc $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, cfc $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bnv a(bow $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static dmz e(dmz $$0) {
      if ($$0.a(dac.gS)) {
         return dac.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dac.gT) ? dac.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   public int b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
