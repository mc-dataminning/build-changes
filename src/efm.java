import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efm(ix<ctl> c, efo d) {
   public static final Codec<efm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akk.a(lf.G).fieldOf("display").forGetter($$0x -> $$0x.c), efo.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, efm::new)
   );
   public static final Codec<ix<efm>> b = akj.a(lf.aF, a);

   public ix<ctl> a() {
      return this.c;
   }

   public efo b() {
      return this.d;
   }
}
