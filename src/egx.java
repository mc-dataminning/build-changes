import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egx extends ego {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  agm.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  asy.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kc.l.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, egx::new)
   );
   private final agm b;
   private final long c;
   private final ig<dfk<?>> d;

   private egx(List<eib> $$0, agm $$1, long $$2, ig<dfk<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public egq b() {
      return egr.s;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         sd $$2 = cjh.a($$0);
         if ($$2 == null) {
            $$2 = new sd();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cjh.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(efl $$0) {
      super.a($$0);
      efe<efk> $$1 = new efe<>(efh.c, this.b);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.b);
      }
   }

   public static ego.a<?> a(dfk<?> $$0, agm $$1) {
      return a($$2 -> new egx($$2, $$1, 0L, $$0.a()));
   }

   public static ego.a<?> a(dfk<?> $$0, agm $$1, long $$2) {
      return a($$3 -> new egx($$3, $$1, $$2, $$0.a()));
   }
}
