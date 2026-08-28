import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dln extends dff {
   public static final MapCodec<dln> a = b(dln::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dth d = dsx.aZ;
   private static final ImmutableList<ke> e = ImmutableList.of(
      new ke(0, 0, -1), new ke(-1, 0, 0), new ke(0, 0, 1), new ke(1, 0, 0), new ke(-1, 0, -1), new ke(1, 0, -1), new ke(-1, 0, 1), new ke(1, 0, 1)
   );
   private static final ImmutableList<ke> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(ke::o).iterator())
      .addAll(e.stream().map(ke::p).iterator())
      .add(new ke(0, 1, 0))
      .build();

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqf.a($$2.B);
      } else {
         return $$5 == bqc.a && a($$4.b(bqc.b)) && m($$1) ? bqf.e : bqf.d;
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$0.c(d) == 0) {
         return bqd.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqd.a($$1.B);
      } else {
         if (!$$1.B) {
            aql $$5 = (aql)$$3;
            if ($$5.T() != $$1.af() || !$$2.equals($$5.R())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avf.vz, avg.e, 1.0F, 1.0F);
               return bqd.a;
            }
         }

         return bqd.c;
      }
   }

   private static boolean a(cua $$0) {
      return $$0.a(cud.fu);
   }

   private static boolean m(dsh $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ja $$0, dcd $$1) {
      eob $$2 = $$1.b_($$0);
      if (!$$2.a(awa.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eob $$4 = $$1.b_($$0.d());
            return !$$4.a(awa.a);
         }
      }
   }

   private void d(dsh $$0, dcd $$1, final ja $$2) {
      $$1.a($$2, false);
      boolean $$3 = jf.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awa.a);
      dbw $$5 = new dbw() {
         @Override
         public Optional<Float> a(dbv $$0, dbj $$1, ja $$2x, dsh $$3, eob $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfh.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      evz $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dcd.a.b);
   }

   public static boolean a(dcd $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsd $$0, dcd $$1, ja $$2, dsh $$3) {
      dsh $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dxa.c, $$2, dxa.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avf.vx, avg.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avf.vw, avg.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lj.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   public static int a(dsh $$0, int $$1) {
      return aye.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return a($$0, 15);
   }

   public static Optional<evz> a(bsj<?> $$0, dbn $$1, ja $$2) {
      Optional<evz> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<evz> a(bsj<?> $$0, dbn $$1, ja $$2, boolean $$3) {
      ja.a $$4 = new ja.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ke $$5 = (ke)var5.next();
         $$4.g($$2).h($$5);
         evz $$6 = coh.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
