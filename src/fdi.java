import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdi(fdm b, fdm c) implements fdm {
   public static final MapCodec<fdi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdn.a.fieldOf("n").forGetter(fdi::c), fdn.a.fieldOf("p").forGetter(fdi::d)).apply($$0, fdi::new)
   );

   @Override
   public fdl b() {
      return fdn.d;
   }

   @Override
   public int a(ezh $$0) {
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
   public float b(ezh $$0) {
      return (float)this.a($$0);
   }

   public static fdi a(int $$0, float $$1) {
      return new fdi(fdj.a((float)$$0), fdj.a($$1));
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fdm c() {
      return this.b;
   }

   public fdm d() {
      return this.c;
   }
}
