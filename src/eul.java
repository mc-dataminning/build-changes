import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eul(euo b, euo c) implements euo {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eup.a.fieldOf("n").forGetter(eul::c), eup.a.fieldOf("p").forGetter(eul::d)).apply($$0, eul::new)
   );

   @Override
   public eun b() {
      return eup.d;
   }

   @Override
   public int a(eqj $$0) {
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
   public float b(eqj $$0) {
      return (float)this.a($$0);
   }

   public static eul a(int $$0, float $$1) {
      return new eul(eum.a((float)$$0), eum.a($$1));
   }

   @Override
   public Set<etc<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public euo c() {
      return this.b;
   }

   public euo d() {
      return this.c;
   }
}
