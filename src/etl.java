import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etl extends eta {
   public static final Codec<etl> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aks.a(li.aU).fieldOf("name").forGetter($$0x -> $$0x.b),
                  axu.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  lh.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etl::new)
   );
   private final aks<eru> b;
   private final long c;
   private final ja<dqe<?>> d;

   private etl(List<euu> $$0, aks<eru> $$1, long $$2, ja<dqe<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public etc b() {
      return etd.v;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         $$0.b(ke.ad, new cxt(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);
      if ($$0.a().a(li.aU, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static eta.a<?> a(dqe<?> $$0, aks<eru> $$1) {
      return a($$2 -> new etl($$2, $$1, 0L, $$0.a()));
   }

   public static eta.a<?> a(dqe<?> $$0, aks<eru> $$1, long $$2) {
      return a($$3 -> new etl($$3, $$1, $$2, $$0.a()));
   }
}
