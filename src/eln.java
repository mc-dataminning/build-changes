import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eln {
   public static final Codec<eln> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eat.c).fieldOf("height").forGetter(eln::a), mb.e.q().fieldOf("block").orElse(djp.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eln::new)
   );
   private final djn b;
   private final int c;

   public eln(int $$0, djn $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dwy b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mb.e.b(this.b);
   }
}
