import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ehu(Optional<cj> b, ht c) implements ehw {
   private static final MapCodec<ht> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               asu.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(iw::u),
               asu.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(iw::v),
               asu.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(iw::w)
            )
            .apply($$0, ht::new)
   );
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asu.a(cj.a, "predicate").forGetter(ehu::c), d.forGetter(ehu::d)).apply($$0, ehu::new)
   );

   @Override
   public ehx b() {
      return ehy.o;
   }

   public boolean a(eex $$0) {
      eju $$1 = $$0.c(ehi.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static ehw.a a(cj.a $$0) {
      return () -> new ehu(Optional.of($$0.b()), ht.b);
   }

   public static ehw.a a(cj.a $$0, ht $$1) {
      return () -> new ehu(Optional.of($$0.b()), $$1);
   }

   public Optional<cj> c() {
      return this.b;
   }

   public ht d() {
      return this.c;
   }
}
