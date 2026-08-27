import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eep {
   public static final Codec<eep> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dtz.c).fieldOf("height").forGetter(eep::a), ld.e.q().fieldOf("block").orElse(ddg.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eep::new)
   );
   private final dde b;
   private final int c;

   public eep(int $$0, dde $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dqh b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + ld.e.b(this.b);
   }
}
