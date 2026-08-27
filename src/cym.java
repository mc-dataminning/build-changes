import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cym extends czf implements dgf {
   public static final MapCodec<cym> a = b(cym::new);
   public static final dmv b = dmu.C;

   @Override
   public MapCodec<cym> a() {
      return a;
   }

   protected cym(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return true;
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.a;
   }

   @Override
   protected float d(dme $$0, cvk $$1, ib $$2) {
      return 1.0F;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(b) ? ehs.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ehs.c));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   public cpq a(@Nullable cia $$0, cwf $$1, ib $$2, dme $$3) {
      return $$0 != null && $$0.f() ? dgf.super.a($$0, $$1, $$2, $$3) : cpq.h;
   }

   @Override
   public boolean a(@Nullable cia $$0, cvk $$1, ib $$2, dme $$3, ehq $$4) {
      return $$0 != null && $$0.f() ? dgf.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
