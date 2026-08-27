import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ejm(Optional<ci> b, hx c) implements ejo {
   private static final MapCodec<hx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               atq.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jb::u),
               atq.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jb::v),
               atq.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jb::w)
            )
            .apply($$0, hx::new)
   );
   public static final Codec<ejm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atq.a(ci.a, "predicate").forGetter(ejm::c), d.forGetter(ejm::d)).apply($$0, ejm::new)
   );

   @Override
   public ejp b() {
      return ejq.o;
   }

   public boolean a(egp $$0) {
      elm $$1 = $$0.c(eja.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static ejo.a a(ci.a $$0) {
      return () -> new ejm(Optional.of($$0.b()), hx.b);
   }

   public static ejo.a a(ci.a $$0, hx $$1) {
      return () -> new ejm(Optional.of($$0.b()), $$1);
   }

   public Optional<ci> c() {
      return this.b;
   }

   public hx d() {
      return this.c;
   }
}
