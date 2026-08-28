import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewa extends evp {
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  alh.a(lz.bd).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  ly.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewa::new)
   );
   private final alh<euh> b;
   private final long c;
   private final jq<dso<?>> d;

   private ewa(List<exn> $$0, alh<euh> $$1, long $$2, jq<dso<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public evr<ewa> b() {
      return evs.y;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(ku.ap, new czb(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eui $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static evp.a<?> a(dso<?> $$0, alh<euh> $$1) {
      return a($$2 -> new ewa($$2, $$1, 0L, $$0.a()));
   }

   public static evp.a<?> a(dso<?> $$0, alh<euh> $$1, long $$2) {
      return a($$3 -> new ewa($$3, $$1, $$2, $$0.a()));
   }
}
