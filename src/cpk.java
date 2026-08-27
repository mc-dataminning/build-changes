import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cpk extends ctg implements cpp, cwo {
   private static final dcs a = dcr.C;
   private static final dcz<ddm> b = dcr.bl;
   private static final int c = -1;
   private static final Object2IntMap<ddm> d = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(ddm.b, 10);
      $$0.put(ddm.c, 10);
      $$0.put(ddm.d, 100);
   });
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 11;
   private static final int h = 13;
   private static final Map<ddm, efb> i = ImmutableMap.of(
      ddm.a,
      cpn.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      ddm.b,
      cpn.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      ddm.c,
      cpn.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      ddm.d,
      eey.a()
   );
   private static final efb j = cpn.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ha, efb> k = ImmutableMap.of(
      ha.c, eey.b(cpl.a, j, eem.e), ha.d, eey.b(cpl.b, j, eem.e), ha.f, eey.b(cpl.c, j, eem.e), ha.e, eey.b(cpl.d, j, eem.e)
   );
   private final Map<dcb, efb> l;

   protected cpk(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(aC, ha.c).a(b, ddm.a));
      this.l = this.a(cpk::h);
   }

   private static efb h(dcb $$0) {
      return eey.a(i.get($$0.c(b)), k.get($$0.c(aC)));
   }

   public static void a(cmn $$0, apf $$1, gu $$2, ha $$3) {
      int $$4 = apa.a($$1, 2, 5);
      gu.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ha.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cpl.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ha.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dcb $$0) {
      return $$0.i() || $$0.a(cpo.G) || $$0.a(cpo.rE);
   }

   protected static boolean a(cmo $$0, gu $$1, dcb $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cmn $$0, gu $$1, dxe $$2, ha $$3) {
      dcb $$4 = cpo.rC.n().a(a, Boolean.valueOf($$2.a(dxf.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
      this.a($$1, $$0, $$2.a(), ddm.d, amh.gu);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(a) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.d();
      dcb $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cpo.rD) || $$4.a(amw.bv);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.a && !$$0.a($$3, $$4)) {
         return cpo.a.n();
      } else {
         if ($$0.c(a)) {
            $$3.a($$4, dxf.c, dxf.c.a($$3));
         }

         return $$1 == ha.b && $$2.a(this) ? cpo.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      dcb $$4 = $$0.a_($$1.c());
      return n($$4);
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      gu $$4 = $$2.c();
      dcb $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ha $$6 = $$3.c(aC);
         cpl.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if (!$$1.B) {
         if ($$0.c(b) == ddm.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, ddm.b, null);
         }
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         ddm $$4 = $$0.c(b);
         if ($$4 == ddm.b) {
            this.a($$0, $$1, $$2, ddm.c, amh.gu);
         } else if ($$4 == ddm.c) {
            this.a($$0, $$1, $$2, ddm.d, amh.gu);
         } else if ($$4 == ddm.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cmm $$0, gu $$1, amg $$2) {
      float $$3 = apa.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, ami.e, 1.0F, $$3);
   }

   private static boolean a(gu $$0, bfj $$1) {
      return $$1.ay() && $$1.dg().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dcb $$0, cmm $$1, gu $$2, ddm $$3, @Nullable amg $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = d.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dcb $$0, cmm $$1, gu $$2) {
      a($$0, $$1, $$2, ddm.a);
      if ($$0.c(b) != ddm.a) {
         a($$1, $$2, amh.gv);
      }
   }

   private static void a(dcb $$0, cmm $$1, gu $$2, ddm $$3) {
      ddm $$4 = $$0.c(b);
      $$1.a($$2, $$0.a(b, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dgl.c, $$2);
      }
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return this.l.get($$0);
   }

   @Override
   public dcb a(cih $$0) {
      dcb $$1 = $$0.q().a_($$0.a().d());
      dxe $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cpo.rC) || $$1.a(cpo.rD);
      return this.n().a(a, Boolean.valueOf($$2.a(dxf.c))).a(aC, $$3 ? $$1.c(aC) : $$0.g().g());
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, aC, b);
   }
}
