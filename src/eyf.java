import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyf extends exu {
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aly.a(mb.bf).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  ma.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyf::new)
   );
   private final aly<ewm> b;
   private final long c;
   private final jq<dur<?>> d;

   private eyf(List<ezs> $$0, aly<ewm> $$1, long $$2, jq<dur<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exw<eyf> b() {
      return exx.y;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(ku.ap, new dak(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ewn $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static exu.a<?> a(dur<?> $$0, aly<ewm> $$1) {
      return a($$2 -> new eyf($$2, $$1, 0L, $$0.a()));
   }

   public static exu.a<?> a(dur<?> $$0, aly<ewm> $$1, long $$2) {
      return a($$3 -> new eyf($$3, $$1, $$2, $$0.a()));
   }
}
