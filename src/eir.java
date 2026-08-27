import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eir extends eii {
   public static final Codec<eir> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ahg.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  atw.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kd.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eir::new)
   );
   private final ahg b;
   private final long c;
   private final ih<dgx<?>> d;

   private eir(List<ejv> $$0, ahg $$1, long $$2, ih<dgx<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eik b() {
      return eil.s;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         sn $$2 = ckr.a($$0);
         if ($$2 == null) {
            $$2 = new sn();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         ckr.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(ehf $$0) {
      super.a($$0);
      egy<ehe> $$1 = new egy<>(ehb.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static eii.a<?> a(dgx<?> $$0, ahg $$1) {
      return a($$2 -> new eir($$2, $$1, 0L, $$0.a()));
   }

   public static eii.a<?> a(dgx<?> $$0, ahg $$1, long $$2) {
      return a($$3 -> new eir($$3, $$1, $$2, $$0.a()));
   }
}
