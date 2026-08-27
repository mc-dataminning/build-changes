import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record enp(ens b, ens c) implements ens {
   public static final Codec<enp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ent.a.fieldOf("n").forGetter(enp::c), ent.a.fieldOf("p").forGetter(enp::d)).apply($$0, enp::new)
   );

   @Override
   public enr b() {
      return ent.d;
   }

   @Override
   public int a(ejy $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      awt $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ejy $$0) {
      return (float)this.a($$0);
   }

   public static enp a(int $$0, float $$1) {
      return new enp(enq.a((float)$$0), enq.a($$1));
   }

   @Override
   public Set<emg<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ens c() {
      return this.b;
   }

   public ens d() {
      return this.c;
   }
}
