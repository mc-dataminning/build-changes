import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egf implements egj {
   public static final Codec<egf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvd.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dvd.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               brd.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               brd.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egf::new)
   );
   private final dvd b;
   private final dvd c;
   private final brd d;
   private final brd e;

   public egf(dvd $$0, dvd $$1, brd $$2, brd $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dvd a() {
      return this.b;
   }

   public dvd b() {
      return this.c;
   }

   public brd c() {
      return this.d;
   }

   public brd d() {
      return this.e;
   }
}
