import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkh extends djx {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final dyr<jm> b = doj.aF;
   public static final dyr<dyi> c = dyk.W;
   public static final dyl d = dyk.x;
   private static final fcr f = dkl.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fcr g = dkl.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fcr h = dkl.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fcr i = dkl.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fcr j = fco.a(i, h);
   private static final fcr k = fco.a(j, dkl.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fcr l = fco.a(j, dkl.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fcr m = fco.a(j, dkl.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fcr n = fco.a(j, dkl.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fcr o = fco.a(j, dkl.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fcr G = fco.a(j, dkl.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fcr H = fco.a(j, dkl.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   public dkh(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, dyi.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
      bvj $$4 = $$3.p();
      cpw $$5 = $$4 instanceof cpw ? (cpw)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      return (bti)(this.a($$1, $$0, $$4, $$3, true) ? bti.a : bti.e);
   }

   public boolean a(dhh $$0, dxu $$1, fbt $$2, @Nullable cpw $$3, boolean $$4) {
      jm $$5 = $$2.c();
      jh $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(axp.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dxu $$0, jm $$1, double $$2) {
      if ($$1.o() != jm.a.b && !($$2 > 0.8124F)) {
         jm $$3 = $$0.c(b);
         dyi $$4 = $$0.c(c);
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

   public boolean a(dhh $$0, jh $$1, @Nullable jm $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bvj $$0, dhh $$1, jh $$2, @Nullable jm $$3) {
      duw $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof duu) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((duu)$$4).a($$3);
         $$1.a(null, $$2, axf.bZ, axg.e, 2.0F, 1.0F);
         $$1.a($$0, ecq.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fcr o(dxu $$0) {
      jm $$1 = $$0.c(b);
      dyi $$2 = $$0.c(c);
      if ($$2 == dyi.a) {
         return $$1 != jm.c && $$1 != jm.d ? g : f;
      } else if ($$2 == dyi.b) {
         return H;
      } else if ($$2 == dyi.d) {
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
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.o($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.o($$0);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      jm $$1 = $$0.k();
      jh $$2 = $$0.a();
      dhh $$3 = $$0.q();
      jm.a $$4 = $$1.o();
      if ($$4 == jm.a.b) {
         dxu $$5 = this.m().b(c, $$1 == jm.a ? dyi.b : dyi.a).b(b, $$0.g());
         if ($$5.a((dhk)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jm.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jm.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jm.e)
            || $$4 == jm.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jm.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jm.c);
         dxu $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dyi.d : dyi.c);
         if ($$7.a((dhk)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jm.b);
         $$7 = $$7.b(c, $$8 ? dyi.a : dyi.b);
         if ($$7.a((dhk)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, dgz $$3, BiConsumer<cxo, jh> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      dyi $$8 = $$0.c(c);
      jm $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dyi.d) {
         return dkn.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dyi.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dyi.c).b(b, $$4.g());
            }

            if ($$8 == dyi.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dyi.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jm $$3 = q($$0).g();
      return $$3 == jm.b ? dkl.a($$1, $$2.d(), jm.a) : dng.b($$1, $$2, $$3);
   }

   private static jm q(dxu $$0) {
      switch ((dyi)$$0.c(c)) {
         case a:
            return jm.b;
         case b:
            return jm.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new duu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.F, $$0.C ? duu::a : duu::b);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   public dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
