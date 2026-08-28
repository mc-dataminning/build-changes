import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elm {
   public static final Codec<elm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eas.c).fieldOf("height").forGetter(elm::a), mb.e.q().fieldOf("block").orElse(djo.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, elm::new)
   );
   private final djm b;
   private final int c;

   public elm(int $$0, djm $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dwx b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mb.e.b(this.b);
   }
}
