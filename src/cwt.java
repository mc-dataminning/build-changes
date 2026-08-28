import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwt(jr<avy> e, wo f, float g, int h) {
   public static final Codec<cwt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avy.b.fieldOf("sound_event").forGetter(cwt::b),
               wq.a.fieldOf("description").forGetter(cwt::c),
               ayh.o.fieldOf("length_in_seconds").forGetter(cwt::d),
               ayh.a(0, 15).fieldOf("comparator_output").forGetter(cwt::e)
            )
            .apply($$0, cwt::new)
   );
   public static final ym<vz, cwt> b = ym.a(avy.d, cwt::b, wq.b, cwt::c, yk.l, cwt::d, yk.h, cwt::e, cwt::new);
   public static final Codec<jr<cwt>> c = akr.a(mc.L);
   public static final ym<vz, jr<cwt>> d = yk.a(mc.L, b);
   private static final int i = 20;

   public int a() {
      return ayy.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jr<cwt>> a(jt.a $$0, cwn $$1) {
      cws $$2 = $$1.a(kv.ab);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jr<avy> b() {
      return this.e;
   }

   public wo c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
