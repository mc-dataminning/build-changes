import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class evp extends euy {
   public static final MapCodec<evp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axl.b(lw.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, evp::new)
   );
   private final axl<cvk> b;

   private evp(List<eww> $$0, axl<cvk> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eva<evp> b() {
      return evb.G;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      kb<cvk> $$2 = $$1.d().G_().e(lw.I);
      Optional<jo<cvk>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(ks.U, $$3.get());
      }

      return $$0;
   }

   public static euy.a<?> a(axl<cvk> $$0) {
      return a($$1 -> new evp($$1, $$0));
   }
}
