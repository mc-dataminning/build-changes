import com.mojang.serialization.MapCodec;

public class dmv extends dnj {
   public static final MapCodec<dmv> a = b(dmv::new);

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(aF);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
