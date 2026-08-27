import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eel extends eec {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aex.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  arg.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  jd.l.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eel::new)
   );
   private final aex b;
   private final long c;
   private final hg<dcx<?>> d;

   private eel(List<efp> $$0, aex $$1, long $$2, hg<dcx<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eee b() {
      return eef.s;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         qy $$2 = cgy.a($$0);
         if ($$2 == null) {
            $$2 = new qy();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cgy.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(ecz $$0) {
      super.a($$0);
      ecs<ecy> $$1 = new ecs<>(ecv.c, this.b);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.b);
      }
   }

   public static eec.a<?> a(dcx<?> $$0, aex $$1) {
      return a($$2 -> new eel($$2, $$1, 0L, $$0.a()));
   }

   public static eec.a<?> a(dcx<?> $$0, aex $$1, long $$2) {
      return a($$3 -> new eel($$3, $$1, $$2, $$0.a()));
   }
}
