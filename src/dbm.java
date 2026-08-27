import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbm extends cvf {
   public static final MapCodec<dbm> a = b(dbm::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final din d = did.aZ;
   private static final ImmutableList<ja> e = ImmutableList.of(
      new ja(0, 0, -1), new ja(-1, 0, 0), new ja(0, 0, 1), new ja(1, 0, 0), new ja(-1, 0, -1), new ja(1, 0, -1), new ja(-1, 0, 1), new ja(1, 0, 1)
   );
   private static final ImmutableList<ja> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(ja::o).iterator())
      .addAll(e.stream().map(ja::p).iterator())
      .add(new ja(0, 1, 0))
      .build();

   @Override
   public MapCodec<dbm> a() {
      return a;
   }

   public dbm(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      if ($$4 == bja.a && !a($$6) && a($$3.b(bja.b))) {
         return bjb.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fU().d) {
            $$6.h(1);
         }

         return bjb.a($$1.B);
      } else if ($$0.c(d) == 0) {
         return bjb.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bjb.a($$1.B);
      } else {
         if (!$$1.B) {
            amj $$7 = (amj)$$3;
            if ($$7.T() != $$1.ad() || !$$2.equals($$7.R())) {
               $$7.a($$1.ad(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqv.uh, aqw.e, 1.0F, 1.0F);
               return bjb.a;
            }
         }

         return bjb.b;
      }
   }

   private static boolean a(clo $$0) {
      return $$0.a(clr.ft);
   }

   private static boolean h(dhn $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(hx $$0, csf $$1) {
      ecx $$2 = $$1.b_($$0);
      if (!$$2.a(arp.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ecx $$4 = $$1.b_($$0.d());
            return !$$4.a(arp.a);
         }
      }
   }

   private void d(dhn $$0, csf $$1, final hx $$2) {
      $$1.a($$2, false);
      boolean $$3 = ib.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(arp.a);
      cry $$5 = new cry() {
         @Override
         public Optional<Float> a(crx $$0, crl $$1, hx $$2x, dhn $$3, ecx $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cvh.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ejz $$6 = $$2.b();
      $$1.a(null, $$1.ah().a($$6), $$5, $$6, 5.0F, true, csf.a.b);
   }

   public static boolean a(csf $$0) {
      return $$0.E_().m();
   }

   public static void a(@Nullable bkv $$0, csf $$1, hx $$2, dhn $$3) {
      dhn $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dlx.c, $$2, dlx.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqv.uf, aqw.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqv.ue, aqw.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(jw.aC, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   public static int a(dhn $$0, int $$1) {
      return atq.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return a($$0, 15);
   }

   public static Optional<ejz> a(bkz<?> $$0, crp $$1, hx $$2) {
      Optional<ejz> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ejz> a(bkz<?> $$0, crp $$1, hx $$2, boolean $$3) {
      hx.a $$4 = new hx.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ja $$5 = (ja)var5.next();
         $$4.g($$2).h($$5);
         ejz $$6 = cfv.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
