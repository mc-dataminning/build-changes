import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ese extends ers {
   public static final MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ald.a(lq.aU).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lp.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ese::new)
   );
   private final ald<eql> b;
   private final long c;
   private final ji<dph<?>> d;

   private ese(List<etq> $$0, ald<eql> $$1, long $$2, ji<dph<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eru<ese> b() {
      return erv.y;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(km.ad, new cxq(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eqm $$0) {
      super.a($$0);
      if ($$0.a().a(lq.aU, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static ers.a<?> a(dph<?> $$0, ald<eql> $$1) {
      return a($$2 -> new ese($$2, $$1, 0L, $$0.a()));
   }

   public static ers.a<?> a(dph<?> $$0, ald<eql> $$1, long $$2) {
      return a($$3 -> new ese($$3, $$1, $$2, $$0.a()));
   }
}
