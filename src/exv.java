import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exv extends eyb {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ewo.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, exv::new)
   );
   private final ewo.b b;

   public exv(List<ezx> $$0, ewo.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<exv> b() {
      return eye.B;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      if ($$0.a(cxl.vo) && $$1.c(this.b.a()) instanceof cpr $$2) {
         $$0.b(kv.ai, new dae($$2.gk()));
      }

      return $$0;
   }

   public static eyb.a<?> a(ewo.b $$0) {
      return a($$1 -> new exv($$1, $$0));
   }
}
