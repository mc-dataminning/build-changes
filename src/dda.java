import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dda(jq<awm> d, brn e, brn f) implements dcu {
   public static final MapCodec<dda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound").forGetter(dda::b),
               brn.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dda::c),
               brn.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dda::d)
            )
            .apply($$0, dda::new)
   );

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      azu $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   public jq<awm> b() {
      return this.d;
   }

   public brn c() {
      return this.e;
   }

   public brn d() {
      return this.f;
   }
}
