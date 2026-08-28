import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dqq extends dlm {
   public static final MapCodec<dqq> a = b(dqq::new);
   public static final eax<ja> b = dqa.e;
   public static final eaq c = eap.A;
   public static final eaq d = eap.r;
   private static final ffc e = fez.a(dma.b(16.0, 0.0, 2.0), dma.b(8.0, 2.0, 14.0));
   private static final Map<ja, ffc> f = fez.c(
      fez.a(dma.a(16.0, 10.0, 14.0, 1.0, 5.333333), dma.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dma.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   protected dqq(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffc d_(dzz $$0) {
      return e;
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   public dzz a(dcr $$0) {
      div $$1 = $$0.q();
      cyy $$2 = $$0.n();
      cqy $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gF()) {
         dbg $$5 = $$2.a(kj.aa, dbg.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyd($$0, $$1);
   }

   public static boolean a(@Nullable bxc $$0, div $$1, iu $$2, dzz $$3, cyy $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bxc $$0, div $$1, iu $$2, dzz $$3, cyy $$4) {
      if ($$1.c_($$2) instanceof dyd $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awn.cz, awo.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bwd $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      dzz $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(eez.c, $$2, eez.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(div $$0, iu $$1, dzz $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(div $$0, iu $$1, dzz $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(div $$0, iu $$1, dzz $$2) {
      exo $$3 = exk.a($$0, $$2.c(b).g(), ja.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$3 == ja.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      if ($$0.c(d)) {
         dwx $$3 = $$1.c_($$2);
         if ($$3 instanceof dyd) {
            return ((dyd)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$1.c(d)) {
         return bub.f;
      } else if ($$0.a(axk.aY)) {
         return (bub)(a($$4, $$2, $$3, $$1, $$0) ? bub.a : bub.e);
      } else {
         return (bub)($$0.f() && $$5 == bua.a ? bub.e : bub.f);
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bub.a;
      } else {
         return bub.c;
      }
   }

   @Nullable
   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(div $$0, iu $$1, cqy $$2) {
      dwx $$3 = $$0.c_($$1);
      if ($$3 instanceof dyd) {
         $$2.a((dyd)$$3);
         $$2.a(awx.au);
      }
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
