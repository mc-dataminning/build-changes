import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dht extends dhy implements dhs {
   public static final int f = 8;
   public static final int g = 5;
   private iq<cmx> h = iq.a(5, cmx.f);
   private int i = -1;
   private long j;

   public dht(hx $$0, djg $$1) {
      super(dgw.r, $$0, $$1);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.h = iq.a(this.b(), cmx.f);
      if (!this.c_($$0)) {
         bju.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bju.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public cmx a(int $$0, int $$1) {
      this.e_(null);
      return bju.a(this.k(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cmx $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   @Override
   protected vf l() {
      return vf.c("container.hopper");
   }

   public static void a(cto $$0, hx $$1, djg $$2, dht $$3) {
      $$3.i--;
      $$3.j = $$0.X();
      if (!$$3.w()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dhs)$$3));
      }
   }

   private static boolean a(cto $$0, hx $$1, djg $$2, dht $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.w() && $$2.c(daj.c)) {
            boolean $$5 = false;
            if (!$$3.ai_()) {
               $$5 = a($$0, $$1, $$2, (bjt)$$3);
            }

            if (!$$3.m()) {
               $$5 |= $$4.getAsBoolean();
            }

            if ($$5) {
               $$3.c(8);
               a($$0, $$1, $$2);
               return true;
            }
         }

         return false;
      }
   }

   private boolean m() {
      for (cmx $$0 : this.h) {
         if ($$0.b() || $$0.L() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cto $$0, hx $$1, djg $$2, bjt $$3) {
      bjt $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         ic $$5 = $$2.c(daj.b).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for (int $$6 = 0; $$6 < $$3.b(); $$6++) {
               if (!$$3.a($$6).b()) {
                  cmx $$7 = $$3.a($$6).p();
                  cmx $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
                  if ($$8.b()) {
                     $$4.e();
                     return true;
                  }

                  $$3.a($$6, $$7);
               }
            }

            return false;
         }
      }
   }

   private static IntStream a(bjt $$0, ic $$1) {
      return $$0 instanceof bkl ? IntStream.of(((bkl)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bjt $$0, ic $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cmx $$2 = $$0.a($$1x);
         return $$2.L() >= $$2.g();
      });
   }

   private static boolean c(bjt $$0, ic $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cto $$0, dhs $$1) {
      bjt $$2 = c($$0, $$1);
      if ($$2 != null) {
         ic $$3 = ic.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3x -> a($$1, $$2, $$3x, $$3));
      } else {
         for (cbt $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dhs $$0, bjt $$1, int $$2, ic $$3) {
      cmx $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         cmx $$5 = $$4.p();
         cmx $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bjt $$0, cbt $$1) {
      boolean $$2 = false;
      cmx $$3 = $$1.q().p();
      cmx $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cmx.f);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cmx a(@Nullable bjt $$0, bjt $$1, cmx $$2, @Nullable ic $$3) {
      if ($$1 instanceof bkl $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for (int $$6 = 0; $$6 < $$5.length && !$$2.b(); $$6++) {
            $$2 = b($$0, $$1, $$2, $$5[$$6], $$3);
         }

         return $$2;
      }

      int $$7 = $$1.b();

      for (int $$8 = 0; $$8 < $$7 && !$$2.b(); $$8++) {
         $$2 = b($$0, $$1, $$2, $$8, $$3);
      }

      return $$2;
   }

   private static boolean a(bjt $$0, cmx $$1, int $$2, @Nullable ic $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bkl $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bjt $$0, bjt $$1, cmx $$2, int $$3, ic $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bkl $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cmx b(@Nullable bjt $$0, bjt $$1, cmx $$2, int $$3, @Nullable ic $$4) {
      cmx $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ai_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cmx.f;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dht $$10 && !$$10.x()) {
               int $$11 = 0;
               if ($$0 instanceof dht $$12 && $$10.j >= $$12.j) {
                  $$11 = 1;
               }

               $$10.c(8 - $$11);
            }

            $$1.e();
         }
      }

      return $$2;
   }

   @Nullable
   private static bjt b(cto $$0, hx $$1, djg $$2) {
      ic $$3 = $$2.c(daj.b);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bjt c(cto $$0, dhs $$1) {
      return a($$0, $$1.I(), $$1.J() + 1.0, $$1.K());
   }

   public static List<cbt> b(cto $$0, dhs $$1) {
      return $$1.aj_()
         .e()
         .stream()
         .flatMap($$2 -> $$0.a(cbt.class, $$2.d($$1.I() - 0.5, $$1.J() - 0.5, $$1.K() - 0.5), blx.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bjt a(cto $$0, hx $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bjt a(cto $$0, double $$1, double $$2, double $$3) {
      bjt $$4 = null;
      hx $$5 = hx.a($$1, $$2, $$3);
      djg $$6 = $$0.a_($$5);
      cwp $$7 = $$6.b();
      if ($$7 instanceof bkm) {
         $$4 = ((bkm)$$7).a($$6, $$0, $$5);
      } else if ($$6.t()) {
         dgu $$8 = $$0.c_($$5);
         if ($$8 instanceof bjt) {
            $$4 = (bjt)$$8;
            if ($$4 instanceof dhb && $$7 instanceof cxs) {
               $$4 = cxs.a((cxs)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<blu> $$9 = $$0.a((blu)null, new eln($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), blx.d);
         if (!$$9.isEmpty()) {
            $$4 = (bjt)$$9.get($$0.z.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cmx $$0, cmx $$1) {
      return $$0.L() <= $$0.g() && cmx.c($$0, $$1);
   }

   @Override
   public double I() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double J() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double K() {
      return (double)this.p.w() + 0.5;
   }

   private void c(int $$0) {
      this.i = $$0;
   }

   private boolean w() {
      return this.i > 0;
   }

   private boolean x() {
      return this.i > 8;
   }

   @Override
   protected iq<cmx> k() {
      return this.h;
   }

   @Override
   protected void a(iq<cmx> $$0) {
      this.h = $$0;
   }

   public static void a(cto $$0, hx $$1, djg $$2, blu $$3, dht $$4) {
      if ($$3 instanceof cbt $$5 && !$$5.q().b() && emi.c(emi.a($$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.aj_(), elw.i)) {
         a($$0, $$1, $$2, $$4, () -> a((bjt)$$4, $$5));
      }
   }

   @Override
   protected cia a(int $$0, cfg $$1) {
      return new ciz($$0, $$1, this);
   }
}
