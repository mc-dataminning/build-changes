import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efd extends eeu {
   public static final Codec<efd> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  afw.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  asg.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  jy.l.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, efd::new)
   );
   private final afw b;
   private final long c;
   private final ib<ddz<?>> d;

   private efd(List<egh> $$0, afw $$1, long $$2, ib<ddz<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eew b() {
      return eex.s;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         rt $$2 = cic.a($$0);
         if ($$2 == null) {
            $$2 = new rt();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cic.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(edr $$0) {
      super.a($$0);
      edk<edq> $$1 = new edk<>(edn.c, this.b);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.b);
      }
   }

   public static eeu.a<?> a(ddz<?> $$0, afw $$1) {
      return a($$2 -> new efd($$2, $$1, 0L, $$0.a()));
   }

   public static eeu.a<?> a(ddz<?> $$0, afw $$1, long $$2) {
      return a($$3 -> new efd($$3, $$1, $$2, $$0.a()));
   }
}
