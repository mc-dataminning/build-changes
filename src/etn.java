import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etn extends etc {
   public static final MapCodec<etn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akq.a(lu.bc).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lt.j.s().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etn::new)
   );
   private final akq<eru> b;
   private final long c;
   private final jm<dqj<?>> d;

   private etn(List<eva> $$0, akq<eru> $$1, long $$2, jm<dqj<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ete<etn> b() {
      return etf.y;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(kq.af, new cxv(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().a(lu.bc, this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static etc.a<?> a(dqj<?> $$0, akq<eru> $$1) {
      return a($$2 -> new etn($$2, $$1, 0L, $$0.a()));
   }

   public static etc.a<?> a(dqj<?> $$0, akq<eru> $$1, long $$2) {
      return a($$3 -> new etn($$3, $$1, $$2, $$0.a()));
   }
}
