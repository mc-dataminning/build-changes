import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcc extends fbb {
   public static final MapCodec<fcc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcu.h.fieldOf("pages").forGetter($$0x -> $$0x.b), fba.a.forGetter($$0x -> $$0x.c))).apply($$0, fcc::new)
   );
   private final List<asi<wy>> b;
   private final fba c;

   protected fcc(List<fcx> $$0, List<asi<wy>> $$1, fba $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czk a(czk $$0, ezo $$1) {
      $$0.a(kk.V, dcu.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dcu a(dcu $$0) {
      List<asi<wy>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public fbd<fcc> b() {
      return fbe.N;
   }
}
