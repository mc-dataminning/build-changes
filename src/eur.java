import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eur extends eug {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ala.a(lv.bc).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lu.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eur::new)
   );
   private final ala<esy> b;
   private final long c;
   private final jn<drg<?>> d;

   private eur(List<ewe> $$0, ala<esy> $$1, long $$2, jn<drg<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eui<eur> b() {
      return euj.y;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kr.ah, new cyo(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(esz $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().a(lv.bc, this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static eug.a<?> a(drg<?> $$0, ala<esy> $$1) {
      return a($$2 -> new eur($$2, $$1, 0L, $$0.a()));
   }

   public static eug.a<?> a(drg<?> $$0, ala<esy> $$1, long $$2) {
      return a($$3 -> new eur($$3, $$1, $$2, $$0.a()));
   }
}
