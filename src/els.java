import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record els(Optional<ck> b, hz c) implements elu {
   private static final MapCodec<hz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avp.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jd::u),
               avp.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jd::v),
               avp.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jd::w)
            )
            .apply($$0, hz::new)
   );
   public static final Codec<els> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avp.a(ck.a, "predicate").forGetter(els::c), d.forGetter(els::d)).apply($$0, els::new)
   );

   @Override
   public elv b() {
      return elw.o;
   }

   public boolean a(eiv $$0) {
      ens $$1 = $$0.c(elg.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static elu.a a(ck.a $$0) {
      return () -> new els(Optional.of($$0.b()), hz.c);
   }

   public static elu.a a(ck.a $$0, hz $$1) {
      return () -> new els(Optional.of($$0.b()), $$1);
   }

   public Optional<ck> c() {
      return this.b;
   }

   public hz d() {
      return this.c;
   }
}
