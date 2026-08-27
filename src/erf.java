import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record erf(Optional<cq> b, im c) implements erh {
   private static final MapCodec<im> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axe.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jq::u),
               axe.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jq::v),
               axe.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jq::w)
            )
            .apply($$0, im::new)
   );
   public static final Codec<erf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(cq.a, "predicate").forGetter(erf::c), d.forGetter(erf::d)).apply($$0, erf::new)
   );

   @Override
   public eri b() {
      return erj.o;
   }

   public boolean a(eoa $$0) {
      etf $$1 = $$0.c(eqt.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static erh.a a(cq.a $$0) {
      return () -> new erf(Optional.of($$0.b()), im.c);
   }

   public static erh.a a(cq.a $$0, im $$1) {
      return () -> new erf(Optional.of($$0.b()), $$1);
   }

   public Optional<cq> c() {
      return this.b;
   }

   public im d() {
      return this.c;
   }
}
