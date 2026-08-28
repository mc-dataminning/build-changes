import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezc extends eyb {
   public static final MapCodec<ezc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dao.h.fieldOf("pages").forGetter($$0x -> $$0x.b), eya.a.forGetter($$0x -> $$0x.c))).apply($$0, ezc::new)
   );
   private final List<arv<wp>> b;
   private final eya c;

   protected ezc(List<ezx> $$0, List<arv<wp>> $$1, eya $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cxh a(cxh $$0, ewo $$1) {
      $$0.a(kv.V, dao.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public dao a(dao $$0) {
      List<arv<wp>> $$1 = this.c.a($$0.a(), this.b);
      return $$0.b($$1);
   }

   @Override
   public eyd<ezc> b() {
      return eye.N;
   }
}
