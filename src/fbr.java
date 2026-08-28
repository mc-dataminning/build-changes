import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbr extends fbg {
   public static final MapCodec<fbr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ezy.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mg.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbr::new)
   );
   private final alf<ezy> b;
   private final long c;
   private final jf<dxt<?>> d;

   private fbr(List<fdc> $$0, alf<ezy> $$1, long $$2, jf<dxt<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fbi<fbr> b() {
      return fbj.y;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kk.at, new dco(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ezz $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static fbg.a<?> a(dxt<?> $$0, alf<ezy> $$1) {
      return a($$2 -> new fbr($$2, $$1, 0L, $$0.a()));
   }

   public static fbg.a<?> a(dxt<?> $$0, alf<ezy> $$1, long $$2) {
      return a($$3 -> new fbr($$3, $$1, $$2, $$0.a()));
   }
}
