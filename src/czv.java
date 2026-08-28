import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czv(float c, Optional<akv> d) {
   public static final Codec<czv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.o.fieldOf("seconds").forGetter(czv::b), akv.a.optionalFieldOf("cooldown_group").forGetter(czv::c)).apply($$0, czv::new)
   );
   public static final yn<wa, czv> b = yn.a(yl.l, czv::b, akv.b.a(yl::a), czv::c, czv::new);

   public czv(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cwq $$0, bvi $$1) {
      if ($$1 instanceof coy $$2) {
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
