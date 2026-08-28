import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fek(feo b, feo c) implements feo {
   public static final MapCodec<fek> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fep.a.fieldOf("n").forGetter(fek::c), fep.a.fieldOf("p").forGetter(fek::d)).apply($$0, fek::new)
   );

   @Override
   public fen b() {
      return fep.d;
   }

   @Override
   public int a(faj $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azz $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(faj $$0) {
      return (float)this.a($$0);
   }

   public static fek a(int $$0, float $$1) {
      return new fek(fel.a((float)$$0), fel.a($$1));
   }

   @Override
   public Set<bbb<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public feo c() {
      return this.b;
   }

   public feo d() {
      return this.c;
   }
}
