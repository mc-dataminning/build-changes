import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eti extends esh {
   public static final Codec<wu> a = ww.a.validate($$0 -> cxk.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<eti> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxk.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), esg.a.forGetter($$0x -> $$0x.d))).apply($$0, eti::new)
   );
   private final List<ard<wu>> c;
   private final esg d;

   protected eti(List<euf> $$0, List<ard<wu>> $$1, esg $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuc a(cuc $$0, equ $$1) {
      $$0.a(kn.J, cxk.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxk a(cxk $$0) {
      List<ard<wu>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public esj<eti> b() {
      return esk.N;
   }
}
