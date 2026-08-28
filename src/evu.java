import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evu extends evj {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  alg.a(ly.bd).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lx.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evu::new)
   );
   private final alg<eub> b;
   private final long c;
   private final jp<dsi<?>> d;

   private evu(List<exh> $$0, alg<eub> $$1, long $$2, jp<dsi<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public evl<evu> b() {
      return evm.y;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kt.ao, new cyv(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(euc $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static evj.a<?> a(dsi<?> $$0, alg<eub> $$1) {
      return a($$2 -> new evu($$2, $$1, 0L, $$0.a()));
   }

   public static evj.a<?> a(dsi<?> $$0, alg<eub> $$1, long $$2) {
      return a($$3 -> new evu($$3, $$1, $$2, $$0.a()));
   }
}
