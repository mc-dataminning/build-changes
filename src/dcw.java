import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcw extends cva {
   public static final MapCodec<dcw> a = b(dcw::new);
   private static final ur d = ur.c("container.stonecutter");
   public static final dic b = cyv.aE;
   protected static final ekn c = cva.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dcw> a() {
      return a;
   }

   public dcw(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arb.ay);
         return bix.b;
      }
   }

   @Nullable
   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return new bjf(($$2x, $$3, $$4) -> new cil($$2x, $$3, cgx.a($$1, $$2)), d);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
