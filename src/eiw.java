import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiw implements eis {
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebi.c).fieldOf("height").forGetter($$0x -> $$0x.b), dxn.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eiw::new)
   );
   public final int b;
   public final dxn c;

   public eiw(int $$0, dxn $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
