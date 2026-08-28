import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eki {
   public static final Codec<eki> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dzq.c).fieldOf("height").forGetter(eki::a), lz.e.q().fieldOf("block").orElse(dis.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eki::new)
   );
   private final diq b;
   private final int c;

   public eki(int $$0, diq $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dvv b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lz.e.b(this.b);
   }
}
