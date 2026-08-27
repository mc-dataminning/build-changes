import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eeb extends eds {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aer.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  aqy.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  jb.l.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eeb::new)
   );
   private final aer b;
   private final long c;
   private final he<dcn<?>> d;

   private eeb(List<eff> $$0, aer $$1, long $$2, he<dcn<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public edu b() {
      return edv.s;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         qr $$2 = cgq.a($$0);
         if ($$2 == null) {
            $$2 = new qr();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cgq.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(ecp $$0) {
      super.a($$0);
      eci<eco> $$1 = new eci<>(ecl.c, this.b);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.b);
      }
   }

   public static eds.a<?> a(dcn<?> $$0, aer $$1) {
      return a($$2 -> new eeb($$2, $$1, 0L, $$0.a()));
   }

   public static eds.a<?> a(dcn<?> $$0, aer $$1, long $$2) {
      return a($$3 -> new eeb($$3, $$1, $$2, $$0.a()));
   }
}
