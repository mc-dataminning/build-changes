import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcr extends fcg {
   public static final MapCodec<fcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fay.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mh.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fcr::new)
   );
   private final alq<fay> b;
   private final long c;
   private final jg<dyq<?>> d;

   private fcr(List<fec> $$0, alq<fay> $$1, long $$2, jg<dyq<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fci<fcr> b() {
      return fcj.y;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kl.at, new ddl(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(faz $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static fcg.a<?> a(dyq<?> $$0, alq<fay> $$1) {
      return a($$2 -> new fcr($$2, $$1, 0L, $$0.a()));
   }

   public static fcg.a<?> a(dyq<?> $$0, alq<fay> $$1, long $$2) {
      return a($$3 -> new fcr($$3, $$1, $$2, $$0.a()));
   }
}
