import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eik extends eib {
   public static final Codec<eik> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ahd.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  atq.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kd.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eik::new)
   );
   private final ahd b;
   private final long c;
   private final ih<dgq<?>> d;

   private eik(List<ejo> $$0, ahd $$1, long $$2, ih<dgq<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eid b() {
      return eie.s;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         sl $$2 = ckk.a($$0);
         if ($$2 == null) {
            $$2 = new sl();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         ckk.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(egy $$0) {
      super.a($$0);
      egr<egx> $$1 = new egr<>(egu.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static eib.a<?> a(dgq<?> $$0, ahd $$1) {
      return a($$2 -> new eik($$2, $$1, 0L, $$0.a()));
   }

   public static eib.a<?> a(dgq<?> $$0, ahd $$1, long $$2) {
      return a($$3 -> new eik($$3, $$1, $$2, $$0.a()));
   }
}
