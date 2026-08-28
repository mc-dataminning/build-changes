import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fax extends fam {
   public static final MapCodec<fax> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  alf.a(mg.bp).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mf.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fax::new)
   );
   private final alf<eze> b;
   private final long c;
   private final je<dwz<?>> d;

   private fax(List<fci> $$0, alf<eze> $$1, long $$2, je<dwz<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fao<fax> b() {
      return fap.y;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kj.at, new dbz(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ezf $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static fam.a<?> a(dwz<?> $$0, alf<eze> $$1) {
      return a($$2 -> new fax($$2, $$1, 0L, $$0.a()));
   }

   public static fam.a<?> a(dwz<?> $$0, alf<eze> $$1, long $$2) {
      return a($$3 -> new fax($$3, $$1, $$2, $$0.a()));
   }
}
