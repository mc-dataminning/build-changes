import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dys {
   public static final dzk a = dzk.a;
   public static final Codec<dys> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyx.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               dyx.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               dyq.c.optionalFieldOf("position_predicate", dyp.b).forGetter($$0x -> $$0x.e),
               dfl.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               dzl.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dys::new)
   );
   private final dyx c;
   private final dyx d;
   private final dyq e;
   private final dfl f;
   private final dzl g;

   public dys(dyx $$0, dyx $$1, dfl $$2) {
      this($$0, $$1, dyp.b, $$2);
   }

   public dys(dyx $$0, dyx $$1, dyq $$2, dfl $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public dys(dyx $$0, dyx $$1, dyq $$2, dfl $$3, dzl $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dfl $$0, dfl $$1, gw $$2, gw $$3, gw $$4, ase $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dfl a() {
      return this.f;
   }

   @Nullable
   public qy a(ase $$0, @Nullable qy $$1) {
      return this.g.a($$0, $$1);
   }
}
