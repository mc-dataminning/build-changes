import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emp extends emg {
   public static final Codec<emp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ajh.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  awe.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  ki.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, emp::new)
   );
   private final ajh b;
   private final long c;
   private final il<dki<?>> d;

   private emp(List<ent> $$0, ajh $$1, long $$2, il<dki<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public emi b() {
      return emj.s;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         ta $$2 = cof.a($$0);
         if ($$2 == null) {
            $$2 = new ta();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cof.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(eld $$0) {
      super.a($$0);
      ekw<elc> $$1 = new ekw<>(ekz.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static emg.a<?> a(dki<?> $$0, ajh $$1) {
      return a($$2 -> new emp($$2, $$1, 0L, $$0.a()));
   }

   public static emg.a<?> a(dki<?> $$0, ajh $$1, long $$2) {
      return a($$3 -> new emp($$3, $$1, $$2, $$0.a()));
   }
}
