import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfy extends ddm {
   public static final MapCodec<dfy> a = b(dfy::new);
   public static final dsd b = drt.aT;
   public static final dru c = drt.p;
   protected static final evf d = dea.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   public dfy(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return d;
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(b);
   }

   private static void d(drd $$0, daz $$1, io $$2) {
      int $$3 = $$1.a(dbi.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayf.b($$4));
      }

      $$3 = ayf.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$3.go()) {
         if ($$1.B) {
            return bpw.a;
         } else {
            drd $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dvw.c, $$2, dvw.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bpw.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dox($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dok.q, dfy::a) : null;
   }

   private static void a(daz $$0, io $$1, drd $$2, dox $$3) {
      if ($$0.Y() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }
}
