import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dae(jf<awo> e, xa f, float g, int h) {
   public static final Codec<dae> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awo.b.fieldOf("sound_event").forGetter(dae::b),
               xc.a.fieldOf("description").forGetter(dae::c),
               ayw.o.fieldOf("length_in_seconds").forGetter(dae::d),
               ayw.a(0, 15).fieldOf("comparator_output").forGetter(dae::e)
            )
            .apply($$0, dae::new)
   );
   public static final yy<wl, dae> b = yy.a(awo.d, dae::b, xc.b, dae::c, yw.l, dae::d, yw.h, dae::e, dae::new);
   public static final Codec<jf<dae>> c = alf.a(mh.aV);
   public static final yy<wl, jf<dae>> d = yw.a(mh.aV, b);
   private static final int i = 20;

   public int a() {
      return azo.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jf<dae>> a(jh.a $$0, czy $$1) {
      dad $$2 = $$1.a(kk.ae);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jf<awo> b() {
      return this.e;
   }

   public xa c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
