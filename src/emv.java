import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record emv(Optional<ck> b, ib c) implements emx {
   private static final MapCodec<ib> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avu.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jf::u),
               avu.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jf::v),
               avu.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jf::w)
            )
            .apply($$0, ib::new)
   );
   public static final Codec<emv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.a(ck.a, "predicate").forGetter(emv::c), d.forGetter(emv::d)).apply($$0, emv::new)
   );

   @Override
   public emy b() {
      return emz.o;
   }

   public boolean a(ejy $$0) {
      eov $$1 = $$0.c(emj.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static emx.a a(ck.a $$0) {
      return () -> new emv(Optional.of($$0.b()), ib.c);
   }

   public static emx.a a(ck.a $$0, ib $$1) {
      return () -> new emv(Optional.of($$0.b()), $$1);
   }

   public Optional<ck> c() {
      return this.b;
   }

   public ib d() {
      return this.c;
   }
}
