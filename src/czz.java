import com.mojang.serialization.MapCodec;

public class czz extends dal {
   public static final MapCodec<czz> a = b(czz::new);

   @Override
   public MapCodec<czz> a() {
      return a;
   }

   public czz(djg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(aE);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
