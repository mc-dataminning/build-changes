import com.mojang.serialization.MapCodec;

public class dks extends dlf {
   public static final MapCodec<dks> a = b(dks::new);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dun.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(aF, $$0.g().g());
   }
}
