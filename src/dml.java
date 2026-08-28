import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dml extends dne implements dup {
   public static final MapCodec<dml> a = b(dml::new);
   public static final ebx b = ebw.I;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   protected dml(ebf.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(ebg $$0) {
      return $$0.y().c();
   }

   @Override
   protected dtr a_(ebg $$0) {
      return dtr.a;
   }

   @Override
   protected float c(ebg $$0, djd $$1, iw $$2) {
      return 1.0F;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(b) ? exr.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == exr.c));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   public daa a(@Nullable bxw $$0, dka $$1, iw $$2, ebg $$3) {
      if ($$0 instanceof crz $$4 && $$4.b()) {
         return dup.super.a($$0, $$1, $$2, $$3);
      }

      return daa.k;
   }

   @Override
   public boolean a(@Nullable bxw $$0, djd $$1, iw $$2, ebg $$3, exp $$4) {
      if ($$0 instanceof crz $$5 && $$5.b()) {
         return dup.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
