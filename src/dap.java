import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dap(float c, Optional<alz> d) {
   public static final Codec<dap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.o.fieldOf("seconds").forGetter(dap::b), alz.a.optionalFieldOf("cooldown_group").forGetter(dap::c)).apply($$0, dap::new)
   );
   public static final zt<xg, dap> b = zt.a(zr.l, dap::b, alz.b.a(zr::a), dap::c, dap::new);

   public dap(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cxk $$0, bwb $$1) {
      if ($$1 instanceof cps $$2) {
         $$2.gC().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<alz> c() {
      return this.d;
   }
}
