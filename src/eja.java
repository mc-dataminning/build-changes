import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eja extends eir {
   public static final Codec<eja> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ahh.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  atx.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kd.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eja::new)
   );
   private final ahh b;
   private final long c;
   private final ih<dhf<?>> d;

   private eja(List<eke> $$0, ahh $$1, long $$2, ih<dhf<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eit b() {
      return eiu.s;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         so $$2 = cla.a($$0);
         if ($$2 == null) {
            $$2 = new so();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cla.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(eho $$0) {
      super.a($$0);
      ehh<ehn> $$1 = new ehh<>(ehk.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static eir.a<?> a(dhf<?> $$0, ahh $$1) {
      return a($$2 -> new eja($$2, $$1, 0L, $$0.a()));
   }

   public static eir.a<?> a(dhf<?> $$0, ahh $$1, long $$2) {
      return a($$3 -> new eja($$3, $$1, $$2, $$0.a()));
   }
}
