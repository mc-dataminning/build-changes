import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cth extends cua implements daz {
   public static final MapCodec<cth> a = b(cth::new);
   public static final dgs b = dgr.C;

   @Override
   public MapCodec<cth> a() {
      return a;
   }

   protected cth(dga.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return true;
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.a;
   }

   @Override
   public float b(dgb $$0, cqf $$1, ht $$2) {
      return 1.0F;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(b) ? ebf.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ebf.c));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public ckj a(@Nullable ccx $$0, cra $$1, ht $$2, dgb $$3) {
      return $$0 != null && $$0.f() ? daz.super.a($$0, $$1, $$2, $$3) : ckj.b;
   }

   @Override
   public boolean a(@Nullable ccx $$0, cqf $$1, ht $$2, dgb $$3, ebd $$4) {
      return $$0 != null && $$0.f() ? daz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
