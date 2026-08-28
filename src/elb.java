import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elb implements ekx {
   public static final Codec<elb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, edl.c).fieldOf("height").forGetter($$0x -> $$0x.b), dzo.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, elb::new)
   );
   public final int b;
   public final dzo c;

   public elb(int $$0, dzo $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
