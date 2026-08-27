import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvv extends cwb {
   public static final MapCodec<cvv> a = b(cvv::new);
   public static final dka b = djw.P;
   public static final djx c = djw.u;

   @Override
   public MapCodec<cvv> a() {
      return a;
   }

   public cvv(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         dgu $$6 = $$1.c_($$2);
         if ($$6 instanceof dgn) {
            $$3.a((dgn)$$6);
            $$3.a(asb.ar);
            cdy.a($$3, true);
         }

         return bka.b;
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      bjw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      dgu $$4 = $$1.c_($$2);
      if ($$4 instanceof dgn) {
         ((dgn)$$4).m();
      }
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgn($$0, $$1);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dgn) {
            ((dgn)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cia.a($$1.c_($$2));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
