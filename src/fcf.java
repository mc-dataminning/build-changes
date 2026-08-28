import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcf extends fbu {
   public static final MapCodec<fcf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fam.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mg.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fcf::new)
   );
   private final alh<fam> b;
   private final long c;
   private final jf<dye<?>> d;

   private fcf(List<fdq> $$0, alh<fam> $$1, long $$2, jf<dye<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fbw<fcf> b() {
      return fbx.y;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kk.at, new dcz(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(fan $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static fbu.a<?> a(dye<?> $$0, alh<fam> $$1) {
      return a($$2 -> new fcf($$2, $$1, 0L, $$0.a()));
   }

   public static fbu.a<?> a(dye<?> $$0, alh<fam> $$1, long $$2) {
      return a($$3 -> new fcf($$3, $$1, $$2, $$0.a()));
   }
}
