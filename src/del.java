import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record del(jr<dcz> c, bro d) implements deh {
   public static final MapCodec<del> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcz.c.fieldOf("enchantment").forGetter(del::b), bro.c.fieldOf("level").forGetter(del::c)).apply($$0, del::new)
   );

   @Override
   public void a(cwp $$0, ddf.a $$1, azh $$2, bsh $$3) {
      $$1.b(this.c, ayz.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<del> a() {
      return b;
   }

   public jr<dcz> b() {
      return this.c;
   }

   public bro c() {
      return this.d;
   }
}
