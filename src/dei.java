import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dei extends die {
   public static final MapCodec<dei> a = b(dei::new);
   public static final dtf b = dje.aE;
   private static final exa c = dfi.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final exa d = dfi.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final exa e = dfi.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final exa f = dfi.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final exa g = dfi.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final exa h = dfi.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final exa i = dfi.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final exa j = ewx.a(c, d, e, f);
   private static final exa k = ewx.a(c, g, h, i);
   private static final wu l = wu.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   public dei(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aC);
         return bqh.c;
      }
   }

   @Nullable
   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return new bqr(($$2x, $$3, $$4) -> new cpk($$2x, $$3, cpu.a($$1, $$2)), l);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      jf $$4 = $$0.c(b);
      return $$4.o() == jf.a.a ? j : k;
   }

   @Override
   protected void a(ciu $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, dsl $$3, ciu $$4) {
      if (!$$4.aY()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dcg $$0, ja $$1, ciu $$2) {
      if (!$$2.aY()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bra a(bsh $$0) {
      return $$0.dS().b($$0);
   }

   @Nullable
   public static dsl e(dsl $$0) {
      if ($$0.a(dfk.gS)) {
         return dfk.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dfk.gT) ? dfk.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   public int b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
