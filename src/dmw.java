import com.mojang.serialization.MapCodec;

public class dmw extends dnk {
   public static final MapCodec<dmw> a = b(dmw::new);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dww.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(aF);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
