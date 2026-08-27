import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekq extends ekh {
   public static final Codec<ekq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aiy.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  avp.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kf.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ekq::new)
   );
   private final aiy b;
   private final long c;
   private final ij<div<?>> d;

   private ekq(List<elu> $$0, aiy $$1, long $$2, ij<div<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ekj b() {
      return ekk.s;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         sw $$2 = cms.a($$0);
         if ($$2 == null) {
            $$2 = new sw();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cms.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(eje $$0) {
      super.a($$0);
      eix<ejd> $$1 = new eix<>(eja.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static ekh.a<?> a(div<?> $$0, aiy $$1) {
      return a($$2 -> new ekq($$2, $$1, 0L, $$0.a()));
   }

   public static ekh.a<?> a(div<?> $$0, aiy $$1, long $$2) {
      return a($$3 -> new ekq($$3, $$1, $$2, $$0.a()));
   }
}
