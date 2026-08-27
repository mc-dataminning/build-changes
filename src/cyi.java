import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyi extends cwb {
   public static final MapCodec<cyi> a = b(cyi::new);
   public static final djx b = djw.bx;
   public static final djx c = djw.A;
   private static final dke<ie> d = djw.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cqc g = new cqc(10);

   public cyi(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ie.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<cyi> a() {
      return a;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return $$1.c_($$2) instanceof dhi $$4 ? $$4.w() : 0;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dgu $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0.B ? null : a($$2, dgw.P, dhi::a);
   }

   private void a(@Nullable dgu $$0, boolean $$1) {
      if ($$0 instanceof dhi $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      dhi $$2 = new dhi($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public djg a(cpg $$0) {
      ic $$1 = $$0.d().g();

      ic $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ic.b;
      };
      return this.o().a(d, ie.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A() && $$0.c_($$1) instanceof dhi $$5) {
         $$5.a($$4.y());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      bjw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         dgu $$6 = $$1.c_($$2);
         if ($$6 instanceof dhi) {
            $$3.a((dhi)$$6);
         }

         return bka.b;
      }
   }

   protected void a(djg $$0, and $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhi $$3) {
         Optional<cps> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            $$3.d(6);
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            cps $$6 = $$5.get();
            cmx $$7 = $$6.a($$3, $$1.I_());
            $$7.a($$1);
            this.a($$1, $$2, $$3, $$7, $$0);
            $$6.a($$3).forEach($$4x -> this.a($$1, $$2, $$3, $$4x, $$0));
            $$3.k().forEach($$0x -> {
               if (!$$0x.b()) {
                  $$0x.h(1);
               }
            });
            $$3.e();
         }
      }
   }

   public static Optional<cps> a(cto $$0, ciq $$1) {
      return g.a($$0, $$1);
   }

   private void a(cto $$0, hx $$1, dhi $$2, cmx $$3, djg $$4) {
      ic $$5 = $$4.c(d).a();
      bjt $$6 = dht.a($$0, $$1.a($$5));
      cmx $$7 = $$3.p();
      if ($$6 != null && ($$6 instanceof dhi || $$3.L() > $$6.ak_())) {
         while (!$$7.b()) {
            cmx $$8 = $$7.c(1);
            cmx $$9 = dht.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.L();
            $$7 = dht.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.L()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         els $$11 = els.b($$1).a($$5, 0.7);
         ji.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(d, c, b);
   }
}
