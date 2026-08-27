import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class der extends dch {
   public static final MapCodec<der> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bnk.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, der::new)
   );
   private final bnk b;

   @Override
   public MapCodec<? extends der> a() {
      return a;
   }

   public der(bnk $$0, dph.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, crs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
