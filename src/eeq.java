import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeq(iw<csu> c, ees d) {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ake.a(le.G).fieldOf("display").forGetter($$0x -> $$0x.c), ees.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eeq::new)
   );
   public static final Codec<iw<eeq>> b = akd.a(le.aF, a);

   public iw<csu> a() {
      return this.c;
   }

   public ees b() {
      return this.d;
   }
}
