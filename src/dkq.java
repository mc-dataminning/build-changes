import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkq extends ddk {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final drs b = drr.E;
   private final boz c = bow.a(5);

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dpm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0.B ? null : a($$2, doi.K, dpm::a);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, cto $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
