import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcw(jt<dbm> c, brd d) implements dcu {
   public static final MapCodec<dcw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.a(ly.aM).fieldOf("enchantments").forGetter(dcw::b), brd.c.fieldOf("cost").forGetter(dcw::c)).apply($$0, dcw::new)
   );

   @Override
   public void a(cvx $$0, dbs.a $$1, azr $$2, brw $$3) {
      for (dbp $$5 : dbo.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dcw> a() {
      return b;
   }

   public jt<dbm> b() {
      return this.c;
   }

   public brd c() {
      return this.d;
   }
}
