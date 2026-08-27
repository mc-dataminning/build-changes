import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efd(Optional<ch> b, gu c) implements eff {
   private static final MapCodec<gu> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aqy.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(hz::u),
               aqy.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(hz::v),
               aqy.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(hz::w)
            )
            .apply($$0, gu::new)
   );
   public static final Codec<efd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(ch.a, "predicate").forGetter(efd::c), d.forGetter(efd::d)).apply($$0, efd::new)
   );

   @Override
   public efg b() {
      return efh.o;
   }

   public boolean a(ecg $$0) {
      ehd $$1 = $$0.c(eer.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static eff.a a(ch.a $$0) {
      return () -> new efd($$0.b(), gu.b);
   }

   public static eff.a a(ch.a $$0, gu $$1) {
      return () -> new efd($$0.b(), $$1);
   }

   public Optional<ch> c() {
      return this.b;
   }

   public gu d() {
      return this.c;
   }
}
