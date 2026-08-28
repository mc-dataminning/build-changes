import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgc(je<awk> d, btb e, btb f) implements dfw {
   public static final MapCodec<dgc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awk.b.fieldOf("sound").forGetter(dgc::b),
               btb.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dgc::c),
               btb.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dgc::d)
            )
            .apply($$0, dgc::new)
   );

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      azt $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public je<awk> b() {
      return this.d;
   }

   public btb c() {
      return this.e;
   }

   public btb d() {
      return this.f;
   }
}
