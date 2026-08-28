import com.mojang.serialization.MapCodec;

public class dik extends dix {
   public static final MapCodec<dik> a = b(dik::new);

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   public dik(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(aE);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
