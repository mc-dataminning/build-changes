import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwo {
   public static final Codec<dwo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dly.c).fieldOf("height").forGetter(dwo::a), kb.e.q().fieldOf("block").orElse(cwb.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dwo::new)
   );
   private final cvz b;
   private final int c;

   public dwo(int $$0, cvz $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dip b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kb.e.b(this.b);
   }
}
