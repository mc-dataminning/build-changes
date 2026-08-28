import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dck(jo<awf> d, bqv e, bqv f) implements dce {
   public static final MapCodec<dck> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awf.b.fieldOf("sound").forGetter(dck::b),
               bqv.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dck::c),
               bqv.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dck::d)
            )
            .apply($$0, dck::new)
   );

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      azn $$5 = $$3.dV();
      if (!$$3.ba()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.di(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dck> a() {
      return a;
   }

   public jo<awf> b() {
      return this.d;
   }

   public bqv c() {
      return this.e;
   }

   public bqv d() {
      return this.f;
   }
}
