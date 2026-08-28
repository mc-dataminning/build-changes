import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esg extends eru {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ale.a(lq.aU).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lp.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esg::new)
   );
   private final ale<eqn> b;
   private final long c;
   private final ji<dpj<?>> d;

   private esg(List<ets> $$0, ale<eqn> $$1, long $$2, ji<dpj<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public erw<esg> b() {
      return erx.y;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(km.ae, new cxs(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eqo $$0) {
      super.a($$0);
      if ($$0.a().a(lq.aU, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static eru.a<?> a(dpj<?> $$0, ale<eqn> $$1) {
      return a($$2 -> new esg($$2, $$1, 0L, $$0.a()));
   }

   public static eru.a<?> a(dpj<?> $$0, ale<eqn> $$1, long $$2) {
      return a($$3 -> new esg($$3, $$1, $$2, $$0.a()));
   }
}
