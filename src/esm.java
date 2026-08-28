import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esm extends esb {
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akj.a(lr.bb).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lq.j.s().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esm::new)
   );
   private final akj<eqt> b;
   private final long c;
   private final jj<dpp<?>> d;

   private esm(List<etz> $$0, akj<eqt> $$1, long $$2, jj<dpp<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public esd<esm> b() {
      return ese.y;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(kn.ae, new cxc(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(equ $$0) {
      super.a($$0);
      if ($$0.a().a(lr.bb, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static esb.a<?> a(dpp<?> $$0, akj<eqt> $$1) {
      return a($$2 -> new esm($$2, $$1, 0L, $$0.a()));
   }

   public static esb.a<?> a(dpp<?> $$0, akj<eqt> $$1, long $$2) {
      return a($$3 -> new esm($$3, $$1, $$2, $$0.a()));
   }
}
