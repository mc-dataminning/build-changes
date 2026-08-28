import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czt(jf<awm> e, wy f, float g, int h) {
   public static final Codec<czt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(czt::b),
               xa.a.fieldOf("description").forGetter(czt::c),
               ayu.o.fieldOf("length_in_seconds").forGetter(czt::d),
               ayu.a(0, 15).fieldOf("comparator_output").forGetter(czt::e)
            )
            .apply($$0, czt::new)
   );
   public static final yw<wj, czt> b = yw.a(awm.d, czt::b, xa.b, czt::c, yu.l, czt::d, yu.h, czt::e, czt::new);
   public static final Codec<jf<czt>> c = ald.a(mh.aV);
   public static final yw<wj, jf<czt>> d = yu.a(mh.aV, b);
   private static final int i = 20;

   public int a() {
      return azm.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jf<czt>> a(jh.a $$0, czn $$1) {
      czs $$2 = $$1.a(kk.ae);
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
