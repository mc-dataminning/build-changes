import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edr implements edc {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsc.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dsc.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpz.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edr::new)
   );
   public final dsc b;
   public final dsc c;
   private final bpz d;

   public edr(dsc $$0, dsc $$1, bpz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpz a() {
      return this.d;
   }
}
