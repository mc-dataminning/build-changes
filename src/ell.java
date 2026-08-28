import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ell {
   public static final Codec<ell> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ear.c).fieldOf("height").forGetter(ell::a), mb.e.q().fieldOf("block").orElse(djn.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ell::new)
   );
   private final djl b;
   private final int c;

   public ell(int $$0, djl $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dww b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mb.e.b(this.b);
   }
}
