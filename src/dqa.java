import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqa {
   public static final Codec<dqa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dfk.c).fieldOf("height").forGetter(dqa::a), jb.f.q().fieldOf("block").orElse(cpo.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dqa::new)
   );
   private final cpn b;
   private final int c;

   public dqa(int $$0, cpn $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dcb b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jb.f.b(this.b);
   }
}
