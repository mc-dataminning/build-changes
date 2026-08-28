import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record coj(int e, int f, alr g, Optional<xg> h, Optional<xg> i) {
   public static final Codec<coj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.a(1, 16).fieldOf("width").forGetter(coj::b),
               azg.a(1, 16).fieldOf("height").forGetter(coj::c),
               alr.a.fieldOf("asset_id").forGetter(coj::d),
               xi.a.optionalFieldOf("title").forGetter(coj::e),
               xi.a.optionalFieldOf("author").forGetter(coj::f)
            )
            .apply($$0, coj::new)
   );
   public static final ze<wp, coj> b = ze.a(zc.h, coj::b, zc.h, coj::c, alr.b, coj::d, xi.e, coj::e, xi.e, coj::f, coj::new);
   public static final Codec<jg<coj>> c = aln.a(mi.aZ, a);
   public static final ze<wp, jg<coj>> d = zc.a(mi.aZ, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alr d() {
      return this.g;
   }

   public Optional<xg> e() {
      return this.h;
   }

   public Optional<xg> f() {
      return this.i;
   }
}
