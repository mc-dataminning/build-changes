import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record feb(feo b, fai c) implements fds {
   public static final MapCodec<feb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fep.a.fieldOf("value").forGetter(feb::c), fai.a.fieldOf("range").forGetter(feb::d)).apply($$0, feb::new)
   );

   @Override
   public fdt b() {
      return fdu.r;
   }

   @Override
   public Set<bbb<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(faj $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fds.a a(feo $$0, fai $$1) {
      return () -> new feb($$0, $$1);
   }

   public feo c() {
      return this.b;
   }

   public fai d() {
      return this.c;
   }
}
