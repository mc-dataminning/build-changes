import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dct(float c, Optional<alg> d) {
   public static final Codec<dct> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.o.fieldOf("seconds").forGetter(dct::b), alg.a.optionalFieldOf("cooldown_group").forGetter(dct::c)).apply($$0, dct::new)
   );
   public static final yw<wj, dct> b = yw.a(yu.l, dct::b, alg.b.a(yu::a), dct::c, dct::new);

   public dct(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(czn $$0, bxj $$1) {
      if ($$1 instanceof crm $$2) {
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
