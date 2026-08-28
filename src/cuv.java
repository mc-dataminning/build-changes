import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cuv(jm<avo> e, wz f, float g, int h) {
   public static final Codec<cuv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avo.b.fieldOf("sound_event").forGetter(cuv::b),
               xb.a.fieldOf("description").forGetter(cuv::c),
               axw.m.fieldOf("length_in_seconds").forGetter(cuv::d),
               axw.a(0, 15).fieldOf("comparator_output").forGetter(cuv::e)
            )
            .apply($$0, cuv::new)
   );
   public static final yx<wk, cuv> b = yx.a(avo.d, cuv::b, xb.b, cuv::c, yv.i, cuv::d, yv.g, cuv::e, cuv::new);
   public static final Codec<jm<cuv>> c = ako.a(lu.L);
   public static final yx<wk, jm<cuv>> d = yv.a(lu.L, b);
   private static final int i = 20;

   public int a() {
      return ayo.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jm<cuv>> a(jo.a $$0, cuq $$1) {
      cuu $$2 = $$1.a(kq.R);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jm<avo> b() {
      return this.e;
   }

   public wz c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
