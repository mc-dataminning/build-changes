import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlf extends dex {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dta d = dsq.aZ;
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
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqu.a($$2.B);
      } else {
         return $$5 == bqr.a && a($$4.b(bqr.b)) && m($$1) ? bqu.e : bqu.d;
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$0.c(d) == 0) {
         return bqs.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqs.a($$1.B);
      } else {
         if (!$$1.B) {
            arf $$5 = (arf)$$3;
            if ($$5.T() != $$1.af() || !$$2.equals($$5.R())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.vw, awa.e, 1.0F, 1.0F);
               return bqs.a;
            }
         }

         return bqs.c;
      }
   }

   private static boolean a(cun $$0) {
      return $$0.a(cuq.fu);
   }

   private static boolean m(dsa $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iz $$0, dbw $$1) {
      ent $$2 = $$1.b_($$0);
      if (!$$2.a(awu.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ent $$4 = $$1.b_($$0.d());
            return !$$4.a(awu.a);
         }
      }
   }

   private void d(dsa $$0, dbw $$1, final iz $$2) {
      $$1.a($$2, false);
      boolean $$3 = je.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awu.a);
      dbp $$5 = new dbp() {
         @Override
         public Optional<Float> a(dbo $$0, dbc $$1, iz $$2x, dsa $$3, ent $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dez.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      evp $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dbw.a.b);
   }

   public static boolean a(dbw $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bss $$0, dbw $$1, iz $$2, dsa $$3) {
      dsa $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dwt.c, $$2, dwt.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.vu, awa.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
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
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   public static int a(dsa $$0, int $$1) {
      return ayx.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return a($$0, 15);
   }

   public static Optional<evp> a(bsy<?> $$0, dbg $$1, iz $$2) {
      Optional<evp> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<evp> a(bsy<?> $$0, dbg $$1, iz $$2, boolean $$3) {
      iz.a $$4 = new iz.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kd $$5 = (kd)var5.next();
         $$4.g($$2).h($$5);
         evp $$6 = cow.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
