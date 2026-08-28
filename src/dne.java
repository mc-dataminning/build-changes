import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dne extends dgv {
   public static final MapCodec<dne> a = b(dne::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dva d = duq.aZ;
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
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return brk.a;
      } else {
         return (brk)($$5 == brj.a && a($$4.b(brj.b)) && o($$1) ? brk.e : brk.f);
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$0.c(d) == 0) {
         return brk.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return brk.a;
      } else {
         if (!$$1.B) {
            arh $$5 = (arh)$$3;
            if ($$5.W() != $$1.ag() || !$$2.equals($$5.U())) {
               $$5.a($$1.ag(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awd.vA, awe.e, 1.0F, 1.0F);
               return brk.b;
            }
         }

         return brk.c;
      }
   }

   private static boolean a(cvl $$0) {
      return $$0.a(cvo.fu);
   }

   private static boolean o(dua $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(je $$0, dds $$1) {
      eqb $$2 = $$1.b_($$0);
      if (!$$2.a(awy.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eqb $$4 = $$1.b_($$0.e());
            return !$$4.a(awy.a);
         }
      }
   }

   private void d(dua $$0, dds $$1, final je $$2) {
      $$1.a($$2, false);
      boolean $$3 = jj.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(awy.a);
      ddl $$5 = new ddl() {
         @Override
         public Optional<Float> a(ddk $$0, dcx $$1, je $$2x, dua $$3, eqb $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dgx.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eye $$6 = $$2.b();
      $$1.a(null, $$1.ak().a($$6), $$5, $$6, 5.0F, true, dds.a.b);
   }

   public static boolean a(dds $$0) {
      return $$0.B_().m();
   }

   public static void a(@Nullable btj $$0, dds $$1, je $$2, dua $$3) {
      dua $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dyx.c, $$2, dyx.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awd.vy, awe.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awd.vx, awe.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ln.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   public static int a(dua $$0, int $$1) {
      return azc.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return a($$0, 15);
   }

   public static Optional<eye> a(btq<?> $$0, ddb $$1, je $$2) {
      Optional<eye> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eye> a(btq<?> $$0, ddb $$1, je $$2, boolean $$3) {
      je.a $$4 = new je.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ki $$5 = (ki)var5.next();
         $$4.g($$2).h($$5);
         eye $$6 = cpr.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
