import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbx(dbr d, dbr e, jn<bsi> f) implements dcb {
   public static final MapCodec<dbx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbr.b.fieldOf("min_damage").forGetter(dbx::b), dbr.b.fieldOf("max_damage").forGetter(dbx::c), bsi.b.fieldOf("damage_type").forGetter(dbx::d)
            )
            .apply($$0, dbx::new)
   );

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      float $$5 = azd.b($$3.dV(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bsg(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   public dbr b() {
      return this.d;
   }

   public dbr c() {
      return this.e;
   }

   public jn<bsi> d() {
      return this.f;
   }
}
