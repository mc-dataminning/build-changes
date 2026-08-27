import com.mojang.serialization.MapCodec;

public class dip extends djc {
   public static final MapCodec<dip> a = b(dip::new);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(aE);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(aE, $$0.g().g());
   }
}
