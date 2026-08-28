import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cmj(int e, int f, ald g, Optional<wv> h, Optional<wv> i) {
   public static final Codec<cmj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.a(1, 16).fieldOf("width").forGetter(cmj::b),
               ays.a(1, 16).fieldOf("height").forGetter(cmj::c),
               ald.a.fieldOf("asset_id").forGetter(cmj::d),
               wx.a.optionalFieldOf("title").forGetter(cmj::e),
               wx.a.optionalFieldOf("author").forGetter(cmj::f)
            )
            .apply($$0, cmj::new)
   );
   public static final yt<wg, cmj> b = yt.a(yr.h, cmj::b, yr.h, cmj::c, ald.b, cmj::d, wx.e, cmj::e, wx.e, cmj::f, cmj::new);
   public static final Codec<js<cmj>> c = akz.a(me.X, a);
   public static final yt<wg, js<cmj>> d = yr.a(me.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public ald d() {
      return this.g;
   }

   public Optional<wv> e() {
      return this.h;
   }

   public Optional<wv> f() {
      return this.i;
   }
}
