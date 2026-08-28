import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdg(fdt b, ezn c) implements fcx {
   public static final MapCodec<fdg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdu.a.fieldOf("value").forGetter(fdg::c), ezn.a.fieldOf("range").forGetter(fdg::d)).apply($$0, fdg::new)
   );

   @Override
   public fcy b() {
      return fcz.r;
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ezo $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fcx.a a(fdt $$0, ezn $$1) {
      return () -> new fdg($$0, $$1);
   }

   public fdt c() {
      return this.b;
   }

   public ezn d() {
      return this.c;
   }
}
