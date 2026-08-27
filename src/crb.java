import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crb(il<aul> e, int f, float g) {
   public static final Codec<crb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aul.b.fieldOf("sound_event").forGetter(crb::a), aws.j.fieldOf("use_duration").forGetter(crb::b), aws.k.fieldOf("range").forGetter(crb::c)
            )
            .apply($$0, crb::new)
   );
   public static final ye<vr, crb> b = ye.a(aul.d, crb::a, yc.f, crb::b, yc.h, crb::c, crb::new);
   public static final Codec<il<crb>> c = ajp.a(ks.D, a);
   public static final ye<vr, il<crb>> d = yc.a(ks.D, b);

   public il<aul> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
