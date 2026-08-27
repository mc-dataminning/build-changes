import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egs extends egj {
   public static final Codec<egs> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  agi.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  asu.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  jy.l.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, egs::new)
   );
   private final agi b;
   private final long c;
   private final ib<dff<?>> d;

   private egs(List<ehw> $$0, agi $$1, long $$2, ib<dff<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public egl b() {
      return egm.s;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         rz $$2 = cjc.a($$0);
         if ($$2 == null) {
            $$2 = new rz();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cjc.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(efg $$0) {
      super.a($$0);
      eez<eff> $$1 = new eez<>(efc.c, this.b);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.b);
      }
   }

   public static egj.a<?> a(dff<?> $$0, agi $$1) {
      return a($$2 -> new egs($$2, $$1, 0L, $$0.a()));
   }

   public static egj.a<?> a(dff<?> $$0, agi $$1, long $$2) {
      return a($$3 -> new egs($$3, $$1, $$2, $$0.a()));
   }
}
