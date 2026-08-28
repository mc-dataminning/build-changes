import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcy(jp<dbm> c, brd d) implements dcu {
   public static final MapCodec<dcy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbm.c.fieldOf("enchantment").forGetter(dcy::b), brd.c.fieldOf("level").forGetter(dcy::c)).apply($$0, dcy::new)
   );

   @Override
   public void a(cvx $$0, dbs.a $$1, azr $$2, brw $$3) {
      $$1.b(this.c, azj.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dcy> a() {
      return b;
   }

   public jp<dbm> b() {
      return this.c;
   }

   public brd c() {
      return this.d;
   }
}
