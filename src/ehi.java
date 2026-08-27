import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ehi(Optional<cj> b, ht c) implements ehk {
   private static final MapCodec<ht> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               asq.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(iw::u),
               asq.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(iw::v),
               asq.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(iw::w)
            )
            .apply($$0, ht::new)
   );
   public static final Codec<ehi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asq.a(cj.a, "predicate").forGetter(ehi::c), d.forGetter(ehi::d)).apply($$0, ehi::new)
   );

   @Override
   public ehl b() {
      return ehm.o;
   }

   public boolean a(eel $$0) {
      eji $$1 = $$0.c(egw.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static ehk.a a(cj.a $$0) {
      return () -> new ehi(Optional.of($$0.b()), ht.b);
   }

   public static ehk.a a(cj.a $$0, ht $$1) {
      return () -> new ehi(Optional.of($$0.b()), $$1);
   }

   public Optional<cj> c() {
      return this.b;
   }

   public ht d() {
      return this.c;
   }
}
