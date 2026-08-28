import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dli extends dfa {
   public static final MapCodec<dli> a = b(dli::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dtd d = dst.aZ;
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
   public MapCodec<dli> a() {
      return a;
   }

   public dli(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqx.a($$2.B);
      } else {
         return $$5 == bqu.a && a($$4.b(bqu.b)) && m($$1) ? bqx.e : bqx.d;
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$0.c(d) == 0) {
         return bqv.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqv.a($$1.B);
      } else {
         if (!$$1.B) {
            arg $$5 = (arg)$$3;
            if ($$5.T() != $$1.af() || !$$2.equals($$5.R())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vw, awb.e, 1.0F, 1.0F);
               return bqv.a;
            }
         }

         return bqv.c;
      }
   }

   private static boolean a(cuq $$0) {
      return $$0.a(cut.fu);
   }

   private static boolean m(dsd $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iz $$0, dbz $$1) {
      enw $$2 = $$1.b_($$0);
      if (!$$2.a(awv.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            enw $$4 = $$1.b_($$0.d());
            return !$$4.a(awv.a);
         }
      }
   }

   private void d(dsd $$0, dbz $$1, final iz $$2) {
      $$1.a($$2, false);
      boolean $$3 = je.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awv.a);
      dbs $$5 = new dbs() {
         @Override
         public Optional<Float> a(dbr $$0, dbf $$1, iz $$2x, dsd $$3, enw $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfc.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      evs $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dbz.a.b);
   }

   public static boolean a(dbz $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsv $$0, dbz $$1, iz $$2, dsd $$3) {
      dsd $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dww.c, $$2, dww.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vu, awb.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awa.vt, awb.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(li.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   public static int a(dsd $$0, int $$1) {
      return ayz.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return a($$0, 15);
   }

   public static Optional<evs> a(btb<?> $$0, dbj $$1, iz $$2) {
      Optional<evs> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<evs> a(btb<?> $$0, dbj $$1, iz $$2, boolean $$3) {
      iz.a $$4 = new iz.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kd $$5 = (kd)var5.next();
         $$4.g($$2).h($$5);
         evs $$6 = coz.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
