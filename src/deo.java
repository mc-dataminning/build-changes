import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deo extends dfh implements dmi {
   public static final MapCodec<deo> a = b(deo::new);
   public static final dtb b = dta.C;

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   protected deo(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.a;
   }

   @Override
   protected float d(dsk $$0, dbl $$1, ja $$2) {
      return 1.0F;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(b) ? eoi.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eoi.c));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   public cuc a(@Nullable cmk $$0, dcg $$1, ja $$2, dsk $$3) {
      return $$0 != null && $$0.f() ? dmi.super.a($$0, $$1, $$2, $$3) : cuc.l;
   }

   @Override
   public boolean a(@Nullable cmk $$0, dbl $$1, ja $$2, dsk $$3, eog $$4) {
      return $$0 != null && $$0.f() ? dmi.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
