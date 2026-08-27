import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eqa(Optional<ck> b, ib c) implements eqc {
   private static final MapCodec<ib> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aws.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jg::u),
               aws.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jg::v),
               aws.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jg::w)
            )
            .apply($$0, ib::new)
   );
   public static final Codec<eqa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a(ck.a, "predicate").forGetter(eqa::c), d.forGetter(eqa::d)).apply($$0, eqa::new)
   );

   @Override
   public eqd b() {
      return eqe.o;
   }

   public boolean a(enb $$0) {
      esa $$1 = $$0.c(epo.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static eqc.a a(ck.a $$0) {
      return () -> new eqa(Optional.of($$0.b()), ib.c);
   }

   public static eqc.a a(ck.a $$0, ib $$1) {
      return () -> new eqa(Optional.of($$0.b()), $$1);
   }

   public Optional<ck> c() {
      return this.b;
   }

   public ib d() {
      return this.c;
   }
}
