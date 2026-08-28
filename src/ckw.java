import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ckw(int e, int f, aku g, Optional<wo> h, Optional<wo> i) {
   public static final Codec<ckw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.a(1, 16).fieldOf("width").forGetter(ckw::b),
               ayh.a(1, 16).fieldOf("height").forGetter(ckw::c),
               aku.a.fieldOf("asset_id").forGetter(ckw::d),
               wq.a.optionalFieldOf("title").forGetter(ckw::e),
               wq.a.optionalFieldOf("author").forGetter(ckw::f)
            )
            .apply($$0, ckw::new)
   );
   public static final ym<vz, ckw> b = ym.a(yk.h, ckw::b, yk.h, ckw::c, aku.b, ckw::d, wq.e, ckw::e, wq.e, ckw::f, ckw::new);
   public static final Codec<jr<ckw>> c = akq.a(mc.X, a);
   public static final ym<vz, jr<ckw>> d = yk.a(mc.X, b);

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
