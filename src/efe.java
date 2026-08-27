import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efe(Optional<ch> b, gu c) implements efg {
   private static final MapCodec<gu> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aqy.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(hz::u),
               aqy.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(hz::v),
               aqy.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(hz::w)
            )
            .apply($$0, gu::new)
   );
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(ch.a, "predicate").forGetter(efe::c), d.forGetter(efe::d)).apply($$0, efe::new)
   );

   @Override
   public efh b() {
      return efi.o;
   }

   public boolean a(ech $$0) {
      ehe $$1 = $$0.c(ees.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static efg.a a(ch.a $$0) {
      return () -> new efe($$0.b(), gu.b);
   }

   public static efg.a a(ch.a $$0, gu $$1) {
      return () -> new efe($$0.b(), $$1);
   }

   public Optional<ch> c() {
      return this.b;
   }

   public gu d() {
      return this.c;
   }
}
