import com.mojang.serialization.MapCodec;

public class ddl extends ddx {
   public static final MapCodec<ddl> a = b(ddl::new);

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddl(dna.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(aE);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
