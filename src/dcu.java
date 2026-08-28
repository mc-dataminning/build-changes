import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcu(jr<dbk> c, bqu d) implements dcs {
   public static final MapCodec<dcu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.a(lv.aM).fieldOf("enchantments").forGetter(dcu::b), bqu.c.fieldOf("cost").forGetter(dcu::c)).apply($$0, dcu::new)
   );

   @Override
   public void a(cvp $$0, dbq.a $$1, azl $$2, brn $$3) {
      for (dbn $$5 : dbm.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dcu> a() {
      return b;
   }

   public jr<dbk> b() {
      return this.c;
   }

   public bqu c() {
      return this.d;
   }
}
