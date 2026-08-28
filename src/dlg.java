import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlg extends dey {
   public static final MapCodec<dlg> a = b(dlg::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dtb d = dsr.aZ;
   private static final ImmutableList<kd> e = ImmutableList.of(
      new kd(0, 0, -1), new kd(-1, 0, 0), new kd(0, 0, 1), new kd(1, 0, 0), new kd(-1, 0, -1), new kd(1, 0, -1), new kd(-1, 0, 1), new kd(1, 0, 1)
   );
   private static final ImmutableList<kd> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kd::o).iterator())
      .addAll(e.stream().map(kd::p).iterator())
      .add(new kd(0, 1, 0))
      .build();

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqv.a($$2.B);
      } else {
         return $$5 == bqs.a && a($$4.b(bqs.b)) && m($$1) ? bqv.e : bqv.d;
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$0.c(d) == 0) {
         return bqt.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqt.a($$1.B);
      } else {
         if (!$$1.B) {
            arf $$5 = (arf)$$3;
            if ($$5.T() != $$1.af() || !$$2.equals($$5.R())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.vw, awa.e, 1.0F, 1.0F);
               return bqt.a;
            }
         }

         return bqt.c;
      }
   }

   private static boolean a(cuo $$0) {
      return $$0.a(cur.fu);
   }

   private static boolean m(dsb $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iz $$0, dbx $$1) {
      enu $$2 = $$1.b_($$0);
      if (!$$2.a(awu.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            enu $$4 = $$1.b_($$0.d());
            return !$$4.a(awu.a);
         }
      }
   }

   private void d(dsb $$0, dbx $$1, final iz $$2) {
      $$1.a($$2, false);
      boolean $$3 = je.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awu.a);
      dbq $$5 = new dbq() {
         @Override
         public Optional<Float> a(dbp $$0, dbd $$1, iz $$2x, dsb $$3, enu $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfa.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      evq $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dbx.a.b);
   }

   public static boolean a(dbx $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bst $$0, dbx $$1, iz $$2, dsb $$3) {
      dsb $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dwu.c, $$2, dwu.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.vu, awa.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avz.vt, awa.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(li.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   public static int a(dsb $$0, int $$1) {
      return ayy.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return a($$0, 15);
   }

   public static Optional<evq> a(bsz<?> $$0, dbh $$1, iz $$2) {
      Optional<evq> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<evq> a(bsz<?> $$0, dbh $$1, iz $$2, boolean $$3) {
      iz.a $$4 = new iz.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kd $$5 = (kd)var5.next();
         $$4.g($$2).h($$5);
         evq $$6 = cox.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
