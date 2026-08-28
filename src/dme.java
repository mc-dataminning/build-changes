import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dgv {
   public static final MapCodec<dme> a = b(dme::new);
   public static final duy<dvb> b = duq.bf;
   public static final dur c = duq.w;
   public static final dva d = duq.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   public dme(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, dvb.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dua b(ddt $$0, je $$1, dua $$2) {
      dvb $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dvb $$4 = $$0.a_($$1.e()).E();
         dvb $$5 = $$4.e() ? dvb.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dua a(cyw $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      boolean $$6 = $$1.o() == jj.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable btj $$0, dua $$1, dds $$2, je $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dyx.H, $$3);
      }
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      return (brk)($$0.a(axb.bk) && $$6.b() == jj.b ? brk.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awn.ag);
      }

      return brk.a;
   }

   @Override
   protected void a_(dua $$0, dds $$1, je $$2, cnp $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awn.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dua $$0, dds $$1, je $$2, int $$3, int $$4) {
      dvb $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ln.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jn<awc> $$10;
      if ($$5.d()) {
         alb $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jn.a(awc.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awe.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private alb a(dds $$0, je $$1) {
      return $$0.c_($$1.d()) instanceof dss $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d);
   }
}
