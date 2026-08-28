import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewe extends evt {
   public static final MapCodec<ewe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  alk.a(ma.bd).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lz.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewe::new)
   );
   private final alk<eul> b;
   private final long c;
   private final jq<dst<?>> d;

   private ewe(List<exr> $$0, alk<eul> $$1, long $$2, jq<dst<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public evv<ewe> b() {
      return evw.y;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(ku.ap, new czf(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eum $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static evt.a<?> a(dst<?> $$0, alk<eul> $$1) {
      return a($$2 -> new ewe($$2, $$1, 0L, $$0.a()));
   }

   public static evt.a<?> a(dst<?> $$0, alk<eul> $$1, long $$2) {
      return a($$3 -> new ewe($$3, $$1, $$2, $$0.a()));
   }
}
