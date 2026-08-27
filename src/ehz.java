import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ehz(Optional<cj> b, hx c) implements eib {
   private static final MapCodec<hx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               asy.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(ja::u),
               asy.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(ja::v),
               asy.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(ja::w)
            )
            .apply($$0, hx::new)
   );
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asy.a(cj.a, "predicate").forGetter(ehz::c), d.forGetter(ehz::d)).apply($$0, ehz::new)
   );

   @Override
   public eic b() {
      return eid.o;
   }

   public boolean a(efc $$0) {
      ejz $$1 = $$0.c(ehn.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static eib.a a(cj.a $$0) {
      return () -> new ehz(Optional.of($$0.b()), hx.b);
   }

   public static eib.a a(cj.a $$0, hx $$1) {
      return () -> new ehz(Optional.of($$0.b()), $$1);
   }

   public Optional<cj> c() {
      return this.b;
   }

   public hx d() {
      return this.c;
   }
}
