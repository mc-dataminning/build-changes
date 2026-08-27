import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egg extends efx {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  agg.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  asq.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  jy.l.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, egg::new)
   );
   private final agg b;
   private final long c;
   private final ib<det<?>> d;

   private egg(List<ehk> $$0, agg $$1, long $$2, ib<det<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public efz b() {
      return ega.s;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         rz $$2 = ciu.a($$0);
         if ($$2 == null) {
            $$2 = new rz();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         ciu.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(eeu $$0) {
      super.a($$0);
      een<eet> $$1 = new een<>(eeq.c, this.b);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.b);
      }
   }

   public static efx.a<?> a(det<?> $$0, agg $$1) {
      return a($$2 -> new egg($$2, $$1, 0L, $$0.a()));
   }

   public static efx.a<?> a(det<?> $$0, agg $$1, long $$2) {
      return a($$3 -> new egg($$3, $$1, $$2, $$0.a()));
   }
}
