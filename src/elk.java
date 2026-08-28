import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elk {
   public static final Codec<elk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eaq.c).fieldOf("height").forGetter(elk::a), mb.e.q().fieldOf("block").orElse(djm.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, elk::new)
   );
   private final djk b;
   private final int c;

   public elk(int $$0, djk $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dwv b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mb.e.b(this.b);
   }
}
