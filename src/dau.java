import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dau(jn<czl> c, bpl d) implements das {
   public static final MapCodec<dau> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.a(lr.aK).fieldOf("enchantments").forGetter(dau::b), bpl.c.fieldOf("cost").forGetter(dau::c)).apply($$0, dau::new)
   );

   @Override
   public void a(cuc $$0, czr.a $$1, ayo $$2, dcf $$3, ja $$4) {
      for (czo $$6 : czn.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$6.a, $$6.b);
      }
   }

   @Override
   public MapCodec<dau> a() {
      return b;
   }

   public jn<czl> b() {
      return this.c;
   }

   public bpl c() {
      return this.d;
   }
}
