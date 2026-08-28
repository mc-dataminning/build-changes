import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exz(eyd b, eyd c) implements eyd {
   public static final MapCodec<exz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eye.a.fieldOf("n").forGetter(exz::c), eye.a.fieldOf("p").forGetter(exz::d)).apply($$0, exz::new)
   );

   @Override
   public eyc b() {
      return eye.d;
   }

   @Override
   public int a(etw $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azr $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(etw $$0) {
      return (float)this.a($$0);
   }

   public static exz a(int $$0, float $$1) {
      return new exz(eya.a((float)$$0), eya.a($$1));
   }

   @Override
   public Set<ewp<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eyd c() {
      return this.b;
   }

   public eyd d() {
      return this.c;
   }
}
