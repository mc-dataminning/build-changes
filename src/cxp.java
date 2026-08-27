import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxp extends cvf {
   public static final MapCodec<cxp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(big.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, cxp::new)
   );
   private final big b;

   @Override
   public MapCodec<? extends cxp> a() {
      return a;
   }

   public cxp(big $$0, dhm.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, clo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
