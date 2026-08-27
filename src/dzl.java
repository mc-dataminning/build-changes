import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzl {
   public static final Codec<dzl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dov.c).fieldOf("height").forGetter(dzl::a), kf.e.q().fieldOf("block").orElse(cyu.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dzl::new)
   );
   private final cys b;
   private final int c;

   public dzl(int $$0, cys $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dlj b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kf.e.b(this.b);
   }
}
