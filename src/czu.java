import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czu(float c, Optional<akv> d) {
   public static final Codec<czu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.o.fieldOf("seconds").forGetter(czu::b), akv.a.optionalFieldOf("cooldown_group").forGetter(czu::c)).apply($$0, czu::new)
   );
   public static final yn<wa, czu> b = yn.a(yl.l, czu::b, akv.b.a(yl::a), czu::c, czu::new);

   public czu(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cwp $$0, bvh $$1) {
      if ($$1 instanceof cox $$2) {
         $$2.gE().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<akv> c() {
      return this.d;
   }
}
