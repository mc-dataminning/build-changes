import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cvq(jn<awc> e, xd f, float g, int h) {
   public static final Codec<cvq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awc.b.fieldOf("sound_event").forGetter(cvq::b),
               xf.a.fieldOf("description").forGetter(cvq::c),
               ayl.m.fieldOf("length_in_seconds").forGetter(cvq::d),
               ayl.a(0, 15).fieldOf("comparator_output").forGetter(cvq::e)
            )
            .apply($$0, cvq::new)
   );
   public static final zb<wo, cvq> b = zb.a(awc.d, cvq::b, xf.b, cvq::c, yz.i, cvq::d, yz.g, cvq::e, cvq::new);
   public static final Codec<jn<cvq>> c = aky.a(lv.L);
   public static final zb<wo, jn<cvq>> d = yz.a(lv.L, b);
   private static final int i = 20;

   public int a() {
      return azc.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jn<cvq>> a(jp.a $$0, cvl $$1) {
      cvp $$2 = $$1.a(kr.T);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jn<awc> b() {
      return this.e;
   }

   public xd c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
