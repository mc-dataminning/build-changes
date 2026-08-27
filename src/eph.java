import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eph extends eox {
   public static final Codec<eph> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ajv.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  awu.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  kt.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eph::new)
   );
   private final ajv b;
   private final long c;
   private final in<dmq<?>> d;

   private eph(List<eql> $$0, ajv $$1, long $$2, in<dmq<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eoz b() {
      return epa.t;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         $$0.b(jr.U, new cuq(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ent $$0) {
      super.a($$0);
      enm<ens> $$1 = new enm<>(enp.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static eox.a<?> a(dmq<?> $$0, ajv $$1) {
      return a($$2 -> new eph($$2, $$1, 0L, $$0.a()));
   }

   public static eox.a<?> a(dmq<?> $$0, ajv $$1, long $$2) {
      return a($$3 -> new eph($$3, $$1, $$2, $$0.a()));
   }
}
