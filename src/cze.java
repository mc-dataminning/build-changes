import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cze(je<awm> e, wy f, float g, int h) {
   public static final Codec<cze> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(cze::b),
               xa.a.fieldOf("description").forGetter(cze::c),
               ayu.o.fieldOf("length_in_seconds").forGetter(cze::d),
               ayu.a(0, 15).fieldOf("comparator_output").forGetter(cze::e)
            )
            .apply($$0, cze::new)
   );
   public static final yw<wj, cze> b = yw.a(awm.d, cze::b, xa.b, cze::c, yu.l, cze::d, yu.h, cze::e, cze::new);
   public static final Codec<je<cze>> c = ald.a(mg.aU);
   public static final yw<wj, je<cze>> d = yu.a(mg.aU, b);
   private static final int i = 20;

   public int a() {
      return azm.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<je<cze>> a(jg.a $$0, cyy $$1) {
      czd $$2 = $$1.a(kj.ae);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public je<awm> b() {
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
