import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezt(ezx b, ezx c) implements ezx {
   public static final MapCodec<ezt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezy.a.fieldOf("n").forGetter(ezt::c), ezy.a.fieldOf("p").forGetter(ezt::d)).apply($$0, ezt::new)
   );

   @Override
   public ezw b() {
      return ezy.d;
   }

   @Override
   public int a(evs $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azh $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(evs $$0) {
      return (float)this.a($$0);
   }

   public static ezt a(int $$0, float $$1) {
      return new ezt(ezu.a((float)$$0), ezu.a($$1));
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ezx c() {
      return this.b;
   }

   public ezx d() {
      return this.c;
   }
}
