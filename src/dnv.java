import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnv extends dhm {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dvs d = dvi.aZ;
   private static final ImmutableList<kj> e = ImmutableList.of(
      new kj(0, 0, -1), new kj(-1, 0, 0), new kj(0, 0, 1), new kj(1, 0, 0), new kj(-1, 0, -1), new kj(1, 0, -1), new kj(-1, 0, 1), new kj(1, 0, 1)
   );
   private static final ImmutableList<kj> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kj::p).iterator())
      .addAll(e.stream().map(kj::q).iterator())
      .add(new kj(0, 1, 0))
      .build();

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return brs.a;
      } else {
         return (brs)($$5 == brr.a && a($$4.b(brr.b)) && o($$1) ? brs.e : brs.f);
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$0.c(d) == 0) {
         return brs.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return brs.a;
      } else {
         if (!$$1.B) {
            ark $$5 = (ark)$$3;
            if ($$5.W() != $$1.ag() || !$$2.equals($$5.U())) {
               $$5.a($$1.ag(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awg.vA, awh.e, 1.0F, 1.0F);
               return brs.b;
            }
         }

         return brs.c;
      }
   }

   private static boolean a(cvs $$0) {
      return $$0.a(cvw.fu);
   }

   private static boolean o(dus $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(jf $$0, dej $$1) {
      eqt $$2 = $$1.b_($$0);
      if (!$$2.a(axb.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eqt $$4 = $$1.b_($$0.e());
            return !$$4.a(axb.a);
         }
      }
   }

   private void d(dus $$0, dej $$1, final jf $$2) {
      $$1.a($$2, false);
      boolean $$3 = jk.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axb.a);
      dec $$5 = new dec() {
         @Override
         public Optional<Float> a(deb $$0, ddo $$1, jf $$2x, dus $$3, eqt $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dho.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eyw $$6 = $$2.b();
      $$1.a(null, $$1.ak().a($$6), $$5, $$6, 5.0F, true, dej.a.b);
   }

   public static boolean a(dej $$0) {
      return $$0.C_().m();
   }

   public static void a(@Nullable btr $$0, dej $$1, jf $$2, dus $$3) {
      dus $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dzp.c, $$2, dzp.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awg.vy, awh.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awg.vx, awh.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lo.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   public static int a(dus $$0, int $$1) {
      return azf.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return a($$0, 15);
   }

   public static Optional<eyw> a(bty<?> $$0, dds $$1, jf $$2) {
      Optional<eyw> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eyw> a(bty<?> $$0, dds $$1, jf $$2, boolean $$3) {
      jf.a $$4 = new jf.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kj $$5 = (kj)var5.next();
         $$4.g($$2).h($$5);
         eyw $$6 = cqa.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
