import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record enr(Optional<ck> b, ib c) implements ent {
   private static final MapCodec<ib> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awe.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jg::u),
               awe.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jg::v),
               awe.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jg::w)
            )
            .apply($$0, ib::new)
   );
   public static final Codec<enr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(ck.a, "predicate").forGetter(enr::c), d.forGetter(enr::d)).apply($$0, enr::new)
   );

   @Override
   public enu b() {
      return env.o;
   }

   public boolean a(eku $$0) {
      epr $$1 = $$0.c(enf.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static ent.a a(ck.a $$0) {
      return () -> new enr(Optional.of($$0.b()), ib.c);
   }

   public static ent.a a(ck.a $$0, ib $$1) {
      return () -> new enr(Optional.of($$0.b()), $$1);
   }

   public Optional<ck> c() {
      return this.b;
   }

   public ib d() {
      return this.c;
   }
}
