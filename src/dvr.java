import com.mojang.serialization.MapCodec;

public class dvr extends dlu {
   public static final MapCodec<dvr> a = b(dvr::new);

   @Override
   public MapCodec<dvr> a() {
      return a;
   }

   public dvr(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      fdw $$4 = new fdw(0.25, 0.05F, 0.25);
      if ($$3 instanceof bwz $$5 && $$5.b(bvg.K)) {
         $$4 = new fdw(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
