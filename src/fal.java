import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fal extends faa {
   public static final MapCodec<fal> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ald.a(mg.bo).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mf.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fal::new)
   );
   private final ald<eys> b;
   private final long c;
   private final je<dwp<?>> d;

   private fal(List<fbw> $$0, ald<eys> $$1, long $$2, je<dwp<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fac<fal> b() {
      return fad.y;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kj.at, new dbt(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eyt $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static faa.a<?> a(dwp<?> $$0, ald<eys> $$1) {
      return a($$2 -> new fal($$2, $$1, 0L, $$0.a()));
   }

   public static faa.a<?> a(dwp<?> $$0, ald<eys> $$1, long $$2) {
      return a($$3 -> new fal($$3, $$1, $$2, $$0.a()));
   }
}
