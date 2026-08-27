import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class csj extends cwf implements cso, czn {
   private static final dfr a = dfq.C;
   private static final dfy<dgl> b = dfq.bl;
   private static final int c = -1;
   private static final Object2IntMap<dgl> d = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dgl.b, 10);
      $$0.put(dgl.c, 10);
      $$0.put(dgl.d, 100);
   });
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 11;
   private static final int h = 13;
   private static final Map<dgl, ehx> i = ImmutableMap.of(
      dgl.a,
      csm.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgl.b,
      csm.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgl.c,
      csm.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dgl.d,
      ehu.a()
   );
   private static final ehx j = csm.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ha, ehx> k = ImmutableMap.of(
      ha.c, ehu.b(csk.a, j, ehi.e), ha.d, ehu.b(csk.b, j, ehi.e), ha.f, ehu.b(csk.c, j, ehi.e), ha.e, ehu.b(csk.d, j, ehi.e)
   );
   private final Map<dfa, ehx> l;

   protected csj(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(aC, ha.c).a(b, dgl.a));
      this.l = this.a(csj::h);
   }

   private static ehx h(dfa $$0) {
      return ehu.a(i.get($$0.c(b)), k.get($$0.c(aC)));
   }

   public static void a(cpn $$0, aru $$1, gu $$2, ha $$3) {
      int $$4 = arp.a($$1, 2, 5);
      gu.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a((cpo)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ha.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         csk.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ha.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dfa $$0) {
      return $$0.i() || $$0.a(csn.G) || $$0.a(csn.rE);
   }

   protected static boolean a(cpo $$0, gu $$1, dfa $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cpn $$0, gu $$1, ead $$2, ha $$3) {
      dfa $$4 = csn.rC.n().a(a, Boolean.valueOf($$2.a(eae.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
      this.a($$1, $$0, $$2.a(), dgl.d, aow.gu);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(a) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.d();
      dfa $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(csn.rD) || $$4.a(apl.bx);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.a && !$$0.a($$3, $$4)) {
         return csn.a.n();
      } else {
         if ($$0.c(a)) {
            $$3.a($$4, eae.c, eae.c.a($$3));
         }

         return $$1 == ha.b && $$2.a(this) ? csn.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      dfa $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      gu $$4 = $$2.c();
      dfa $$5 = $$0.a_($$4);
      if (a((cpo)$$0, $$4, $$5)) {
         ha $$6 = $$3.c(aC);
         csk.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if (!$$1.B) {
         if ($$0.c(b) == dgl.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dgl.b, null);
         }
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dgl $$4 = $$0.c(b);
         if ($$4 == dgl.b) {
            this.a($$0, $$1, $$2, dgl.c, aow.gu);
         } else if ($$4 == dgl.c) {
            this.a($$0, $$1, $$2, dgl.d, aow.gu);
         } else if ($$4 == dgl.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cpm $$0, gu $$1, aov $$2) {
      float $$3 = arp.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aox.e, 1.0F, $$3);
   }

   private static boolean a(gu $$0, bii $$1) {
      return $$1.aA() && $$1.di().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dfa $$0, cpm $$1, gu $$2, dgl $$3, @Nullable aov $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = d.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dfa $$0, cpm $$1, gu $$2) {
      a($$0, $$1, $$2, dgl.a);
      if ($$0.c(b) != dgl.a) {
         a($$1, $$2, aow.gv);
      }
   }

   private static void a(dfa $$0, cpm $$1, gu $$2, dgl $$3) {
      dgl $$4 = $$0.c(b);
      $$1.a($$2, $$0.a(b, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, djk.c, $$2);
      }
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.l.get($$0);
   }

   @Override
   public dfa a(clg $$0) {
      dfa $$1 = $$0.q().a_($$0.a().d());
      ead $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(csn.rC) || $$1.a(csn.rD);
      return this.n().a(a, Boolean.valueOf($$2.a(eae.c))).a(aC, $$3 ? $$1.c(aC) : $$0.g().g());
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, aC, b);
   }
}
