import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmp extends dfi {
   public static final MapCodec<dmp> a = b(dmp::new);
   public static final dtr b = dtq.E;
   private final bpv c = bps.a(5);

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0.B ? null : a($$2, dqh.K, drm::a);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
