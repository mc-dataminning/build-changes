import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elf(enr b, ehf c, btg d, int e) implements eli {
   public static final Codec<elf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enr.a.fieldOf("state_provider").forGetter(elf::a),
               ehf.b.fieldOf("target").forGetter(elf::b),
               btg.b(0, 8).fieldOf("radius").forGetter(elf::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(elf::d)
            )
            .apply($$0, elf::new)
   );

   public enr a() {
      return this.b;
   }

   public ehf b() {
      return this.c;
   }

   public btg c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
