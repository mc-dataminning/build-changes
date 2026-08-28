import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eir implements eic {
   public static final Codec<eir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwx.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dwx.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bro.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eir::new)
   );
   public final dwx b;
   public final dwx c;
   private final bro d;

   public eir(dwx $$0, dwx $$1, bro $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bro a() {
      return this.d;
   }
}
