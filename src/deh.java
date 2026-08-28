import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deh extends den {
   public static final MapCodec<deh> a = b(deh::new);
   public static final dsy b = dsu.P;
   public static final dsv c = dsu.u;

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public deh(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dpc) {
            $$3.a((dpc)$$5);
            $$3.a(awk.ar);
            clq.a($$3, true);
         }

         return bqw.c;
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      bqs.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      dpj $$4 = $$1.c_($$2);
      if ($$4 instanceof dpc) {
         ((dpc)$$4).l();
      }
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpc($$0, $$1);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return cpw.a($$1.c_($$2));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
