import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class een extends eee {
   public static final Codec<een> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aey.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  arh.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  jd.l.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, een::new)
   );
   private final aey b;
   private final long c;
   private final hg<dcz<?>> d;

   private een(List<efr> $$0, aey $$1, long $$2, hg<dcz<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eeg b() {
      return eeh.s;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         qy $$2 = cha.a($$0);
         if ($$2 == null) {
            $$2 = new qy();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cha.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(edb $$0) {
      super.a($$0);
      ecu<eda> $$1 = new ecu<>(ecx.c, this.b);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.b);
      }
   }

   public static eee.a<?> a(dcz<?> $$0, aey $$1) {
      return a($$2 -> new een($$2, $$1, 0L, $$0.a()));
   }

   public static eee.a<?> a(dcz<?> $$0, aey $$1, long $$2) {
      return a($$3 -> new een($$3, $$1, $$2, $$0.a()));
   }
}
