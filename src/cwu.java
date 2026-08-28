import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwu(jr<avz> e, wp f, float g, int h) {
   public static final Codec<cwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cwu::b),
               wr.a.fieldOf("description").forGetter(cwu::c),
               ayi.o.fieldOf("length_in_seconds").forGetter(cwu::d),
               ayi.a(0, 15).fieldOf("comparator_output").forGetter(cwu::e)
            )
            .apply($$0, cwu::new)
   );
   public static final yn<wa, cwu> b = yn.a(avz.d, cwu::b, wr.b, cwu::c, yl.l, cwu::d, yl.h, cwu::e, cwu::new);
   public static final Codec<jr<cwu>> c = aks.a(mc.L);
   public static final yn<wa, jr<cwu>> d = yl.a(mc.L, b);
   private static final int i = 20;

   public int a() {
      return ayz.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jr<cwu>> a(jt.a $$0, cwo $$1) {
      cwt $$2 = $$1.a(kv.ab);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jr<avz> b() {
      return this.e;
   }

   public wp c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
