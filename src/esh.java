import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esh extends erv {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ale.a(lq.aU).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lp.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esh::new)
   );
   private final ale<eqo> b;
   private final long c;
   private final ji<dpk<?>> d;

   private esh(List<ett> $$0, ale<eqo> $$1, long $$2, ji<dpk<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public erx<esh> b() {
      return ery.y;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(km.ae, new cxt(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eqp $$0) {
      super.a($$0);
      if ($$0.a().a(lq.aU, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static erv.a<?> a(dpk<?> $$0, ale<eqo> $$1) {
      return a($$2 -> new esh($$2, $$1, 0L, $$0.a()));
   }

   public static erv.a<?> a(dpk<?> $$0, ale<eqo> $$1, long $$2) {
      return a($$3 -> new esh($$3, $$1, $$2, $$0.a()));
   }
}
