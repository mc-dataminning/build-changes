import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cvv(jn<awd> e, xd f, float g, int h) {
   public static final Codec<cvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awd.b.fieldOf("sound_event").forGetter(cvv::b),
               xf.a.fieldOf("description").forGetter(cvv::c),
               aym.n.fieldOf("length_in_seconds").forGetter(cvv::d),
               aym.a(0, 15).fieldOf("comparator_output").forGetter(cvv::e)
            )
            .apply($$0, cvv::new)
   );
   public static final zb<wo, cvv> b = zb.a(awd.d, cvv::b, xf.b, cvv::c, yz.i, cvv::d, yz.g, cvv::e, cvv::new);
   public static final Codec<jn<cvv>> c = akz.a(lv.L);
   public static final zb<wo, jn<cvv>> d = yz.a(lv.L, b);
   private static final int i = 20;

   public int a() {
      return azd.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jn<cvv>> a(jp.a $$0, cvp $$1) {
      cvu $$2 = $$1.a(kr.W);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jn<awd> b() {
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
