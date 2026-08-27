import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crv(iv<auy> e, int f, float g) {
   public static final Codec<crv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               auy.b.fieldOf("sound_event").forGetter(crv::a), axe.j.fieldOf("use_duration").forGetter(crv::b), axe.k.fieldOf("range").forGetter(crv::c)
            )
            .apply($$0, crv::new)
   );
   public static final yq<wd, crv> b = yq.a(auy.d, crv::a, yo.f, crv::b, yo.h, crv::c, crv::new);
   public static final Codec<iv<crv>> c = akb.a(ld.E, a);
   public static final yq<wd, iv<crv>> d = yo.a(ld.E, b);

   public iv<auy> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
