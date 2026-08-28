import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhs extends dfi {
   public static final MapCodec<dhs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpm.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhs::new)
   );
   private final bpm b;

   @Override
   public MapCodec<? extends dhs> a() {
      return a;
   }

   public dhs(bpm $$0, dsk.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, cud $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
