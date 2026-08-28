import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cyy(je<awk> e, ww f, float g, int h) {
   public static final Codec<cyy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awk.b.fieldOf("sound_event").forGetter(cyy::b),
               wy.a.fieldOf("description").forGetter(cyy::c),
               ays.o.fieldOf("length_in_seconds").forGetter(cyy::d),
               ays.a(0, 15).fieldOf("comparator_output").forGetter(cyy::e)
            )
            .apply($$0, cyy::new)
   );
   public static final yu<wh, cyy> b = yu.a(awk.d, cyy::b, wy.b, cyy::c, ys.l, cyy::d, ys.h, cyy::e, cyy::new);
   public static final Codec<je<cyy>> c = alb.a(mg.aT);
   public static final yu<wh, je<cyy>> d = ys.a(mg.aT, b);
   private static final int i = 20;

   public int a() {
      return azk.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<je<cyy>> a(jg.a $$0, cys $$1) {
      cyx $$2 = $$1.a(kj.ae);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public je<awk> b() {
      return this.e;
   }

   public ww c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
