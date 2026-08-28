import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvt extends dpl implements drz {
   public static final MapCodec<dvt> c = b(dvt::new);
   public static final ecc<eca> d = dpl.b;
   private static final fgk e = dnc.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvt> a() {
      return c;
   }

   public dvt(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.c($$1, $$2, jb.b) && !$$0.a(dne.lp);
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(dne.bG);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = super.a($$0);
      if ($$1 != null) {
         exo $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axj.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      if ($$0.c(d) == eca.a) {
         ebe $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == eca.b;
      } else {
         exo $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axj.a) && $$4.e() == 8;
      }
   }

   @Override
   protected exo b_(ebe $$0) {
      return exp.c.a(false);
   }

   @Override
   public boolean a(@Nullable bxu $$0, djb $$1, iv $$2, ebe $$3, exn $$4) {
      return false;
   }

   @Override
   public boolean a(djy $$0, iv $$1, ebe $$2, exo $$3) {
      return false;
   }
}
