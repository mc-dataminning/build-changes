import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daf(jj<ave> d, bpg e, bpg f) implements czz {
   public static final MapCodec<daf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ave.b.fieldOf("sound").forGetter(daf::b),
               bpg.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(daf::c),
               bpg.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(daf::d)
            )
            .apply($$0, daf::new)
   );

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      aym $$5 = $$3.dS();
      $$3.a(this.d.a(), this.e.a($$5), this.f.a($$5));
   }

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   public jj<ave> b() {
      return this.d;
   }

   public bpg c() {
      return this.e;
   }

   public bpg d() {
      return this.f;
   }
}
