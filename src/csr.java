import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csr(iw<avb> e, int f, float g) {
   public static final Codec<csr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avb.b.fieldOf("sound_event").forGetter(csr::a), axh.j.fieldOf("use_duration").forGetter(csr::b), axh.k.fieldOf("range").forGetter(csr::c)
            )
            .apply($$0, csr::new)
   );
   public static final ys<wf, csr> b = ys.a(avb.d, csr::a, yq.f, csr::b, yq.h, csr::c, csr::new);
   public static final Codec<iw<csr>> c = akd.a(le.E, a);
   public static final ys<wf, iw<csr>> d = yq.a(le.E, b);

   public iw<avb> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
