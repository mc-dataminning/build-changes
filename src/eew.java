import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eew implements eeh {
   public static final Codec<eew> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtc.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dtc.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpw.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eew::new)
   );
   public final dtc b;
   public final dtc c;
   private final bpw d;

   public eew(dtc $$0, dtc $$1, bpw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpw a() {
      return this.d;
   }
}
