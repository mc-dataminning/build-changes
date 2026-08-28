import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dck(dbt c) implements dcf {
   public static final MapCodec<dck> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.b.fieldOf("chance").forGetter(dck::b)).apply($$0, dck::new));

   @Override
   public float a(int $$0, azr $$1, float $$2) {
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
   public MapCodec<dck> a() {
      return a;
   }

   public dbt b() {
      return this.c;
   }
}
