import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyn extends eyc {
   public static final MapCodec<eyn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aly.a(mb.bg).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  ma.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyn::new)
   );
   private final aly<ewu> b;
   private final long c;
   private final jq<duz<?>> d;

   private eyn(List<ezy> $$0, aly<ewu> $$1, long $$2, jq<duz<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eye<eyn> b() {
      return eyf.y;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(ku.ap, new dap(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static eyc.a<?> a(duz<?> $$0, aly<ewu> $$1) {
      return a($$2 -> new eyn($$2, $$1, 0L, $$0.a()));
   }

   public static eyc.a<?> a(duz<?> $$0, aly<ewu> $$1, long $$2) {
      return a($$3 -> new eyn($$3, $$1, $$2, $$0.a()));
   }
}
