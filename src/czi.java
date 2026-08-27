import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czi extends cwy {
   public static final MapCodec<czi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bjh.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, czi::new)
   );
   private final bjh b;

   @Override
   public MapCodec<? extends czi> a() {
      return a;
   }

   public czi(bjh $$0, djo.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, cng $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
