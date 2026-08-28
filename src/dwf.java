import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwf extends dpx implements dsl {
   public static final MapCodec<dwf> c = b(dwf::new);
   public static final eco<ecm> d = dpx.b;
   private static final fgw e = dno.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dwf> a() {
      return c;
   }

   public dwf(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.c($$1, $$2, jc.b) && !$$0.a(dnq.lp);
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(dnq.bG);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = super.a($$0);
      if ($$1 != null) {
         eya $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axs.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      if ($$0.c(d) == ecm.a) {
         ebq $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == ecm.b;
      } else {
         eya $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axs.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eya b_(ebq $$0) {
      return eyb.c.a(false);
   }

   @Override
   public boolean a(@Nullable byf $$0, djn $$1, iw $$2, ebq $$3, exz $$4) {
      return false;
   }

   @Override
   public boolean a(dkk $$0, iw $$1, ebq $$2, eya $$3) {
      return false;
   }
}
