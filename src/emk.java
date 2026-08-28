import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emk(jr<cxd> c, emm d) {
   public static final Codec<emk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxd.e.fieldOf("display").forGetter($$0x -> $$0x.c), emm.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, emk::new)
   );
   public static final Codec<jr<emk>> b = akq.a(mc.aR, a);

   public jr<cxd> a() {
      return this.c;
   }

   public emm b() {
      return this.d;
   }
}
