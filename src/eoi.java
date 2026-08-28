import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eoi {
   public static final Codec<eoi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, edl.c).fieldOf("height").forGetter(eoi::a), mf.e.q().fieldOf("block").orElse(dlw.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eoi::new)
   );
   private final dlu b;
   private final int c;

   public eoi(int $$0, dlu $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dzo b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mf.e.b(this.b);
   }
}
