import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiq extends eih {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ahg.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  atv.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kd.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eiq::new)
   );
   private final ahg b;
   private final long c;
   private final ih<dgw<?>> d;

   private eiq(List<eju> $$0, ahg $$1, long $$2, ih<dgw<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eij b() {
      return eik.s;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         sn $$2 = ckq.a($$0);
         if ($$2 == null) {
            $$2 = new sn();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         ckq.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(ehe $$0) {
      super.a($$0);
      egx<ehd> $$1 = new egx<>(eha.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static eih.a<?> a(dgw<?> $$0, ahg $$1) {
      return a($$2 -> new eiq($$2, $$1, 0L, $$0.a()));
   }

   public static eih.a<?> a(dgw<?> $$0, ahg $$1, long $$2) {
      return a($$3 -> new eiq($$3, $$1, $$2, $$0.a()));
   }
}
