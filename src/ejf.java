import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ejf {
   public static final ejx a = ejx.a;
   public static final Codec<ejf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejk.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               ejk.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ejd.c.optionalFieldOf("position_predicate", ejc.b).forGetter($$0x -> $$0x.e),
               dpi.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ejy.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ejf::new)
   );
   private final ejk c;
   private final ejk d;
   private final ejd e;
   private final dpi f;
   private final ejy g;

   public ejf(ejk $$0, ejk $$1, dpi $$2) {
      this($$0, $$1, ejc.b, $$2);
   }

   public ejf(ejk $$0, ejk $$1, ejd $$2, dpi $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ejf(ejk $$0, ejk $$1, ejd $$2, dpi $$3, ejy $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dpi $$0, dpi $$1, id $$2, id $$3, id $$4, axt $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dpi a() {
      return this.f;
   }

   @Nullable
   public to a(axt $$0, @Nullable to $$1) {
      return this.g.a($$0, $$1);
   }
}
