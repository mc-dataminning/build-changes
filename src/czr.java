import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czr(float c, Optional<alj> d) {
   public static final Codec<czr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayv.o.fieldOf("seconds").forGetter(czr::b), alj.a.optionalFieldOf("cooldown_group").forGetter(czr::c)).apply($$0, czr::new)
   );
   public static final zh<wu, czr> b = zh.a(zf.k, czr::b, alj.b.a(zf::a), czr::c, czr::new);

   public czr(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cwm $$0, bvh $$1) {
      if ($$1 instanceof cou $$2) {
         $$2.gC().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alj> c() {
      return this.d;
   }
}
