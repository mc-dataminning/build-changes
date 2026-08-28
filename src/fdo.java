import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdo(Optional<cu> b, iv c) implements fdq {
   private static final MapCodec<iv> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(ka::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(ka::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(ka::w)
            )
            .apply($$0, iv::new)
   );
   public static final MapCodec<fdo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(fdo::c), g.forGetter(fdo::d)).apply($$0, fdo::new)
   );

   @Override
   public fdr b() {
      return fds.n;
   }

   public boolean a(fah $$0) {
      ffq $$1 = $$0.c(fdb.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.f);
   }

   public static fdq.a a(cu.a $$0) {
      return () -> new fdo(Optional.of($$0.b()), iv.c);
   }

   public static fdq.a a(cu.a $$0, iv $$1) {
      return () -> new fdo(Optional.of($$0.b()), $$1);
   }

   public Optional<cu> c() {
      return this.b;
   }

   public iv d() {
      return this.c;
   }
}
