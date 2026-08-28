import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drl(ale e, String f) {
   public static final Codec<drl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a.fieldOf("asset_id").forGetter(drl::a), Codec.STRING.fieldOf("translation_key").forGetter(drl::b)).apply($$0, drl::new)
   );
   public static final zc<wp, drl> b = zc.a(ale.b, drl::a, za.m, drl::b, drl::new);
   public static final Codec<jo<drl>> c = ala.a(lw.d, a);
   public static final zc<wp, jo<drl>> d = za.a(lw.d, b);

   public ale a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
