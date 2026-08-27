import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyj extends ctc {
   public static final MapCodec<cyj> a = b(cyj::new);
   public static final dgb<dge> b = dft.bf;
   public static final dfu c = dft.w;
   public static final dgd d = dft.aR;
   public static final int e = 3;

   @Override
   public MapCodec<cyj> a() {
      return a;
   }

   public cyj(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dge.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dfd b(cqc $$0, gw $$1, dfd $$2) {
      dge $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dge $$4 = $$0.a_($$1.d()).A();
         dge $$5 = $$4.e() ? dge.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dfd a(clt $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      boolean $$6 = $$1.o() == ha.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable biw $$0, dfd $$1, cqb $$2, gw $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, djn.H, $$3);
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      if ($$6.a(aqd.aG) && $$5.b() == ha.b) {
         return bhe.d;
      } else if ($$1.B) {
         return bhe.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(apq.ag);
         return bhe.b;
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, cca $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(apq.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dfd $$0, cqb $$1, gw $$2, int $$3, int $$4) {
      dge $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(iv.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      he<apf> $$10;
      if ($$5.d()) {
         aez $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = he.a(apf.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aph.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private aez a(cqb $$0, gw $$1) {
      return $$0.c_($$1.c()) instanceof dej $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d);
   }
}
