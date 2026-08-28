import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcq(dck d, dck e, jq<btd> f) implements dcu {
   public static final MapCodec<dcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dck.b.fieldOf("min_damage").forGetter(dcq::b), dck.b.fieldOf("max_damage").forGetter(dcq::c), btd.b.fieldOf("damage_type").forGetter(dcq::d)
            )
            .apply($$0, dcq::new)
   );

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      float $$5 = azm.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new btb(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   public dck b() {
      return this.d;
   }

   public dck c() {
      return this.e;
   }

   public jq<btd> d() {
      return this.f;
   }
}
