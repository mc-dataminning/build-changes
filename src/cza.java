import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cza(float c, Optional<alh> d) {
   public static final Codec<cza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.o.fieldOf("seconds").forGetter(cza::b), alh.a.optionalFieldOf("cooldown_group").forGetter(cza::c)).apply($$0, cza::new)
   );
   public static final zf<ws, cza> b = zf.a(zd.j, cza::b, alh.b.a(zd::a), cza::c, cza::new);

   public cza(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cvx $$0, buv $$1) {
      if ($$1 instanceof coh $$2) {
         $$2.gF().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alh> c() {
      return this.d;
   }
}
