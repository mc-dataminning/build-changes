import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddb(dck c) implements dcw {
   public static final MapCodec<ddb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dck.b.fieldOf("chance").forGetter(ddb::b)).apply($$0, ddb::new));

   @Override
   public float a(int $$0, azu $$1, float $$2) {
      float $$3 = this.c.a($$0);
      int $$4 = 0;

      for (int $$5 = 0; (float)$$5 < $$2; $$5++) {
         if ($$1.i() < $$3) {
            $$4++;
         }
      }

      return $$2 - (float)$$4;
   }

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   public dck b() {
      return this.c;
   }
}
