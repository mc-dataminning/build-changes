import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyz extends cwp {
   public static final MapCodec<cyz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bjf.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, cyz::new)
   );
   private final bjf b;

   @Override
   public MapCodec<? extends cyz> a() {
      return a;
   }

   public cyz(bjf $$0, djf.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, cmx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
