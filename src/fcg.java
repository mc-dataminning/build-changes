import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcg(Optional<ct> b, iu c) implements fci {
   private static final MapCodec<iu> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(jz::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(jz::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(jz::w)
            )
            .apply($$0, iu::new)
   );
   public static final MapCodec<fcg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ct.a.optionalFieldOf("predicate").forGetter(fcg::c), g.forGetter(fcg::d)).apply($$0, fcg::new)
   );

   @Override
   public fcj b() {
      return fck.n;
   }

   public boolean a(eyz $$0) {
      fei $$1 = $$0.c(fbt.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.f);
   }

   public static fci.a a(ct.a $$0) {
      return () -> new fcg(Optional.of($$0.b()), iu.c);
   }

   public static fci.a a(ct.a $$0, iu $$1) {
      return () -> new fcg(Optional.of($$0.b()), $$1);
   }

   public Optional<ct> c() {
      return this.b;
   }

   public iu d() {
      return this.c;
   }
}
