import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dlr extends dpt implements dlx, dtb {
   public static final MapCodec<dlr> a = b(dlr::new);
   private static final eaf b = eae.I;
   private static final eam<eba> c = eae.bo;
   private static final int d = -1;
   private static final Object2IntMap<eba> f = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(eba.b, 10);
      $$0.put(eba.c, 10);
      $$0.put(eba.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<eba, feq> C = Maps.newEnumMap(
      Map.of(eba.a, dlu.b(16.0, 11.0, 15.0), eba.b, dlu.b(16.0, 11.0, 15.0), eba.c, dlu.b(16.0, 11.0, 13.0), eba.d, fen.a())
   );
   private final Function<dzo, feq> Q;

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   protected dlr(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(e, ja.c).b(c, eba.a));
      this.Q = this.q();
   }

   private Function<dzo, feq> q() {
      Map<ja, feq> $$0 = fen.c(dlu.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fen.a(C.get($$1.c(c)), $$0.get($$1.c(e))), new ear[]{b});
   }

   public static void a(diq $$0, azt $$1, iu $$2, ja $$3) {
      int $$4 = azk.a($$1, 2, 5);
      iu.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dir)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ja.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dls.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ja.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(dzo $$0) {
      return $$0.l() || $$0.a(dlw.J) || $$0.a(dlw.tl);
   }

   protected static boolean a(dir $$0, iu $$1, dzo $$2) {
      return !$$0.t($$1) && o($$2);
   }

   protected static boolean a(diq $$0, iu $$1, evv $$2, ja $$3) {
      dzo $$4 = dlw.tj.m().b(b, Boolean.valueOf($$2.a(evw.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      this.a($$1, $$0, $$2.b(), eba.d, awl.hW);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(b) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.e();
      dzo $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dlw.tk) || $$4.a(axa.bA);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == ja.a && !$$0.a($$1, $$3)) {
         return dlw.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, evw.c, evw.c.a($$1));
         }

         return $$4 == ja.b && $$6.a(this) ? dlw.tk.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      dzo $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      iu $$4 = $$2.d();
      dzo $$5 = $$0.a_($$4);
      if (a((dir)$$0, $$4, $$5)) {
         ja $$6 = $$3.c(e);
         dls.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == eba.a && a($$2, $$3) && !$$1.D($$2)) {
            this.a($$0, $$1, $$2, eba.b, null);
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      } else {
         eba $$4 = $$0.c(c);
         if ($$4 == eba.b) {
            this.a($$0, $$1, $$2, eba.c, awl.hW);
         } else if ($$4 == eba.c) {
            this.a($$0, $$1, $$2, eba.d, awl.hW);
         } else if ($$4 == eba.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dip $$0, iu $$1, awk $$2) {
      float $$3 = azk.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awm.e, 1.0F, $$3);
   }

   private static boolean a(iu $$0, bwa $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dzo $$0, dip $$1, iu $$2, eba $$3, @Nullable awk $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dzo $$0, dip $$1, iu $$2) {
      a($$0, $$1, $$2, eba.a);
      if ($$0.c(c) != eba.a) {
         a($$1, $$2, awl.hX);
      }
   }

   private static void a(dzo $$0, dip $$1, iu $$2, eba $$3) {
      eba $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, eeo.c, $$2);
      }
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return C.get($$0.c(c));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = $$0.q().a_($$0.a().e());
      evv $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dlw.tj) || $$1.a(dlw.tk);
      return this.m().b(b, Boolean.valueOf($$2.a(evw.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, e, c);
   }
}
