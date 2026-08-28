import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdx(fdt b, fdt c) implements fdt {
   public static final MapCodec<fdx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdu.a.fieldOf("min").forGetter(fdx::c), fdu.a.fieldOf("max").forGetter(fdx::d)).apply($$0, fdx::new)
   );

   @Override
   public fds b() {
      return fdu.c;
   }

   public static fdx a(float $$0, float $$1) {
      return new fdx(fdq.a($$0), fdq.a($$1));
   }

   @Override
   public int a(ezo $$0) {
      return azm.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ezo $$0) {
      return azm.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fdt c() {
      return this.b;
   }

   public fdt d() {
      return this.c;
   }
}
