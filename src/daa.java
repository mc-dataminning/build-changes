import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class daa extends dbo {
   public static final MapCodec<daa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(avc.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, daa::new)
   );
   private final avc b;

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   public daa(avc $$0, dli.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dlj $$0, cux $$1, hz $$2) {
      return this.b.a();
   }
}
