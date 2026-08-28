import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cyy(float c, Optional<alc> d) {
   public static final Codec<cyy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aym.n.fieldOf("seconds").forGetter(cyy::b), alc.a.optionalFieldOf("cooldownGroup").forGetter(cyy::c)).apply($$0, cyy::new)
   );
   public static final zb<wo, cyy> b = zb.a(yz.i, cyy::b, alc.b.a(yz::a), cyy::c, cyy::new);

   public cyy(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cvp $$0, buk $$1) {
      if ($$1 instanceof cnu $$2) {
         $$2.gx().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alc> c() {
      return this.d;
   }
}
