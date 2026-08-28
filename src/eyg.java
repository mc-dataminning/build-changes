import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyg extends exv {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  alo.a(mb.bg).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  ma.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyg::new)
   );
   private final alo<ewn> b;
   private final long c;
   private final jq<dus<?>> d;

   private eyg(List<ezr> $$0, alo<ewn> $$1, long $$2, jq<dus<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exx<eyg> b() {
      return exy.y;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(ku.ap, new dag(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ewo $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static exv.a<?> a(dus<?> $$0, alo<ewn> $$1) {
      return a($$2 -> new eyg($$2, $$1, 0L, $$0.a()));
   }

   public static exv.a<?> a(dus<?> $$0, alo<ewn> $$1, long $$2) {
      return a($$3 -> new eyg($$3, $$1, $$2, $$0.a()));
   }
}
