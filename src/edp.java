import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edp implements eda {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsa.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dsa.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpx.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edp::new)
   );
   public final dsa b;
   public final dsa c;
   private final bpx d;

   public edp(dsa $$0, dsa $$1, bpx $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpx a() {
      return this.d;
   }
}
