import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcj(float c, Optional<alg> d) {
   public static final Codec<dcj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.o.fieldOf("seconds").forGetter(dcj::b), alg.a.optionalFieldOf("cooldown_group").forGetter(dcj::c)).apply($$0, dcj::new)
   );
   public static final yw<wj, dcj> b = yw.a(yu.l, dcj::b, alg.b.a(yu::a), dcj::c, dcj::new);

   public dcj(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(czd $$0, bxe $$1) {
      if ($$1 instanceof crc $$2) {
         $$2.gF().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alg> c() {
      return this.d;
   }
}
