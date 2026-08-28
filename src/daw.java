import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daw(jj<czl> c, bpl d) implements das {
   public static final MapCodec<daw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czl.b.fieldOf("enchantment").forGetter(daw::b), bpl.c.fieldOf("level").forGetter(daw::c)).apply($$0, daw::new)
   );

   @Override
   public void a(cuc $$0, czr.a $$1, ayo $$2, dcf $$3, ja $$4) {
      $$1.b(this.c, ayg.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<daw> a() {
      return b;
   }

   public jj<czl> b() {
      return this.c;
   }

   public bpl c() {
      return this.d;
   }
}
