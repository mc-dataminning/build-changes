import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czk(float c, Optional<all> d) {
   public static final Codec<czk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.o.fieldOf("seconds").forGetter(czk::b), all.a.optionalFieldOf("cooldown_group").forGetter(czk::c)).apply($$0, czk::new)
   );
   public static final zj<ww, czk> b = zj.a(zh.j, czk::b, all.b.a(zh::a), czk::c, czk::new);

   public czk(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cwf $$0, bve $$1) {
      if ($$1 instanceof cor $$2) {
         $$2.gH().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<all> c() {
      return this.d;
   }
}
