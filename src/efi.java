import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efi(Optional<cj> b, gw c) implements efk {
   private static final MapCodec<gw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               arb.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(ib::u),
               arb.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(ib::v),
               arb.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(ib::w)
            )
            .apply($$0, gw::new)
   );
   public static final Codec<efi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arb.a(cj.a, "predicate").forGetter(efi::c), d.forGetter(efi::d)).apply($$0, efi::new)
   );

   @Override
   public efl b() {
      return efm.o;
   }

   public boolean a(ecl $$0) {
      ehi $$1 = $$0.c(eew.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static efk.a a(cj.a $$0) {
      return () -> new efi(Optional.of($$0.b()), gw.b);
   }

   public static efk.a a(cj.a $$0, gw $$1) {
      return () -> new efi(Optional.of($$0.b()), $$1);
   }

   public Optional<cj> c() {
      return this.b;
   }

   public gw d() {
      return this.c;
   }
}
