import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dno implements duz {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final ech b = ecg.I;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   protected dmv(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(ebq $$0) {
      return $$0.y().c();
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }

   @Override
   protected float c(ebq $$0, djn $$1, iw $$2) {
      return 1.0F;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eyb.c));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   public dak a(@Nullable byf $$0, dkk $$1, iw $$2, ebq $$3) {
      if ($$0 instanceof csi $$4 && $$4.gz()) {
         return duz.super.a($$0, $$1, $$2, $$3);
      }

      return dak.l;
   }

   @Override
   public boolean a(@Nullable byf $$0, djn $$1, iw $$2, ebq $$3, exz $$4) {
      if ($$0 instanceof csi $$5 && $$5.gz()) {
         return duz.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
