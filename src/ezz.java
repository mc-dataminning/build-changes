import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezz extends eyy {
   public static final MapCodec<ezz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dbe.h.fieldOf("pages").forGetter($$0x -> $$0x.b), eyx.a.forGetter($$0x -> $$0x.c))).apply($$0, ezz::new)
   );
   private final List<asf<wv>> b;
   private final eyx c;

   protected ezz(List<fau> $$0, List<asf<wv>> $$1, eyx $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxy a(cxy $$0, exl $$1) {
      $$0.a(kx.V, dbe.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dbe a(dbe $$0) {
      List<asf<wv>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public eza<ezz> b() {
      return ezb.N;
   }
}
