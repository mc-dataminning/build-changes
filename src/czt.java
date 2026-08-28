import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czt(float c, Optional<akv> d) {
   public static final Codec<czt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.o.fieldOf("seconds").forGetter(czt::b), akv.a.optionalFieldOf("cooldown_group").forGetter(czt::c)).apply($$0, czt::new)
   );
   public static final yn<wa, czt> b = yn.a(yl.l, czt::b, akv.b.a(yl::a), czt::c, czt::new);

   public czt(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cwo $$0, bvg $$1) {
      if ($$1 instanceof cow $$2) {
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
