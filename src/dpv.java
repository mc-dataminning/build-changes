import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpv extends dhy {
   public static final MapCodec<dpv> a = b(dpv::new);
   private static final xh d = xh.c("container.stonecutter");
   public static final dvx b = dlt.aF;
   protected static final fab c = dhy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   public dpv(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c));
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.ay);
      }

      return bry.a;
   }

   @Nullable
   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return new bsg(($$2x, $$3, $$4) -> new ctm($$2x, $$3, crw.a($$1, $$2)), d);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
