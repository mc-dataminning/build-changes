import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcg(jr<daw> c, bqp d) implements dce {
   public static final MapCodec<dcg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.a(lv.aL).fieldOf("enchantments").forGetter(dcg::b), bqp.c.fieldOf("cost").forGetter(dcg::c)).apply($$0, dcg::new)
   );

   @Override
   public void a(cvl $$0, dbc.a $$1, azk $$2, bri $$3) {
      for (daz $$5 : day.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dcg> a() {
      return b;
   }

   public jr<daw> b() {
      return this.c;
   }

   public bqp c() {
      return this.d;
   }
}
