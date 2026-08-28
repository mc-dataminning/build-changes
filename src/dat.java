import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dat(float c, Optional<alz> d) {
   public static final Codec<dat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.o.fieldOf("seconds").forGetter(dat::b), alz.a.optionalFieldOf("cooldown_group").forGetter(dat::c)).apply($$0, dat::new)
   );
   public static final zt<xg, dat> b = zt.a(zr.l, dat::b, alz.b.a(zr::a), dat::c, dat::new);

   public dat(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cxo $$0, bwf $$1) {
      if ($$1 instanceof cpw $$2) {
         $$2.gE().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alz> c() {
      return this.d;
   }
}
