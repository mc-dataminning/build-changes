import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dal(float c, Optional<alp> d) {
   public static final Codec<dal> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azd.o.fieldOf("seconds").forGetter(dal::b), alp.a.optionalFieldOf("cooldown_group").forGetter(dal::c)).apply($$0, dal::new)
   );
   public static final zi<wv, dal> b = zi.a(zg.l, dal::b, alp.b.a(zg::a), dal::c, dal::new);

   public dal(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cxg $$0, bvx $$1) {
      if ($$1 instanceof cpo $$2) {
         $$2.gE().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alp> c() {
      return this.d;
   }
}
