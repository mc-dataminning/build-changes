import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ckx(int e, int f, aku g, Optional<wo> h, Optional<wo> i) {
   public static final Codec<ckx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.a(1, 16).fieldOf("width").forGetter(ckx::b),
               ayi.a(1, 16).fieldOf("height").forGetter(ckx::c),
               aku.a.fieldOf("asset_id").forGetter(ckx::d),
               wq.a.optionalFieldOf("title").forGetter(ckx::e),
               wq.a.optionalFieldOf("author").forGetter(ckx::f)
            )
            .apply($$0, ckx::new)
   );
   public static final ym<vz, ckx> b = ym.a(yk.h, ckx::b, yk.h, ckx::c, aku.b, ckx::d, wq.e, ckx::e, wq.e, ckx::f, ckx::new);
   public static final Codec<jr<ckx>> c = akq.a(mc.X, a);
   public static final ym<vz, jr<ckx>> d = yk.a(mc.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public aku d() {
      return this.g;
   }

   public Optional<wo> e() {
      return this.h;
   }

   public Optional<wo> f() {
      return this.i;
   }
}
