import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlh extends dma implements dtj {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final eaq b = eap.I;

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   protected dlh(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dzz $$0) {
      return $$0.y().c();
   }

   @Override
   protected dsm a_(dzz $$0) {
      return dsm.a;
   }

   @Override
   protected float c(dzz $$0, dib $$1, iu $$2) {
      return 1.0F;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ewh.c));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   public cyy a(@Nullable bxc $$0, diw $$1, iu $$2, dzz $$3) {
      if ($$0 instanceof cqy $$4 && $$4.b()) {
         return dtj.super.a($$0, $$1, $$2, $$3);
      }

      return cyy.k;
   }

   @Override
   public boolean a(@Nullable bxc $$0, dib $$1, iu $$2, dzz $$3, ewf $$4) {
      if ($$0 instanceof cqy $$5 && $$5.b()) {
         return dtj.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
