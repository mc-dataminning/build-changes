import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evz extends euy {
   public static final Codec<xe> a = xg.a.validate($$0 -> cze.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<evz> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cze.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), eux.a.forGetter($$0x -> $$0x.d))).apply($$0, evz::new)
   );
   private final List<asa<xe>> c;
   private final eux d;

   protected evz(List<eww> $$0, List<asa<xe>> $$1, eux $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cvs a(cvs $$0, etl $$1) {
      $$0.a(ks.O, cze.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cze a(cze $$0) {
      List<asa<xe>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public eva<evz> b() {
      return evb.N;
   }
}
