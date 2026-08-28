import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dct(jq<awn> d, brk e, brk f) implements dcn {
   public static final MapCodec<dct> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awn.b.fieldOf("sound").forGetter(dct::b),
               brk.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dct::c),
               brk.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dct::d)
            )
            .apply($$0, dct::new)
   );

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      azv $$5 = $$3.eb();
      if (!$$3.bd()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.do(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   public jq<awn> b() {
      return this.d;
   }

   public brk c() {
      return this.e;
   }

   public brk d() {
      return this.f;
   }
}
