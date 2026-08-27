import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record elz(Optional<ck> b, hz c) implements emb {
   private static final MapCodec<hz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               avq.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jd::u),
               avq.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jd::v),
               avq.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jd::w)
            )
            .apply($$0, hz::new)
   );
   public static final Codec<elz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avq.a(ck.a, "predicate").forGetter(elz::c), d.forGetter(elz::d)).apply($$0, elz::new)
   );

   @Override
   public emc b() {
      return emd.o;
   }

   public boolean a(ejc $$0) {
      enz $$1 = $$0.c(eln.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static emb.a a(ck.a $$0) {
      return () -> new elz(Optional.of($$0.b()), hz.c);
   }

   public static emb.a a(ck.a $$0, hz $$1) {
      return () -> new elz(Optional.of($$0.b()), $$1);
   }

   public Optional<ck> c() {
      return this.b;
   }

   public hz d() {
      return this.c;
   }
}
