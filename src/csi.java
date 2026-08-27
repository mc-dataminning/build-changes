import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class csi extends cwe implements csn, czm {
   private static final dfq a = dfp.C;
   private static final dfx<dgk> b = dfp.bl;
   private static final int c = -1;
   private static final Object2IntMap<dgk> d = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dgk.b, 10);
      $$0.put(dgk.c, 10);
      $$0.put(dgk.d, 100);
   });
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 11;
   private static final int h = 13;
   private static final Map<dgk, ehw> i = ImmutableMap.of(
      dgk.a,
      csl.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgk.b,
      csl.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgk.c,
      csl.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dgk.d,
      eht.a()
   );
   private static final ehw j = csl.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ha, ehw> k = ImmutableMap.of(
      ha.c, eht.b(csj.a, j, ehh.e), ha.d, eht.b(csj.b, j, ehh.e), ha.f, eht.b(csj.c, j, ehh.e), ha.e, eht.b(csj.d, j, ehh.e)
   );
   private final Map<dez, ehw> l;

   protected csi(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(aC, ha.c).a(b, dgk.a));
      this.l = this.a(csi::h);
   }

   private static ehw h(dez $$0) {
      return eht.a(i.get($$0.c(b)), k.get($$0.c(aC)));
   }

   public static void a(cpm $$0, aru $$1, gu $$2, ha $$3) {
      int $$4 = arp.a($$1, 2, 5);
      gu.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a((cpn)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ha.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         csj.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ha.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dez $$0) {
      return $$0.i() || $$0.a(csm.G) || $$0.a(csm.rE);
   }

   protected static boolean a(cpn $$0, gu $$1, dez $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cpm $$0, gu $$1, eac $$2, ha $$3) {
      dez $$4 = csm.rC.n().a(a, Boolean.valueOf($$2.a(ead.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cpl $$0, dez $$1, egz $$2, cce $$3) {
      this.a($$1, $$0, $$2.a(), dgk.d, aow.gu);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(a) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.d();
      dez $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(csm.rD) || $$4.a(apl.bx);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1 == ha.a && !$$0.a($$3, $$4)) {
         return csm.a.n();
      } else {
         if ($$0.c(a)) {
            $$3.a($$4, ead.c, ead.c.a($$3));
         }

         return $$1 == ha.b && $$2.a(this) ? csm.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      dez $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      gu $$4 = $$2.c();
      dez $$5 = $$0.a_($$4);
      if (a((cpn)$$0, $$4, $$5)) {
         ha $$6 = $$3.c(aC);
         csj.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if (!$$1.B) {
         if ($$0.c(b) == dgk.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dgk.b, null);
         }
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dgk $$4 = $$0.c(b);
         if ($$4 == dgk.b) {
            this.a($$0, $$1, $$2, dgk.c, aow.gu);
         } else if ($$4 == dgk.c) {
            this.a($$0, $$1, $$2, dgk.d, aow.gu);
         } else if ($$4 == dgk.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cpl $$0, gu $$1, aov $$2) {
      float $$3 = arp.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aox.e, 1.0F, $$3);
   }

   private static boolean a(gu $$0, bii $$1) {
      return $$1.aA() && $$1.di().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dez $$0, cpl $$1, gu $$2, dgk $$3, @Nullable aov $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = d.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dez $$0, cpl $$1, gu $$2) {
      a($$0, $$1, $$2, dgk.a);
      if ($$0.c(b) != dgk.a) {
         a($$1, $$2, aow.gv);
      }
   }

   private static void a(dez $$0, cpl $$1, gu $$2, dgk $$3) {
      dgk $$4 = $$0.c(b);
      $$1.a($$2, $$0.a(b, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, djj.c, $$2);
      }
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.l.get($$0);
   }

   @Override
   public dez a(clf $$0) {
      dez $$1 = $$0.q().a_($$0.a().d());
      eac $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(csm.rC) || $$1.a(csm.rD);
      return this.n().a(a, Boolean.valueOf($$2.a(ead.c))).a(aC, $$3 ? $$1.c(aC) : $$0.g().g());
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, aC, b);
   }
}
