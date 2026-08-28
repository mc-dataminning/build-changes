import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqn {
   public static final Codec<eqn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, efn.c).fieldOf("height").forGetter(eqn::a), mh.e.q().fieldOf("block").orElse(dnq.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eqn::new)
   );
   private final dno b;
   private final int c;

   public eqn(int $$0, dno $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public ebq b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mh.e.b(this.b);
   }
}
