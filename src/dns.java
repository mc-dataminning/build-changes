import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dns extends dhj {
   public static final MapCodec<dns> a = b(dns::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dvo d = dve.aZ;
   private static final ImmutableList<ki> e = ImmutableList.of(
      new ki(0, 0, -1), new ki(-1, 0, 0), new ki(0, 0, 1), new ki(1, 0, 0), new ki(-1, 0, -1), new ki(1, 0, -1), new ki(-1, 0, 1), new ki(1, 0, 1)
   );
   private static final ImmutableList<ki> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(ki::p).iterator())
      .addAll(e.stream().map(ki::q).iterator())
      .add(new ki(0, 1, 0))
      .build();

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return brp.a;
      } else {
         return (brp)($$5 == bro.a && a($$4.b(bro.b)) && o($$1) ? brp.e : brp.f);
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$0.c(d) == 0) {
         return brp.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return brp.a;
      } else {
         if (!$$1.B) {
            ari $$5 = (ari)$$3;
            if ($$5.W() != $$1.ag() || !$$2.equals($$5.U())) {
               $$5.a($$1.ag(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awe.vA, awf.e, 1.0F, 1.0F);
               return brp.b;
            }
         }

         return brp.c;
      }
   }

   private static boolean a(cvp $$0) {
      return $$0.a(cvt.fu);
   }

   private static boolean o(duo $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(je $$0, deg $$1) {
      eqp $$2 = $$1.b_($$0);
      if (!$$2.a(awz.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eqp $$4 = $$1.b_($$0.e());
            return !$$4.a(awz.a);
         }
      }
   }

   private void d(duo $$0, deg $$1, final je $$2) {
      $$1.a($$2, false);
      boolean $$3 = jj.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(awz.a);
      ddz $$5 = new ddz() {
         @Override
         public Optional<Float> a(ddy $$0, ddl $$1, je $$2x, duo $$3, eqp $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dhl.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eys $$6 = $$2.b();
      $$1.a(null, $$1.ak().a($$6), $$5, $$6, 5.0F, true, deg.a.b);
   }

   public static boolean a(deg $$0) {
      return $$0.B_().m();
   }

   public static void a(@Nullable bto $$0, deg $$1, je $$2, duo $$3) {
      duo $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dzl.c, $$2, dzl.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awe.vy, awf.e, 1.0F, 1.0F);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awe.vx, awf.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ln.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   public static int a(duo $$0, int $$1) {
      return azd.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return a($$0, 15);
   }

   public static Optional<eys> a(btv<?> $$0, ddp $$1, je $$2) {
      Optional<eys> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eys> a(btv<?> $$0, ddp $$1, je $$2, boolean $$3) {
      je.a $$4 = new je.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ki $$5 = (ki)var5.next();
         $$4.g($$2).h($$5);
         eys $$6 = cpx.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
