import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhi extends dgy {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final dvm b = dli.aF;
   public static final dvq<dvg> c = dvi.V;
   public static final dvj d = dvi.w;
   private static final ezq f = dhm.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ezq g = dhm.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ezq h = dhm.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ezq i = dhm.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ezq j = ezn.a(i, h);
   private static final ezq k = ezn.a(j, dhm.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ezq l = ezn.a(j, dhm.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ezq m = ezn.a(j, dhm.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ezq n = ezn.a(j, dhm.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ezq o = ezn.a(j, dhm.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ezq G = ezn.a(j, dhm.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ezq H = ezn.a(j, dhm.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c).b(c, dvg.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      btr $$4 = $$3.s();
      cnx $$5 = $$4 instanceof cnx ? (cnx)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      return (brs)(this.a($$1, $$0, $$4, $$3, true) ? brs.a : brs.e);
   }

   public boolean a(dej $$0, dus $$1, eys $$2, @Nullable cnx $$3, boolean $$4) {
      jk $$5 = $$2.c();
      jf $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awq.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dus $$0, jk $$1, double $$2) {
      if ($$1.o() != jk.a.b && !($$2 > 0.8124F)) {
         jk $$3 = $$0.c(b);
         dvg $$4 = $$0.c(c);
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

   public boolean a(dej $$0, jf $$1, @Nullable jk $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable btr $$0, dej $$1, jf $$2, @Nullable jk $$3) {
      drv $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof drt) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((drt)$$4).a($$3);
         $$1.a(null, $$2, awg.bZ, awh.e, 2.0F, 1.0F);
         $$1.a($$0, dzp.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ezq o(dus $$0) {
      jk $$1 = $$0.c(b);
      dvg $$2 = $$0.c(c);
      if ($$2 == dvg.a) {
         return $$1 != jk.c && $$1 != jk.d ? g : f;
      } else if ($$2 == dvg.b) {
         return H;
      } else if ($$2 == dvg.d) {
         return $$1 != jk.c && $$1 != jk.d ? l : k;
      } else if ($$1 == jk.c) {
         return o;
      } else if ($$1 == jk.d) {
         return G;
      } else {
         return $$1 == jk.f ? n : m;
      }
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.o($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.o($$0);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      jk $$1 = $$0.k();
      jf $$2 = $$0.a();
      dej $$3 = $$0.q();
      jk.a $$4 = $$1.o();
      if ($$4 == jk.a.b) {
         dus $$5 = this.n().b(c, $$1 == jk.a ? dvg.b : dvg.a).b(b, $$0.g());
         if ($$5.a((dem)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jk.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jk.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jk.e)
            || $$4 == jk.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jk.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jk.c);
         dus $$7 = this.n().b(b, $$1.g()).b(c, $$6 ? dvg.d : dvg.c);
         if ($$7.a((dem)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jk.b);
         $$7 = $$7.b(c, $$8 ? dvg.a : dvg.b);
         if ($$7.a((dem)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      if ($$3.f()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      dvg $$6 = $$0.c(c);
      jk $$7 = q($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dvg.d) {
         return dho.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dvg.d && !$$2.c($$3, $$5, $$1)) {
               return $$0.b(c, dvg.c).b(b, $$1.g());
            }

            if ($$6 == dvg.c && $$7.g() == $$1 && $$2.c($$3, $$5, $$0.c(b))) {
               return $$0.b(c, dvg.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jk $$3 = q($$0).g();
      return $$3 == jk.b ? dhm.a($$1, $$2.d(), jk.a) : dkg.b($$1, $$2, $$3);
   }

   private static jk q(dus $$0) {
      switch ((dvg)$$0.c(c)) {
         case a:
            return jk.b;
         case b:
            return jk.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new drt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.E, $$0.B ? drt::a : drt::b);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   public dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
