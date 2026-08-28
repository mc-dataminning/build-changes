import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epn {
   public static final Codec<epn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eeq.c).fieldOf("height").forGetter(epn::a), mg.e.q().fieldOf("block").orElse(dmt.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, epn::new)
   );
   private final dmr b;
   private final int c;

   public epn(int $$0, dmr $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public eat b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mg.e.b(this.b);
   }
}
