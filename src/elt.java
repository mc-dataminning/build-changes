import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elt extends elk {
   public static final Codec<elt> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ajc.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  avu.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kh.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, elt::new)
   );
   private final ajc b;
   private final long c;
   private final il<djn<?>> d;

   private elt(List<emx> $$0, ajc $$1, long $$2, il<djn<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public elm b() {
      return eln.s;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         sy $$2 = cnl.a($$0);
         if ($$2 == null) {
            $$2 = new sy();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cnl.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(ekh $$0) {
      super.a($$0);
      eka<ekg> $$1 = new eka<>(ekd.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static elk.a<?> a(djn<?> $$0, ajc $$1) {
      return a($$2 -> new elt($$2, $$1, 0L, $$0.a()));
   }

   public static elk.a<?> a(djn<?> $$0, ajc $$1, long $$2) {
      return a($$3 -> new elt($$3, $$1, $$2, $$0.a()));
   }
}
