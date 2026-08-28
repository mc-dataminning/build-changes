import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejh(jo<cvn> c, ejj d) {
   public static final Codec<ejh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a(lw.K).fieldOf("display").forGetter($$0x -> $$0x.c), ejj.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ejh::new)
   );
   public static final Codec<jo<ejh>> b = ala.a(lw.aP, a);

   public jo<cvn> a() {
      return this.c;
   }

   public ejj b() {
      return this.d;
   }
}
