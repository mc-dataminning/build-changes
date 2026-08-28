import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dex extends diw implements dfd, dmb {
   public static final MapCodec<dex> a = b(dex::new);
   private static final dsu b = dst.C;
   private static final dtb<dto> c = dst.bl;
   private static final int d = -1;
   private static final Object2IntMap<dto> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dto.b, 10);
      $$0.put(dto.c, 10);
      $$0.put(dto.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dto, ewl> j = ImmutableMap.of(
      dto.a,
      dfa.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dto.b,
      dfa.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dto.c,
      dfa.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dto.d,
      ewi.a()
   );
   private static final ewl k = dfa.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewl> l = ImmutableMap.of(
      je.c, ewi.b(dey.b, k, evw.e), je.d, ewi.b(dey.c, k, evw.e), je.f, ewi.b(dey.d, k, evw.e), je.e, ewi.b(dey.e, k, evw.e)
   );
   private final Map<dsd, ewl> m;

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   protected dex(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, je.c).a(c, dto.a));
      this.m = this.a(dex::m);
   }

   private static ewl m(dsd $$0) {
      return ewi.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dca $$0, azh $$1, iz $$2, je $$3) {
      int $$4 = ayz.a($$1, 2, 5);
      iz.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(je.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dey.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(je.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dsd $$0) {
      return $$0.i() || $$0.a(dfc.G) || $$0.a(dfc.sF);
   }

   protected static boolean a(dcb $$0, iz $$1, dsd $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dca $$0, iz $$1, enw $$2, je $$3) {
      dsd $$4 = dfc.sD.o().a(b, Boolean.valueOf($$2.a(enx.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
      this.a($$1, $$0, $$2.a(), dto.d, awa.hB);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(b) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsd $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfc.sE) || $$4.a(awp.by);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfc.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, enx.c, enx.c.a($$3));
         }

         return $$1 == je.b && $$2.a(this) ? dfc.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      dsd $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      iz $$4 = $$2.c();
      dsd $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         je $$6 = $$3.c(aE);
         dey.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dto.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dto.b, null);
         }
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dto $$4 = $$0.c(c);
         if ($$4 == dto.b) {
            this.a($$0, $$1, $$2, dto.c, awa.hB);
         } else if ($$4 == dto.c) {
            this.a($$0, $$1, $$2, dto.d, awa.hB);
         } else if ($$4 == dto.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dbz $$0, iz $$1, avz $$2) {
      float $$3 = ayz.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awb.e, 1.0F, $$3);
   }

   private static boolean a(iz $$0, bsv $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dsd $$0, dbz $$1, iz $$2, dto $$3, @Nullable avz $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dsd $$0, dbz $$1, iz $$2) {
      a($$0, $$1, $$2, dto.a);
      if ($$0.c(c) != dto.a) {
         a($$1, $$2, awa.hC);
      }
   }

   private static void a(dsd $$0, dbz $$1, iz $$2, dto $$3) {
      dto $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dww.c, $$2);
      }
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.m.get($$0);
   }

   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = $$0.q().a_($$0.a().d());
      enw $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfc.sD) || $$1.a(dfc.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(enx.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, aE, c);
   }
}
