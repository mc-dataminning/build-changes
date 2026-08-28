import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgi(je<awm> d, bte e, bte f) implements dgc {
   public static final MapCodec<dgi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound").forGetter(dgi::b),
               bte.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dgi::c),
               bte.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dgi::d)
            )
            .apply($$0, dgi::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      azv $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public je<awm> b() {
      return this.d;
   }

   public bte c() {
      return this.e;
   }

   public bte d() {
      return this.f;
   }
}
