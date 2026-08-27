import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ejs(Optional<ci> b, hx c) implements eju {
   private static final MapCodec<hx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               atv.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jb::u),
               atv.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jb::v),
               atv.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jb::w)
            )
            .apply($$0, hx::new)
   );
   public static final Codec<ejs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atv.a(ci.a, "predicate").forGetter(ejs::c), d.forGetter(ejs::d)).apply($$0, ejs::new)
   );

   @Override
   public ejv b() {
      return ejw.o;
   }

   public boolean a(egv $$0) {
      els $$1 = $$0.c(ejg.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static eju.a a(ci.a $$0) {
      return () -> new ejs(Optional.of($$0.b()), hx.b);
   }

   public static eju.a a(ci.a $$0, hx $$1) {
      return () -> new ejs(Optional.of($$0.b()), $$1);
   }

   public Optional<ci> c() {
      return this.b;
   }

   public hx d() {
      return this.c;
   }
}
