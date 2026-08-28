import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record daq(jg<awx> e, xg f, float g, int h) {
   public static final Codec<daq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awx.b.fieldOf("sound_event").forGetter(daq::b),
               xi.a.fieldOf("description").forGetter(daq::c),
               azg.o.fieldOf("length_in_seconds").forGetter(daq::d),
               azg.a(0, 15).fieldOf("comparator_output").forGetter(daq::e)
            )
            .apply($$0, daq::new)
   );
   public static final ze<wp, daq> b = ze.a(awx.d, daq::b, xi.b, daq::c, zc.l, daq::d, zc.h, daq::e, daq::new);
   public static final Codec<jg<daq>> c = alo.a(mi.aV);
   public static final ze<wp, jg<daq>> d = zc.a(mi.aV, b);
   private static final int i = 20;

   public int a() {
      return azz.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jg<daq>> a(ji.a $$0, dak $$1) {
      dap $$2 = $$1.a(kl.ae);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jg<awx> b() {
      return this.e;
   }

   public xg c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
