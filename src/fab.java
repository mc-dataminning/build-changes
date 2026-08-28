import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fab(fao b, ewg c) implements ezs {
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fap.a.fieldOf("value").forGetter(fab::c), ewg.a.fieldOf("range").forGetter(fab::d)).apply($$0, fab::new)
   );

   @Override
   public ezt b() {
      return ezu.r;
   }

   @Override
   public Set<eza<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ewh $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ezs.a a(fao $$0, ewg $$1) {
      return () -> new fab($$0, $$1);
   }

   public fao c() {
      return this.b;
   }

   public ewg d() {
      return this.c;
   }
}
