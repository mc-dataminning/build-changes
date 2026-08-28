import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqd {
   public static final Codec<eqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, efd.c).fieldOf("height").forGetter(eqd::a), mh.e.q().fieldOf("block").orElse(dng.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eqd::new)
   );
   private final dne b;
   private final int c;

   public eqd(int $$0, dne $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public ebg b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mh.e.b(this.b);
   }
}
