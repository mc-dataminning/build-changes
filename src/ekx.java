import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekx extends eko {
   public static final Codec<ekx> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aiy.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  avq.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kf.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ekx::new)
   );
   private final aiy b;
   private final long c;
   private final ij<diz<?>> d;

   private ekx(List<emb> $$0, aiy $$1, long $$2, ij<diz<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ekq b() {
      return ekr.s;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         sw $$2 = cmw.a($$0);
         if ($$2 == null) {
            $$2 = new sw();
         }

         $$2.a("LootTable", this.b.toString());
         if (this.c != 0L) {
            $$2.a("LootTableSeed", this.c);
         }

         cmw.a($$0, this.d.a(), $$2);
         return $$0;
      }
   }

   @Override
   public void a(ejl $$0) {
      super.a($$0);
      eje<ejk> $$1 = new eje<>(ejh.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static eko.a<?> a(diz<?> $$0, aiy $$1) {
      return a($$2 -> new ekx($$2, $$1, 0L, $$0.a()));
   }

   public static eko.a<?> a(diz<?> $$0, aiy $$1, long $$2) {
      return a($$3 -> new ekx($$3, $$1, $$2, $$0.a()));
   }
}
