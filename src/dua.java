import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua {
   public static final Codec<dua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, djk.c).fieldOf("height").forGetter(dua::a), jy.f.q().fieldOf("block").orElse(cuc.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dua::new)
   );
   private final cua b;
   private final int c;

   public dua(int $$0, cua $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dgb b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jy.f.b(this.b);
   }
}
