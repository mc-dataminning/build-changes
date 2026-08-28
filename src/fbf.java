import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbf extends fau {
   public static final MapCodec<fbf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  alf.a(mg.bq).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mf.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbf::new)
   );
   private final alf<ezm> b;
   private final long c;
   private final je<dxh<?>> d;

   private fbf(List<fcq> $$0, alf<ezm> $$1, long $$2, je<dxh<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public faw<fbf> b() {
      return fax.y;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kj.at, new dce(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ezn $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static fau.a<?> a(dxh<?> $$0, alf<ezm> $$1) {
      return a($$2 -> new fbf($$2, $$1, 0L, $$0.a()));
   }

   public static fau.a<?> a(dxh<?> $$0, alf<ezm> $$1, long $$2) {
      return a($$3 -> new fbf($$3, $$1, $$2, $$0.a()));
   }
}
