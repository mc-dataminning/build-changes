import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dce(float c, Optional<alg> d) {
   public static final Codec<dce> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.o.fieldOf("seconds").forGetter(dce::b), alg.a.optionalFieldOf("cooldown_group").forGetter(dce::c)).apply($$0, dce::new)
   );
   public static final yw<wj, dce> b = yw.a(yu.l, dce::b, alg.b.a(yu::a), dce::c, dce::new);

   public dce(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cyy $$0, bxc $$1) {
      if ($$1 instanceof cqy $$2) {
         $$2.gE().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alg> c() {
      return this.d;
   }
}
