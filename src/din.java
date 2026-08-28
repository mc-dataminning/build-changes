import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record din(dim e, xc f) {
   public static final Codec<din> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dim.b.forGetter(din::a), xe.a.fieldOf("description").forGetter(din::b)).apply($$0, din::new)
   );
   public static final za<wn, din> b = za.a(dim.c, din::a, xe.b, din::b, din::new);
   public static final Codec<jg<din>> c = alg.a(mi.bk, a);
   public static final za<wn, jg<din>> d = yy.a(mi.bk, b);

   public dim a() {
      return this.e;
   }

   public xc b() {
      return this.f;
   }
}
