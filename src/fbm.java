import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbm extends fbb {
   public static final MapCodec<fbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ezt.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mg.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbm::new)
   );
   private final alf<ezt> b;
   private final long c;
   private final jf<dxo<?>> d;

   private fbm(List<fcx> $$0, alf<ezt> $$1, long $$2, jf<dxo<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fbd<fbm> b() {
      return fbe.y;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kk.at, new dcl(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ezu $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static fbb.a<?> a(dxo<?> $$0, alf<ezt> $$1) {
      return a($$2 -> new fbm($$2, $$1, 0L, $$0.a()));
   }

   public static fbb.a<?> a(dxo<?> $$0, alf<ezt> $$1, long $$2) {
      return a($$3 -> new fbm($$3, $$1, $$2, $$0.a()));
   }
}
