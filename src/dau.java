import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dau(float c, Optional<alz> d) {
   public static final Codec<dau> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.o.fieldOf("seconds").forGetter(dau::b), alz.a.optionalFieldOf("cooldown_group").forGetter(dau::c)).apply($$0, dau::new)
   );
   public static final zt<xg, dau> b = zt.a(zr.l, dau::b, alz.b.a(zr::a), dau::c, dau::new);

   public dau(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cxp $$0, bwg $$1) {
      if ($$1 instanceof cpx $$2) {
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
