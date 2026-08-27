import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edr(in<crn> c, edt d) {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajs.a(ku.G).fieldOf("display").forGetter($$0x -> $$0x.c), edt.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, edr::new)
   );
   public static final Codec<in<edr>> b = ajr.a(ku.aC, a);

   public in<crn> a() {
      return this.c;
   }

   public edt b() {
      return this.d;
   }
}
