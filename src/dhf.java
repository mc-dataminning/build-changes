import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhf extends dgv {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final dvi b = dlf.aF;
   public static final dvm<dvc> c = dve.V;
   public static final dvf d = dve.w;
   private static final ezm f = dhj.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ezm g = dhj.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ezm h = dhj.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ezm i = dhj.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ezm j = ezj.a(i, h);
   private static final ezm k = ezj.a(j, dhj.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ezm l = ezj.a(j, dhj.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ezm m = ezj.a(j, dhj.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ezm n = ezj.a(j, dhj.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ezm o = ezj.a(j, dhj.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ezm G = ezj.a(j, dhj.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ezm H = ezj.a(j, dhj.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c).b(c, dvc.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      bto $$4 = $$3.s();
      cnu $$5 = $$4 instanceof cnu ? (cnu)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      return (brp)(this.a($$1, $$0, $$4, $$3, true) ? brp.a : brp.e);
   }

   public boolean a(deg $$0, duo $$1, eyo $$2, @Nullable cnu $$3, boolean $$4) {
      jj $$5 = $$2.c();
      je $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awo.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(duo $$0, jj $$1, double $$2) {
      if ($$1.o() != jj.a.b && !($$2 > 0.8124F)) {
         jj $$3 = $$0.c(b);
         dvc $$4 = $$0.c(c);
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

   public boolean a(deg $$0, je $$1, @Nullable jj $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bto $$0, deg $$1, je $$2, @Nullable jj $$3) {
      drs $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof drq) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((drq)$$4).a($$3);
         $$1.a(null, $$2, awe.bZ, awf.e, 2.0F, 1.0F);
         $$1.a($$0, dzl.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ezm o(duo $$0) {
      jj $$1 = $$0.c(b);
      dvc $$2 = $$0.c(c);
      if ($$2 == dvc.a) {
         return $$1 != jj.c && $$1 != jj.d ? g : f;
      } else if ($$2 == dvc.b) {
         return H;
      } else if ($$2 == dvc.d) {
         return $$1 != jj.c && $$1 != jj.d ? l : k;
      } else if ($$1 == jj.c) {
         return o;
      } else if ($$1 == jj.d) {
         return G;
      } else {
         return $$1 == jj.f ? n : m;
      }
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.o($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.o($$0);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      jj $$1 = $$0.k();
      je $$2 = $$0.a();
      deg $$3 = $$0.q();
      jj.a $$4 = $$1.o();
      if ($$4 == jj.a.b) {
         duo $$5 = this.o().b(c, $$1 == jj.a ? dvc.b : dvc.a).b(b, $$0.g());
         if ($$5.a((dej)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jj.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jj.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jj.e)
            || $$4 == jj.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jj.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jj.c);
         duo $$7 = this.o().b(b, $$1.g()).b(c, $$6 ? dvc.d : dvc.c);
         if ($$7.a((dej)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jj.b);
         $$7 = $$7.b(c, $$8 ? dvc.a : dvc.b);
         if ($$7.a((dej)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      if ($$3.f()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      dvc $$6 = $$0.c(c);
      jj $$7 = q($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dvc.d) {
         return dhl.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dvc.d && !$$2.c($$3, $$5, $$1)) {
               return $$0.b(c, dvc.c).b(b, $$1.g());
            }

            if ($$6 == dvc.c && $$7.g() == $$1 && $$2.c($$3, $$5, $$0.c(b))) {
               return $$0.b(c, dvc.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      jj $$3 = q($$0).g();
      return $$3 == jj.b ? dhj.a($$1, $$2.d(), jj.a) : dkd.b($$1, $$2, $$3);
   }

   private static jj q(duo $$0) {
      switch ((dvc)$$0.c(c)) {
         case a:
            return jj.b;
         case b:
            return jj.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new drq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.E, $$0.B ? drq::a : drq::b);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   public duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
