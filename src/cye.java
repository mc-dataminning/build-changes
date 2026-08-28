import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cye(js<awj> e, wv f, float g, int h) {
   public static final Codec<cye> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awj.b.fieldOf("sound_event").forGetter(cye::b),
               wx.a.fieldOf("description").forGetter(cye::c),
               ays.o.fieldOf("length_in_seconds").forGetter(cye::d),
               ays.a(0, 15).fieldOf("comparator_output").forGetter(cye::e)
            )
            .apply($$0, cye::new)
   );
   public static final yt<wg, cye> b = yt.a(awj.d, cye::b, wx.b, cye::c, yr.l, cye::d, yr.h, cye::e, cye::new);
   public static final Codec<js<cye>> c = ala.a(me.L);
   public static final yt<wg, js<cye>> d = yr.a(me.L, b);
   private static final int i = 20;

   public int a() {
      return azk.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<js<cye>> a(ju.a $$0, cxy $$1) {
      cyd $$2 = $$1.a(kx.ad);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public js<awj> b() {
      return this.e;
   }

   public wv c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
