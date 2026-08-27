import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ejt(Optional<ci> b, hx c) implements ejv {
   private static final MapCodec<hx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               atw.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jb::u),
               atw.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jb::v),
               atw.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jb::w)
            )
            .apply($$0, hx::new)
   );
   public static final Codec<ejt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atw.a(ci.a, "predicate").forGetter(ejt::c), d.forGetter(ejt::d)).apply($$0, ejt::new)
   );

   @Override
   public ejw b() {
      return ejx.o;
   }

   public boolean a(egw $$0) {
      elt $$1 = $$0.c(ejh.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static ejv.a a(ci.a $$0) {
      return () -> new ejt(Optional.of($$0.b()), hx.b);
   }

   public static ejv.a a(ci.a $$0, hx $$1) {
      return () -> new ejt(Optional.of($$0.b()), $$1);
   }

   public Optional<ci> c() {
      return this.b;
   }

   public hx d() {
      return this.c;
   }
}
