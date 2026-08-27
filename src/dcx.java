import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcx extends cwq {
   public static final MapCodec<dcx> a = b(dcx::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dkh d = djx.aZ;
   private static final ImmutableList<jb> e = ImmutableList.of(
      new jb(0, 0, -1), new jb(-1, 0, 0), new jb(0, 0, 1), new jb(1, 0, 0), new jb(-1, 0, -1), new jb(1, 0, -1), new jb(-1, 0, 1), new jb(1, 0, 1)
   );
   private static final ImmutableList<jb> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jb::o).iterator())
      .addAll(e.stream().map(jb::p).iterator())
      .add(new jb(0, 1, 0))
      .build();

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   public dcx(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      if ($$4 == bka.a && !a($$6) && a($$3.b(bka.b))) {
         return bkb.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fT().d) {
            $$6.h(1);
         }

         return bkb.a($$1.B);
      } else if ($$0.c(d) == 0) {
         return bkb.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bkb.a($$1.B);
      } else {
         if (!$$1.B) {
            ane $$7 = (ane)$$3;
            if ($$7.T() != $$1.ae() || !$$2.equals($$7.R())) {
               $$7.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ars.uC, art.e, 1.0F, 1.0F);
               return bkb.a;
            }
         }

         return bkb.b;
      }
   }

   private static boolean a(cmy $$0) {
      return $$0.a(cnb.ft);
   }

   private static boolean h(djh $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(hx $$0, ctp $$1) {
      eer $$2 = $$1.b_($$0);
      if (!$$2.a(asm.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eer $$4 = $$1.b_($$0.d());
            return !$$4.a(asm.a);
         }
      }
   }

   private void d(djh $$0, ctp $$1, final hx $$2) {
      $$1.a($$2, false);
      boolean $$3 = ic.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(asm.a);
      cti $$5 = new cti() {
         @Override
         public Optional<Float> a(cth $$0, csv $$1, hx $$2x, djh $$3, eer $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cws.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      elt $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, ctp.a.b);
   }

   public static boolean a(ctp $$0) {
      return $$0.E_().m();
   }

   public static void a(@Nullable blv $$0, ctp $$1, hx $$2, djh $$3) {
      djh $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dnr.c, $$2, dnr.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ars.uA, art.e, 1.0F, 1.0F);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ars.uz, art.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(jx.aE, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   public static int a(djh $$0, int $$1) {
      return auo.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return a($$0, 15);
   }

   public static Optional<elt> a(blz<?> $$0, csz $$1, hx $$2) {
      Optional<elt> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<elt> a(blz<?> $$0, csz $$1, hx $$2, boolean $$3) {
      hx.a $$4 = new hx.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jb $$5 = (jb)var5.next();
         $$4.g($$2).h($$5);
         elt $$6 = chf.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
