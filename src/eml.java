import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eml {
   public static final end a = end.a;
   public static final Codec<eml> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emq.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               emq.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               emj.c.lenientOptionalFieldOf("position_predicate", emi.b).forGetter($$0x -> $$0x.e),
               dsk.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ene.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eml::new)
   );
   private final emq c;
   private final emq d;
   private final emj e;
   private final dsk f;
   private final ene g;

   public eml(emq $$0, emq $$1, dsk $$2) {
      this($$0, $$1, emi.b, $$2);
   }

   public eml(emq $$0, emq $$1, emj $$2, dsk $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eml(emq $$0, emq $$1, emj $$2, dsk $$3, ene $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dsk $$0, dsk $$1, ja $$2, ja $$3, ja $$4, ayo $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dsk a() {
      return this.f;
   }

   @Nullable
   public tx a(ayo $$0, @Nullable tx $$1) {
      return this.g.a($$0, $$1);
   }
}
