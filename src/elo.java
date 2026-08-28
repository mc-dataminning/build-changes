import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elo(jr<cwm> c, elq d) {
   public static final Codec<elo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwm.e.fieldOf("display").forGetter($$0x -> $$0x.c), elq.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, elo::new)
   );
   public static final Codec<jr<elo>> b = akr.a(mc.aQ, a);

   public jr<cwm> a() {
      return this.c;
   }

   public elq b() {
      return this.d;
   }
}
