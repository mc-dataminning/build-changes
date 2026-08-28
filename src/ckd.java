import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ckd(int e, int f, ale g, Optional<xe> h, Optional<xe> i) {
   public static final Codec<ckd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.a(1, 16).fieldOf("width").forGetter(ckd::b),
               ayo.a(1, 16).fieldOf("height").forGetter(ckd::c),
               ale.a.fieldOf("asset_id").forGetter(ckd::d),
               xg.a.optionalFieldOf("title").forGetter(ckd::e),
               xg.a.optionalFieldOf("author").forGetter(ckd::f)
            )
            .apply($$0, ckd::new)
   );
   public static final zc<wp, ckd> b = zc.a(za.h, ckd::b, za.h, ckd::c, ale.b, ckd::d, xg.e, ckd::e, xg.e, ckd::f, ckd::new);
   public static final Codec<jo<ckd>> c = ala.a(lw.X, a);
   public static final zc<wp, jo<ckd>> d = za.a(lw.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public ale d() {
      return this.g;
   }

   public Optional<xe> e() {
      return this.h;
   }

   public Optional<xe> f() {
      return this.i;
   }
}
