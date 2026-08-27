import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ela {
   public static final els a = els.a;
   public static final Codec<ela> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elf.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               elf.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eky.c.lenientOptionalFieldOf("position_predicate", ekx.b).forGetter($$0x -> $$0x.e),
               drd.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               elt.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ela::new)
   );
   private final elf c;
   private final elf d;
   private final eky e;
   private final drd f;
   private final elt g;

   public ela(elf $$0, elf $$1, drd $$2) {
      this($$0, $$1, ekx.b, $$2);
   }

   public ela(elf $$0, elf $$1, eky $$2, drd $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ela(elf $$0, elf $$1, eky $$2, drd $$3, elt $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(drd $$0, drd $$1, io $$2, io $$3, io $$4, aym $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public drd a() {
      return this.f;
   }

   @Nullable
   public ud a(aym $$0, @Nullable ud $$1) {
      return this.g.a($$0, $$1);
   }
}
