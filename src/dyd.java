import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyd(alr e, String f) {
   public static final Codec<dyd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alr.a.fieldOf("asset_id").forGetter(dyd::a), Codec.STRING.fieldOf("translation_key").forGetter(dyd::b)).apply($$0, dyd::new)
   );
   public static final ze<wp, dyd> b = ze.a(alr.b, dyd::a, zc.p, dyd::b, dyd::new);
   public static final Codec<jg<dyd>> c = aln.a(mi.aF, a);
   public static final ze<wp, jg<dyd>> d = zc.a(mi.aF, b);

   public alr a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
