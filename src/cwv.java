import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwv(jr<avz> e, wo f, float g, int h) {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cwv::b),
               wq.a.fieldOf("description").forGetter(cwv::c),
               ayi.o.fieldOf("length_in_seconds").forGetter(cwv::d),
               ayi.a(0, 15).fieldOf("comparator_output").forGetter(cwv::e)
            )
            .apply($$0, cwv::new)
   );
   public static final ym<vz, cwv> b = ym.a(avz.d, cwv::b, wq.b, cwv::c, yk.l, cwv::d, yk.h, cwv::e, cwv::new);
   public static final Codec<jr<cwv>> c = akr.a(mc.L);
   public static final ym<vz, jr<cwv>> d = yk.a(mc.L, b);
   private static final int i = 20;

   public int a() {
      return ayz.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jr<cwv>> a(jt.a $$0, cwp $$1) {
      cwu $$2 = $$1.a(kv.ab);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jr<avz> b() {
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
