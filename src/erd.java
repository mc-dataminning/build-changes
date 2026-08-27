import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erd extends eqs {
   public static final MapCodec<erd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akm.a(lf.aU).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  le.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erd::new)
   );
   private final akm<epm> b;
   private final long c;
   private final ix<dok<?>> d;

   private erd(List<esn> $$0, akm<epm> $$1, long $$2, ix<dok<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public equ b() {
      return eqv.v;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(kb.ad, new cwt(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(epn $$0) {
      super.a($$0);
      if ($$0.a().a(lf.aU, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static eqs.a<?> a(dok<?> $$0, akm<epm> $$1) {
      return a($$2 -> new erd($$2, $$1, 0L, $$0.a()));
   }

   public static eqs.a<?> a(dok<?> $$0, akm<epm> $$1, long $$2) {
      return a($$3 -> new erd($$3, $$1, $$2, $$0.a()));
   }
}
