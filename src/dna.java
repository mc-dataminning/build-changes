import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dna extends dhc implements djl {
   public static final MapCodec<dna> c = b(dna::new);
   public static final dsv<dst> d = dhc.b;
   protected static final float e = 6.0F;
   protected static final ewf f = deu.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dna> a() {
      return c;
   }

   public dna(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return f;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dew.kJ);
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(dew.bw);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = super.a($$0);
      if ($$1 != null) {
         enq $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awr.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      if ($$0.c(d) == dst.a) {
         drx $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dst.b;
      } else {
         enq $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awr.a) && $$4.e() == 8;
      }
   }

   @Override
   protected enq b_(drx $$0) {
      return enr.c.a(false);
   }

   @Override
   public boolean a(@Nullable cms $$0, daz $$1, iz $$2, drx $$3, enp $$4) {
      return false;
   }

   @Override
   public boolean a(dbu $$0, iz $$1, drx $$2, enq $$3) {
      return false;
   }
}
