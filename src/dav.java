import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dav(jn<czm> c, bpm d) implements dat {
   public static final MapCodec<dav> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.a(lr.aK).fieldOf("enchantments").forGetter(dav::b), bpm.c.fieldOf("cost").forGetter(dav::c)).apply($$0, dav::new)
   );

   @Override
   public void a(cud $$0, czs.a $$1, ayo $$2, bqf $$3) {
      for (czp $$5 : czo.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dav> a() {
      return b;
   }

   public jn<czm> b() {
      return this.c;
   }

   public bpm c() {
      return this.d;
   }
}
