import com.mojang.serialization.MapCodec;

public class djf extends djs {
   public static final MapCodec<djf> a = b(djf::new);

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(aE);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
