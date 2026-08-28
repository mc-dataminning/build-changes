import com.mojang.serialization.MapCodec;

public class dmp extends dlt {
   public static final MapCodec<dmp> a = b(dmp::new);
   private static final xh b = xh.c("container.loom");

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   protected dmp(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.ax);
      }

      return bry.a;
   }

   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return new bsg(($$2x, $$3, $$4) -> new csq($$2x, $$3, crw.a($$1, $$2)), b);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(aF);
   }
}
