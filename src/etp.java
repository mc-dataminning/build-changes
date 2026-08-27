import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class etp extends eta {
   public static final Codec<etp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axu.a(axu.a(cxj.c.listOf(), 256), "explosions", List.of()).forGetter($$0x -> $$0x.c),
                  esz.a(256).forGetter($$0x -> $$0x.d),
                  axu.a(axu.h, "flight_duration").forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, etp::new)
   );
   public static final cxk b = new cxk(0, List.of());
   private final List<cxj> c;
   private final esz d;
   private final Optional<Integer> e;

   protected etp(List<euu> $$0, List<cxj> $$1, esz $$2, Optional<Integer> $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      $$0.a(ke.T, b, this::a);
      return $$0;
   }

   private cxk a(cxk $$0) {
      List<cxj> $$1 = this.d.a($$0.b(), this.c, 256);
      return new cxk(this.e.orElseGet($$0::a), $$1);
   }

   @Override
   public etc b() {
      return etd.H;
   }
}
