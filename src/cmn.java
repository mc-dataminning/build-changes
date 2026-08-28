import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmn(jf<awo> e, jf<awo> f, jf<awo> g, jf<awo> h, jf<awo> i, jf<awo> j) {
   public static final Codec<cmn> a = g();
   public static final Codec<cmn> b = g();
   public static final Codec<jf<cmn>> c = alf.a(mh.bn);
   public static final yy<wl, jf<cmn>> d = yw.b(mh.bn);

   private static Codec<cmn> g() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awo.b.fieldOf("ambient_sound").forGetter(cmn::a),
                  awo.b.fieldOf("death_sound").forGetter(cmn::b),
                  awo.b.fieldOf("growl_sound").forGetter(cmn::c),
                  awo.b.fieldOf("hurt_sound").forGetter(cmn::d),
                  awo.b.fieldOf("pant_sound").forGetter(cmn::e),
                  awo.b.fieldOf("whine_sound").forGetter(cmn::f)
               )
               .apply($$0, cmn::new)
      );
   }

   public jf<awo> a() {
      return this.e;
   }

   public jf<awo> b() {
      return this.f;
   }

   public jf<awo> c() {
      return this.g;
   }

   public jf<awo> d() {
      return this.h;
   }

   public jf<awo> e() {
      return this.i;
   }

   public jf<awo> f() {
      return this.j;
   }
}
