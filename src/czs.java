import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czs(float c, Optional<aku> d) {
   public static final Codec<czs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayh.o.fieldOf("seconds").forGetter(czs::b), aku.a.optionalFieldOf("cooldown_group").forGetter(czs::c)).apply($$0, czs::new)
   );
   public static final ym<vz, czs> b = ym.a(yk.l, czs::b, aku.b.a(yk::a), czs::c, czs::new);

   public czs(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cwn $$0, bvf $$1) {
      if ($$1 instanceof cov $$2) {
         $$2.gE().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<aku> c() {
      return this.d;
   }
}
