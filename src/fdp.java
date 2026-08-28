import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdp(fdt b, fdt c) implements fdt {
   public static final MapCodec<fdp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdu.a.fieldOf("n").forGetter(fdp::c), fdu.a.fieldOf("p").forGetter(fdp::d)).apply($$0, fdp::new)
   );

   @Override
   public fds b() {
      return fdu.d;
   }

   @Override
   public int a(ezo $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azv $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ezo $$0) {
      return (float)this.a($$0);
   }

   public static fdp a(int $$0, float $$1) {
      return new fdp(fdq.a((float)$$0), fdq.a($$1));
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
