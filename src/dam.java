import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dam(dah d, dah e, jm<brl> f) implements daq {
   public static final MapCodec<dam> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dah.b.fieldOf("min_damage").forGetter(dam::b), dah.b.fieldOf("max_damage").forGetter(dam::c), brl.b.fieldOf("damage_type").forGetter(dam::d)
            )
            .apply($$0, dam::new)
   );

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      float $$5 = ayn.b($$3.dT(), this.d.a($$1), this.e.a($$1));
      $$3.a(new brj(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public dah b() {
      return this.d;
   }

   public dah c() {
      return this.e;
   }

   public jm<brl> d() {
      return this.f;
   }
}
