import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvg extends cvz implements dcz {
   public static final MapCodec<cvg> a = b(cvg::new);
   public static final djg b = djf.C;

   @Override
   public MapCodec<cvg> a() {
      return a;
   }

   protected cvg(dio.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return true;
   }

   @Override
   public dce b_(dip $$0) {
      return dce.a;
   }

   @Override
   public float d(dip $$0, cse $$1, hv $$2) {
      return 1.0F;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(b) ? eea.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eea.c));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public cmh a(@Nullable cer $$0, csz $$1, hv $$2, dip $$3) {
      return $$0 != null && $$0.f() ? dcz.super.a($$0, $$1, $$2, $$3) : cmh.f;
   }

   @Override
   public boolean a(@Nullable cer $$0, cse $$1, hv $$2, dip $$3, edy $$4) {
      return $$0 != null && $$0.f() ? dcz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
