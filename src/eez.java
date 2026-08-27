import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eez implements eek {
   public static final Codec<eez> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtc.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dtc.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpf.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eez::new)
   );
   public final dtc b;
   public final dtc c;
   private final bpf d;

   public eez(dtc $$0, dtc $$1, bpf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpf a() {
      return this.d;
   }
}
