import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxr(js<awj> e, float f, float g, wv h) {
   public static final Codec<cxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awj.b.fieldOf("sound_event").forGetter(cxr::a),
               ays.o.fieldOf("use_duration").forGetter(cxr::b),
               ays.o.fieldOf("range").forGetter(cxr::c),
               wx.a.fieldOf("description").forGetter(cxr::d)
            )
            .apply($$0, cxr::new)
   );
   public static final yt<wg, cxr> b = yt.a(awj.d, cxr::a, yr.l, cxr::b, yr.l, cxr::c, wx.b, cxr::d, cxr::new);
   public static final Codec<js<cxr>> c = akz.a(me.I, a);
   public static final yt<wg, js<cxr>> d = yr.a(me.I, b);

   public js<awj> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public wv d() {
      return this.h;
   }
}
