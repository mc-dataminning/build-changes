import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ess extends esh {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akj.a(lr.bb).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lq.j.s().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ess::new)
   );
   private final akj<eqz> b;
   private final long c;
   private final jj<dpr<?>> d;

   private ess(List<euf> $$0, akj<eqz> $$1, long $$2, jj<dpr<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public esj<ess> b() {
      return esk.y;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(kn.ae, new cxe(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(era $$0) {
      super.a($$0);
      if ($$0.a().a(lr.bb, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static esh.a<?> a(dpr<?> $$0, akj<eqz> $$1) {
      return a($$2 -> new ess($$2, $$1, 0L, $$0.a()));
   }

   public static esh.a<?> a(dpr<?> $$0, akj<eqz> $$1, long $$2) {
      return a($$3 -> new ess($$3, $$1, $$2, $$0.a()));
   }
}
