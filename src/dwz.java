import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwz {
   public static final Codec<dwz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dmj.c).fieldOf("height").forGetter(dwz::a), kd.e.q().fieldOf("block").orElse(cwl.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dwz::new)
   );
   private final cwj b;
   private final int c;

   public dwz(int $$0, cwj $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dja b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kd.e.b(this.b);
   }
}
