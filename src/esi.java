import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esi extends erw {
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ale.a(lq.aU).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lp.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esi::new)
   );
   private final ale<eqp> b;
   private final long c;
   private final ji<dpl<?>> d;

   private esi(List<etu> $$0, ale<eqp> $$1, long $$2, ji<dpl<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ery<esi> b() {
      return erz.y;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(km.ae, new cxu(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eqq $$0) {
      super.a($$0);
      if ($$0.a().a(lq.aU, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static erw.a<?> a(dpl<?> $$0, ale<eqp> $$1) {
      return a($$2 -> new esi($$2, $$1, 0L, $$0.a()));
   }

   public static erw.a<?> a(dpl<?> $$0, ale<eqp> $$1, long $$2) {
      return a($$3 -> new esi($$3, $$1, $$2, $$0.a()));
   }
}
