import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public class cun extends crz {
   public static final dfu a = cul.a;
   public static final dfr b = dfq.A;
   private static final Map<cit, ih> c = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ig()));
   private static final int d = 4;

   public static void a(cpl $$0, ih $$1) {
      c.put($$0.k(), $$1);
   }

   protected cun(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcm $$6 = $$1.c_($$2);
         if ($$6 instanceof ddd) {
            $$3.a((ddd)$$6);
            if ($$6 instanceof dde) {
               $$3.a(apg.ac);
            } else {
               $$3.a(apg.ae);
            }
         }

         return bgq.b;
      }
   }

   protected void a(akk $$0, gu $$1) {
      gw $$2 = new gw($$0, $$1);
      ddd $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
         $$0.a(djk.a, $$1, djk.a.a($$3.q()));
      } else {
         ciy $$5 = $$3.a($$4);
         ih $$6 = this.a($$5);
         if ($$6 != ih.b) {
            $$3.a($$4, $$6.dispense($$2, $$5));
         }
      }
   }

   protected ih a(ciy $$0) {
      return c.get($$0.d());
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.c());
      boolean $$7 = $$0.c(b);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 4);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 4);
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      this.a($$1, $$2);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddd($$0, $$1);
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.d().g());
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof ddd) {
            ((ddd)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof ddd) {
            bgm.a($$1, $$2, (ddd)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public static ho a(gv $$0) {
      ha $$1 = $$0.e().c(a);
      double $$2 = $$0.a() + 0.7 * (double)$$1.j();
      double $$3 = $$0.b() + 0.7 * (double)$$1.k();
      double $$4 = $$0.c() + 0.7 * (double)$$1.l();
      return new hp($$2, $$3, $$4);
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return cee.a($$1.c_($$2));
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }
}
