import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmj extends dnc implements dun {
   public static final MapCodec<dmj> a = b(dmj::new);
   public static final ebv b = ebu.I;

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   protected dmj(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(ebe $$0) {
      return $$0.y().c();
   }

   @Override
   protected dtp a_(ebe $$0) {
      return dtp.a;
   }

   @Override
   protected float c(ebe $$0, djb $$1, iv $$2) {
      return 1.0F;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == exp.c));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   public czy a(@Nullable bxu $$0, djy $$1, iv $$2, ebe $$3) {
      if ($$0 instanceof crx $$4 && $$4.b()) {
         return dun.super.a($$0, $$1, $$2, $$3);
      }

      return czy.k;
   }

   @Override
   public boolean a(@Nullable bxu $$0, djb $$1, iv $$2, ebe $$3, exn $$4) {
      if ($$0 instanceof crx $$5 && $$5.b()) {
         return dun.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
