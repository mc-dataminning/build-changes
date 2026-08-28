import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record coa(int e, int f, alk g, Optional<xc> h, Optional<xc> i) {
   public static final Codec<coa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.a(1, 16).fieldOf("width").forGetter(coa::b),
               ayy.a(1, 16).fieldOf("height").forGetter(coa::c),
               alk.a.fieldOf("asset_id").forGetter(coa::d),
               xe.a.optionalFieldOf("title").forGetter(coa::e),
               xe.a.optionalFieldOf("author").forGetter(coa::f)
            )
            .apply($$0, coa::new)
   );
   public static final za<wn, coa> b = za.a(yy.h, coa::b, yy.h, coa::c, alk.b, coa::d, xe.e, coa::e, xe.e, coa::f, coa::new);
   public static final Codec<jg<coa>> c = alg.a(mi.aZ, a);
   public static final za<wn, jg<coa>> d = yy.a(mi.aZ, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alk d() {
      return this.g;
   }

   public Optional<xc> e() {
      return this.h;
   }

   public Optional<xc> f() {
      return this.i;
   }
}
