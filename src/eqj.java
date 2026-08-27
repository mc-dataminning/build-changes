import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eqj(Optional<ck> b, id c) implements eql {
   private static final MapCodec<id> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awu.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(ji::u),
               awu.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(ji::v),
               awu.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(ji::w)
            )
            .apply($$0, id::new)
   );
   public static final Codec<eqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(ck.a, "predicate").forGetter(eqj::c), d.forGetter(eqj::d)).apply($$0, eqj::new)
   );

   @Override
   public eqm b() {
      return eqn.o;
   }

   public boolean a(enk $$0) {
      esj $$1 = $$0.c(epx.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static eql.a a(ck.a $$0) {
      return () -> new eqj(Optional.of($$0.b()), id.c);
   }

   public static eql.a a(ck.a $$0, id $$1) {
      return () -> new eqj(Optional.of($$0.b()), $$1);
   }

   public Optional<ck> c() {
      return this.b;
   }

   public id d() {
      return this.c;
   }
}
