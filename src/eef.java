import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eef extends edw {
   public static final Codec<eef> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aez.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  arj.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  jb.l.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eef::new)
   );
   private final aez b;
   private final long c;
   private final he<ddb<?>> d;

   private eef(List<efj> $$0, aez $$1, long $$2, he<ddb<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public edy b() {
      return edz.s;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         qw $$2 = che.a($$0);
         if ($$2 == null) {
            $$2 = new qw();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         che.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(ect $$0) {
      super.a($$0);
      ecm<ecs> $$1 = new ecm<>(ecp.c, this.b);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.b);
      }
   }

   public static edw.a<?> a(ddb<?> $$0, aez $$1) {
      return a($$2 -> new eef($$2, $$1, 0L, $$0.a()));
   }

   public static edw.a<?> a(ddb<?> $$0, aez $$1, long $$2) {
      return a($$3 -> new eef($$3, $$1, $$2, $$0.a()));
   }
}
