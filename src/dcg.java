import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcg extends cvz {
   public static final MapCodec<dcg> a = b(dcg::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final djp d = djf.aZ;
   private static final ImmutableList<iz> e = ImmutableList.of(
      new iz(0, 0, -1), new iz(-1, 0, 0), new iz(0, 0, 1), new iz(1, 0, 0), new iz(-1, 0, -1), new iz(1, 0, -1), new iz(-1, 0, 1), new iz(1, 0, 1)
   );
   private static final ImmutableList<iz> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(iz::o).iterator())
      .addAll(e.stream().map(iz::p).iterator())
      .add(new iz(0, 1, 0))
      .build();

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   public dcg(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      if ($$4 == bjk.a && !a($$6) && a($$3.b(bjk.b))) {
         return bjl.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fT().d) {
            $$6.h(1);
         }

         return bjl.a($$1.B);
      } else if ($$0.c(d) == 0) {
         return bjl.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bjl.a($$1.B);
      } else {
         if (!$$1.B) {
            amq $$7 = (amq)$$3;
            if ($$7.T() != $$1.ad() || !$$2.equals($$7.R())) {
               $$7.a($$1.ad(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arc.uC, ard.e, 1.0F, 1.0F);
               return bjl.a;
            }
         }

         return bjl.b;
      }
   }

   private static boolean a(cmh $$0) {
      return $$0.a(cmk.ft);
   }

   private static boolean h(dip $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(hv $$0, csy $$1) {
      edz $$2 = $$1.b_($$0);
      if (!$$2.a(arw.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            edz $$4 = $$1.b_($$0.d());
            return !$$4.a(arw.a);
         }
      }
   }

   private void d(dip $$0, csy $$1, final hv $$2) {
      $$1.a($$2, false);
      boolean $$3 = ia.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(arw.a);
      csr $$5 = new csr() {
         @Override
         public Optional<Float> a(csq $$0, cse $$1, hv $$2x, dip $$3, edz $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cwb.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      elb $$6 = $$2.b();
      $$1.a(null, $$1.ah().a($$6), $$5, $$6, 5.0F, true, csy.a.b);
   }

   public static boolean a(csy $$0) {
      return $$0.E_().m();
   }

   public static void a(@Nullable blf $$0, csy $$1, hv $$2, dip $$3) {
      dip $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dmz.c, $$2, dmz.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arc.uA, ard.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arc.uz, ard.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(jv.aE, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   public static int a(dip $$0, int $$1) {
      return aty.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return a($$0, 15);
   }

   public static Optional<elb> a(blj<?> $$0, csi $$1, hv $$2) {
      Optional<elb> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<elb> a(blj<?> $$0, csi $$1, hv $$2, boolean $$3) {
      hv.a $$4 = new hv.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         iz $$5 = (iz)var5.next();
         $$4.g($$2).h($$5);
         elb $$6 = cgo.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
