import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddf extends ddy implements dkz {
   public static final MapCodec<ddf> a = b(ddf::new);
   public static final drs b = drr.C;

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   protected ddf(dra.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return true;
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.a;
   }

   @Override
   protected float d(drb $$0, dad $$1, io $$2) {
      return 1.0F;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(b) ? emv.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == emv.c));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   public cto a(@Nullable clw $$0, day $$1, io $$2, drb $$3) {
      return $$0 != null && $$0.f() ? dkz.super.a($$0, $$1, $$2, $$3) : cto.i;
   }

   @Override
   public boolean a(@Nullable clw $$0, dad $$1, io $$2, drb $$3, emt $$4) {
      return $$0 != null && $$0.f() ? dkz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
