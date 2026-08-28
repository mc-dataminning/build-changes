import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dil(dik e, xa f) {
   public static final Codec<dil> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dik.b.forGetter(dil::a), xc.a.fieldOf("description").forGetter(dil::b)).apply($$0, dil::new)
   );
   public static final yy<wl, dil> b = yy.a(dik.c, dil::a, xc.b, dil::b, dil::new);
   public static final Codec<jf<dil>> c = ale.a(mh.bk, a);
   public static final yy<wl, jf<dil>> d = yw.a(mh.bk, b);

   public dik a() {
      return this.e;
   }

   public xa b() {
      return this.f;
   }
}
