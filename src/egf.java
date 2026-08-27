import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record egf(Optional<cj> b, ht c) implements egh {
   private static final MapCodec<ht> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               asg.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(iw::u),
               asg.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(iw::v),
               asg.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(iw::w)
            )
            .apply($$0, ht::new)
   );
   public static final Codec<egf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asg.a(cj.a, "predicate").forGetter(egf::c), d.forGetter(egf::d)).apply($$0, egf::new)
   );

   @Override
   public egi b() {
      return egj.o;
   }

   public boolean a(edi $$0) {
      eif $$1 = $$0.c(eft.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static egh.a a(cj.a $$0) {
      return () -> new egf(Optional.of($$0.b()), ht.b);
   }

   public static egh.a a(cj.a $$0, ht $$1) {
      return () -> new egf(Optional.of($$0.b()), $$1);
   }

   public Optional<cj> c() {
      return this.b;
   }

   public ht d() {
      return this.c;
   }
}
