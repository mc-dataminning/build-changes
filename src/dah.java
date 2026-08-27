import com.mojang.serialization.MapCodec;

public class dah extends dat {
   public static final MapCodec<dah> a = b(dah::new);

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   public dah(djo.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(aE);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
