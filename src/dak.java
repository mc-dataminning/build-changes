import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dak(float c, Optional<aku> d) {
   public static final Codec<dak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.o.fieldOf("seconds").forGetter(dak::b), aku.a.optionalFieldOf("cooldown_group").forGetter(dak::c)).apply($$0, dak::new)
   );
   public static final yn<wa, dak> b = yn.a(yl.l, dak::b, aku.b.a(yl::a), dak::c, dak::new);

   public dak(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cxh $$0, bvy $$1) {
      if ($$1 instanceof cpr $$2) {
         $$2.gH().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<aku> c() {
      return this.d;
   }
}
