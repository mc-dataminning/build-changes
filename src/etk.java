import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etk extends esj {
   public static final Codec<wu> a = ww.a.validate($$0 -> cxl.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<etk> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxl.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), esi.a.forGetter($$0x -> $$0x.d))).apply($$0, etk::new)
   );
   private final List<ard<wu>> c;
   private final esi d;

   protected etk(List<euh> $$0, List<ard<wu>> $$1, esi $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cud a(cud $$0, eqw $$1) {
      $$0.a(kn.J, cxl.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxl a(cxl $$0) {
      List<ard<wu>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public esl<etk> b() {
      return esm.N;
   }
}
