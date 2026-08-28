import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcq(float c, Optional<alg> d) {
   public static final Codec<dcq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.o.fieldOf("seconds").forGetter(dcq::b), alg.a.optionalFieldOf("cooldown_group").forGetter(dcq::c)).apply($$0, dcq::new)
   );
   public static final yw<wj, dcq> b = yw.a(yu.l, dcq::b, alg.b.a(yu::a), dcq::c, dcq::new);

   public dcq(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(czk $$0, bxj $$1) {
      if ($$1 instanceof crj $$2) {
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
