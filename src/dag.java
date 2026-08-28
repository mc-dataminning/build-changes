import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dag(jg<awq> e, xc f, float g, int h) {
   public static final Codec<dag> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awq.b.fieldOf("sound_event").forGetter(dag::b),
               xe.a.fieldOf("description").forGetter(dag::c),
               ayy.o.fieldOf("length_in_seconds").forGetter(dag::d),
               ayy.a(0, 15).fieldOf("comparator_output").forGetter(dag::e)
            )
            .apply($$0, dag::new)
   );
   public static final za<wn, dag> b = za.a(awq.d, dag::b, xe.b, dag::c, yy.l, dag::d, yy.h, dag::e, dag::new);
   public static final Codec<jg<dag>> c = alh.a(mi.aV);
   public static final za<wn, jg<dag>> d = yy.a(mi.aV, b);
   private static final int i = 20;

   public int a() {
      return azq.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jg<dag>> a(ji.a $$0, daa $$1) {
      daf $$2 = $$1.a(kl.ae);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jg<awq> b() {
      return this.e;
   }

   public xc c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
