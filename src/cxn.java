import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cxn(jr<avz> e, wp f, float g, int h) {
   public static final Codec<cxn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avz.b.fieldOf("sound_event").forGetter(cxn::b),
               wr.a.fieldOf("description").forGetter(cxn::c),
               ayi.o.fieldOf("length_in_seconds").forGetter(cxn::d),
               ayi.a(0, 15).fieldOf("comparator_output").forGetter(cxn::e)
            )
            .apply($$0, cxn::new)
   );
   public static final yn<wa, cxn> b = yn.a(avz.d, cxn::b, wr.b, cxn::c, yl.l, cxn::d, yl.h, cxn::e, cxn::new);
   public static final Codec<jr<cxn>> c = akr.a(mc.L);
   public static final yn<wa, jr<cxn>> d = yl.a(mc.L, b);
   private static final int i = 20;

   public int a() {
      return ayz.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jr<cxn>> a(jt.a $$0, cxh $$1) {
      cxm $$2 = $$1.a(kv.ad);
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
