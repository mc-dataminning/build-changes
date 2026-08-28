import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dim extends dic {
   public static final MapCodec<dim> a = b(dim::new);
   public static final dws<jm> b = dml.aF;
   public static final dws<dwj> c = dwl.V;
   public static final dwm d = dwl.w;
   private static final fas f = diq.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fas g = diq.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fas h = diq.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fas i = diq.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fas j = fap.a(i, h);
   private static final fas k = fap.a(j, diq.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fas l = fap.a(j, diq.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fas m = fap.a(j, diq.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fas n = fap.a(j, diq.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fas o = fap.a(j, diq.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fas G = fap.a(j, diq.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fas H = fap.a(j, diq.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dwj.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
      bul $$4 = $$3.p();
      cou $$5 = $$4 instanceof cou ? (cou)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      return (bsk)(this.a($$1, $$0, $$4, $$3, true) ? bsk.a : bsk.e);
   }

   public boolean a(dfm $$0, dvv $$1, ezu $$2, @Nullable cou $$3, boolean $$4) {
      jm $$5 = $$2.c();
      jh $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awx.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dvv $$0, jm $$1, double $$2) {
      if ($$1.o() != jm.a.b && !($$2 > 0.8124F)) {
         jm $$3 = $$0.c(b);
         dwj $$4 = $$0.c(c);
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

   public boolean a(dfm $$0, jh $$1, @Nullable jm $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bul $$0, dfm $$1, jh $$2, @Nullable jm $$3) {
      dsy $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dsw) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dsw)$$4).a($$3);
         $$1.a(null, $$2, awn.bZ, awo.e, 2.0F, 1.0F);
         $$1.a($$0, ear.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fas o(dvv $$0) {
      jm $$1 = $$0.c(b);
      dwj $$2 = $$0.c(c);
      if ($$2 == dwj.a) {
         return $$1 != jm.c && $$1 != jm.d ? g : f;
      } else if ($$2 == dwj.b) {
         return H;
      } else if ($$2 == dwj.d) {
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
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.o($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.o($$0);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      dfm $$3 = $$0.q();
      jm.a $$4 = $$1.o();
      if ($$4 == jm.a.b) {
         dvv $$5 = this.m().b(c, $$1 == jm.a ? dwj.b : dwj.a).b(b, $$0.g());
         if ($$5.a((dfp)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jm.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jm.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jm.e)
            || $$4 == jm.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jm.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jm.c);
         dvv $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dwj.d : dwj.c);
         if ($$7.a((dfp)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jm.b);
         $$7 = $$7.b(c, $$8 ? dwj.a : dwj.b);
         if ($$7.a((dfp)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      dwj $$8 = $$0.c(c);
      jm $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dwj.d) {
         return dis.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dwj.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dwj.c).b(b, $$4.g());
            }

            if ($$8 == dwj.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dwj.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jm $$3 = q($$0).g();
      return $$3 == jm.b ? diq.a($$1, $$2.d(), jm.a) : dlj.b($$1, $$2, $$3);
   }

   private static jm q(dvv $$0) {
      switch ((dwj)$$0.c(c)) {
         case a:
            return jm.b;
         case b:
            return jm.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dsw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.E, $$0.C ? dsw::a : dsw::b);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   public dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
