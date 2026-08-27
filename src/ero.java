import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ero(Optional<cr> b, in c) implements erq {
   private static final MapCodec<in> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axh.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jr::u),
               axh.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jr::v),
               axh.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jr::w)
            )
            .apply($$0, in::new)
   );
   public static final Codec<ero> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(cr.a, "predicate").forGetter(ero::c), d.forGetter(ero::d)).apply($$0, ero::new)
   );

   @Override
   public err b() {
      return ers.p;
   }

   public boolean a(eol $$0) {
      etp $$1 = $$0.c(erc.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static erq.a a(cr.a $$0) {
      return () -> new ero(Optional.of($$0.b()), in.c);
   }

   public static erq.a a(cr.a $$0, in $$1) {
      return () -> new ero(Optional.of($$0.b()), $$1);
   }

   public Optional<cr> c() {
      return this.b;
   }

   public in d() {
      return this.c;
   }
}
