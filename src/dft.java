import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dft(dfm d, dfm e, je<bur> f) implements dfw {
   public static final MapCodec<dft> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfm.b.fieldOf("min_damage").forGetter(dft::b), dfm.b.fieldOf("max_damage").forGetter(dft::c), bur.b.fieldOf("damage_type").forGetter(dft::d)
            )
            .apply($$0, dft::new)
   );

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      float $$5 = azk.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bup(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dfm b() {
      return this.d;
   }

   public dfm c() {
      return this.e;
   }

   public je<bur> d() {
      return this.f;
   }
}
