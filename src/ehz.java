import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehz extends ehq {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  agt.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  atg.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kb.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ehz::new)
   );
   private final agt b;
   private final long c;
   private final ie<dgf<?>> d;

   private ehz(List<ejd> $$0, agt $$1, long $$2, ie<dgf<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ehs b() {
      return eht.s;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         sj $$2 = cka.a($$0);
         if ($$2 == null) {
            $$2 = new sj();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cka.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(egn $$0) {
      super.a($$0);
      egg<egm> $$1 = new egg<>(egj.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static ehq.a<?> a(dgf<?> $$0, agt $$1) {
      return a($$2 -> new ehz($$2, $$1, 0L, $$0.a()));
   }

   public static ehq.a<?> a(dgf<?> $$0, agt $$1, long $$2) {
      return a($$3 -> new ehz($$3, $$1, $$2, $$0.a()));
   }
}
