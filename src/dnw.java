import com.mojang.serialization.MapCodec;

public class dnw extends dok {
   public static final MapCodec<dnw> a = b(dnw::new);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(aF);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
