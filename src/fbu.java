import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fbu(Optional<ct> b, iu c) implements fbw {
   private static final MapCodec<iu> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(jz::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(jz::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(jz::w)
            )
            .apply($$0, iu::new)
   );
   public static final MapCodec<fbu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ct.a.optionalFieldOf("predicate").forGetter(fbu::c), g.forGetter(fbu::d)).apply($$0, fbu::new)
   );

   @Override
   public fbx b() {
      return fby.n;
   }

   public boolean a(eyn $$0) {
      fdw $$1 = $$0.c(fbh.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.f);
   }

   public static fbw.a a(ct.a $$0) {
      return () -> new fbu(Optional.of($$0.b()), iu.c);
   }

   public static fbw.a a(ct.a $$0, iu $$1) {
      return () -> new fbu(Optional.of($$0.b()), $$1);
   }

   public Optional<ct> c() {
      return this.b;
   }

   public iu d() {
      return this.c;
   }
}
