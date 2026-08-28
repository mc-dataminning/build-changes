import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djz extends djp {
   public static final MapCodec<djz> a = b(djz::new);
   public static final dyl<jm> b = dob.aF;
   public static final dyl<dyc> c = dye.Y;
   public static final dyf d = dye.B;
   private static final fcl f = dkd.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fcl g = dkd.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fcl h = dkd.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fcl i = dkd.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fcl j = fci.a(i, h);
   private static final fcl k = fci.a(j, dkd.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fcl l = fci.a(j, dkd.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fcl m = fci.a(j, dkd.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fcl n = fci.a(j, dkd.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fcl o = fci.a(j, dkd.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fcl G = fci.a(j, dkd.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fcl H = fci.a(j, dkd.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dyc.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      bvb $$4 = $$3.p();
      cpo $$5 = $$4 instanceof cpo ? (cpo)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      return (bta)(this.a($$1, $$0, $$4, $$3, true) ? bta.a : bta.e);
   }

   public boolean a(dgz $$0, dxo $$1, fbn $$2, @Nullable cpo $$3, boolean $$4) {
      jm $$5 = $$2.c();
      jh $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(axf.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dxo $$0, jm $$1, double $$2) {
      if ($$1.o() != jm.a.b && !($$2 > 0.8124F)) {
         jm $$3 = $$0.c(b);
         dyc $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dgz $$0, jh $$1, @Nullable jm $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bvb $$0, dgz $$1, jh $$2, @Nullable jm $$3) {
      duq $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof duo) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((duo)$$4).a($$3);
         $$1.a(null, $$2, awv.bZ, aww.e, 2.0F, 1.0F);
         $$1.a($$0, eck.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fcl o(dxo $$0) {
      jm $$1 = $$0.c(b);
      dyc $$2 = $$0.c(c);
      if ($$2 == dyc.a) {
         return $$1 != jm.c && $$1 != jm.d ? g : f;
      } else if ($$2 == dyc.b) {
         return H;
      } else if ($$2 == dyc.d) {
         return $$1 != jm.c && $$1 != jm.d ? l : k;
      } else if ($$1 == jm.c) {
         return o;
      } else if ($$1 == jm.d) {
         return G;
      } else {
         return $$1 == jm.f ? n : m;
      }
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.o($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.o($$0);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      dgz $$3 = $$0.q();
      jm.a $$4 = $$1.o();
      if ($$4 == jm.a.b) {
         dxo $$5 = this.m().b(c, $$1 == jm.a ? dyc.b : dyc.a).b(b, $$0.g());
         if ($$5.a((dhc)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jm.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jm.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jm.e)
            || $$4 == jm.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jm.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jm.c);
         dxo $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dyc.d : dyc.c);
         if ($$7.a((dhc)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jm.b);
         $$7 = $$7.b(c, $$8 ? dyc.a : dyc.b);
         if ($$7.a((dhc)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      dyc $$8 = $$0.c(c);
      jm $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dyc.d) {
         return dkf.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dyc.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dyc.c).b(b, $$4.g());
            }

            if ($$8 == dyc.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dyc.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jm $$3 = q($$0).g();
      return $$3 == jm.b ? dkd.a($$1, $$2.d(), jm.a) : dmy.b($$1, $$2, $$3);
   }

   private static jm q(dxo $$0) {
      switch ((dyc)$$0.c(c)) {
         case a:
            return jm.b;
         case b:
            return jm.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new duo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.F, $$0.C ? duo::a : duo::b);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   public dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
