import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlq extends dfi {
   public static final MapCodec<dlq> a = b(dlq::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dtl d = dtb.aZ;
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
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqj.a($$2.B);
      } else {
         return $$5 == bqg.a && a($$4.b(bqg.b)) && m($$1) ? bqj.e : bqj.d;
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$0.c(d) == 0) {
         return bqh.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqh.a($$1.B);
      } else {
         if (!$$1.B) {
            aqn $$5 = (aqn)$$3;
            if ($$5.U() != $$1.af() || !$$2.equals($$5.S())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.vz, avi.e, 1.0F, 1.0F);
               return bqh.a;
            }
         }

         return bqh.c;
      }
   }

   private static boolean a(cud $$0) {
      return $$0.a(cug.fu);
   }

   private static boolean m(dsl $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ja $$0, dcg $$1) {
      eoj $$2 = $$1.b_($$0);
      if (!$$2.a(awc.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eoj $$4 = $$1.b_($$0.d());
            return !$$4.a(awc.a);
         }
      }
   }

   private void d(dsl $$0, dcg $$1, final ja $$2) {
      $$1.a($$2, false);
      boolean $$3 = jf.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awc.a);
      dbz $$5 = new dbz() {
         @Override
         public Optional<Float> a(dby $$0, dbm $$1, ja $$2x, dsl $$3, eoj $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfk.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ewh $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dcg.a.b);
   }

   public static boolean a(dcg $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsh $$0, dcg $$1, ja $$2, dsl $$3) {
      dsl $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dxh.c, $$2, dxh.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.vx, avi.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avh.vw, avi.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lj.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   public static int a(dsl $$0, int $$1) {
      return ayg.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return a($$0, 15);
   }

   public static Optional<ewh> a(bsn<?> $$0, dbq $$1, ja $$2) {
      Optional<ewh> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ewh> a(bsn<?> $$0, dbq $$1, ja $$2, boolean $$3) {
      ja.a $$4 = new ja.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ke $$5 = (ke)var5.next();
         $$4.g($$2).h($$5);
         ewh $$6 = col.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
