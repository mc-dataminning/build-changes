import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czq(jf<awm> e, wy f, float g, int h) {
   public static final Codec<czq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(czq::b),
               xa.a.fieldOf("description").forGetter(czq::c),
               ayu.o.fieldOf("length_in_seconds").forGetter(czq::d),
               ayu.a(0, 15).fieldOf("comparator_output").forGetter(czq::e)
            )
            .apply($$0, czq::new)
   );
   public static final yw<wj, czq> b = yw.a(awm.d, czq::b, xa.b, czq::c, yu.l, czq::d, yu.h, czq::e, czq::new);
   public static final Codec<jf<czq>> c = ald.a(mh.aV);
   public static final yw<wj, jf<czq>> d = yu.a(mh.aV, b);
   private static final int i = 20;

   public int a() {
      return azm.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jf<czq>> a(jh.a $$0, czk $$1) {
      czp $$2 = $$1.a(kk.ae);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jf<awm> b() {
      return this.e;
   }

   public wy c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
