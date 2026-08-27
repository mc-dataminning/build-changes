import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eus(Optional<cs> b, ir c) implements euu {
   private static final MapCodec<ir> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axu.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jv::u),
               axu.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jv::v),
               axu.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jv::w)
            )
            .apply($$0, ir::new)
   );
   public static final Codec<eus> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(cs.a, "predicate").forGetter(eus::c), d.forGetter(eus::d)).apply($$0, eus::new)
   );

   @Override
   public euv b() {
      return euw.p;
   }

   public boolean a(erp $$0) {
      ewu $$1 = $$0.c(eug.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static euu.a a(cs.a $$0) {
      return () -> new eus(Optional.of($$0.b()), ir.c);
   }

   public static euu.a a(cs.a $$0, ir $$1) {
      return () -> new eus(Optional.of($$0.b()), $$1);
   }

   public Optional<cs> c() {
      return this.b;
   }

   public ir d() {
      return this.c;
   }
}
