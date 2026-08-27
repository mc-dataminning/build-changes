import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends dea {
   public static final MapCodec<djj> a = b(djj::new);
   public static final dsb<dse> b = drt.bf;
   public static final dru c = drt.w;
   public static final dsd d = drt.aR;
   public static final int e = 3;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dse.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private drd b(dba $$0, io $$1, drd $$2) {
      dse $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dse $$4 = $$0.a_($$1.d()).A();
         dse $$5 = $$4.e() ? dse.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public drd a(cxb $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      boolean $$6 = $$1.o() == it.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable brw $$0, drd $$1, daz $$2, io $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dvw.H, $$3);
      }
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      return $$0.a(awf.bg) && $$6.b() == it.b ? bpy.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avs.ag);
         return bpw.b;
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, cly $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avs.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(drd $$0, daz $$1, io $$2, int $$3, int $$4) {
      dse $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ky.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ix<avh> $$10;
      if ($$5.d()) {
         akn $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ix.a(avh.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avj.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akn a(daz $$0, io $$1) {
      return $$0.c_($$1.c()) instanceof dpu $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c, d);
   }
}
