import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cut(jm<avn> e, wy f, float g, int h) {
   public static final Codec<cut> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avn.b.fieldOf("sound_event").forGetter(cut::b),
               xa.a.fieldOf("description").forGetter(cut::c),
               axv.m.fieldOf("length_in_seconds").forGetter(cut::d),
               axv.a(0, 15).fieldOf("comparator_output").forGetter(cut::e)
            )
            .apply($$0, cut::new)
   );
   public static final yw<wj, cut> b = yw.a(avn.d, cut::b, xa.b, cut::c, yu.i, cut::d, yu.g, cut::e, cut::new);
   public static final Codec<jm<cut>> c = akn.a(lu.L);
   public static final yw<wj, jm<cut>> d = yu.a(lu.L, b);
   private static final int i = 20;

   public int a() {
      return ayn.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jm<cut>> a(jo.a $$0, cuo $$1) {
      cus $$2 = $$1.a(kq.R);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jm<avn> b() {
      return this.e;
   }

   public wy c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
