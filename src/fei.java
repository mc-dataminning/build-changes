import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fei(fem b, fem c) implements fem {
   public static final MapCodec<fei> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fen.a.fieldOf("n").forGetter(fei::c), fen.a.fieldOf("p").forGetter(fei::d)).apply($$0, fei::new)
   );

   @Override
   public fel b() {
      return fen.d;
   }

   @Override
   public int a(fah $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azx $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(fah $$0) {
      return (float)this.a($$0);
   }

   public static fei a(int $$0, float $$1) {
      return new fei(fej.a((float)$$0), fej.a($$1));
   }

   @Override
   public Set<baz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fem c() {
      return this.b;
   }

   public fem d() {
      return this.c;
   }
}
