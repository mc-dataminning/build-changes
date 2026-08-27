import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eqd extends epo {
   public static final Codec<eqd> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.a(axe.a(cuu.c.listOf(), 256), "explosions", List.of()).forGetter($$0x -> $$0x.c),
                  epn.e.f.forGetter($$0x -> $$0x.d),
                  axe.a(axe.h, "flight_duration").forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eqd::new)
   );
   public static final cuv b = new cuv(0, List.of());
   private final List<cuu> c;
   private final epn d;
   private final Optional<Integer> e;

   protected eqd(List<erh> $$0, List<cuu> $$1, epn $$2, Optional<Integer> $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected csd a(csd $$0, eoa $$1) {
      $$0.a(jz.K, b, this::a);
      return $$0;
   }

   private cuv a(cuv $$0) {
      List<cuu> $$1 = this.d.a($$0.b(), this.c, 256);
      return new cuv(this.e.orElseGet($$0::a), $$1);
   }

   @Override
   public epq b() {
      return epr.F;
   }
}
