import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record emd(List<emd.a> c, emu d) {
   public static final Codec<emd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emd.a.a.listOf().fieldOf("structures").forGetter(emd::a), emu.b.fieldOf("placement").forGetter(emd::b)).apply($$0, emd::new)
   );
   public static final Codec<jq<emd>> b = ale.a(lz.aU, a);

   public emd(jq<elx> $$0, emu $$1) {
      this(List.of(new emd.a($$0, 1)), $$1);
   }

   public static emd.a a(jq<elx> $$0, int $$1) {
      return new emd.a($$0, $$1);
   }

   public static emd.a a(jq<elx> $$0) {
      return new emd.a($$0, 1);
   }

   public List<emd.a> a() {
      return this.c;
   }

   public emu b() {
      return this.d;
   }

   public static record a(jq<elx> b, int c) {
      public static final Codec<emd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(elx.b.fieldOf("structure").forGetter(emd.a::a), ayt.m.fieldOf("weight").forGetter(emd.a::b)).apply($$0, emd.a::new)
      );

      public jq<elx> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
