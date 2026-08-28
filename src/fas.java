import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fas(fao b, fao c) implements fao {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fap.a.fieldOf("min").forGetter(fas::c), fap.a.fieldOf("max").forGetter(fas::d)).apply($$0, fas::new)
   );

   @Override
   public fan b() {
      return fap.c;
   }

   public static fas a(float $$0, float $$1) {
      return new fas(fal.a($$0), fal.a($$1));
   }

   @Override
   public int a(ewh $$0) {
      return bae.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ewh $$0) {
      return bae.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eza<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fao c() {
      return this.b;
   }

   public fao d() {
      return this.c;
   }
}
