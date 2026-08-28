import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evu {
   public static final ewm a = ewm.a;
   public static final Codec<evu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               evz.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               evz.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               evs.c.lenientOptionalFieldOf("position_predicate", evr.b).forGetter($$0x -> $$0x.e),
               ebg.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ewn.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, evu::new)
   );
   private final evz c;
   private final evz d;
   private final evs e;
   private final ebg f;
   private final ewn g;

   public evu(evz $$0, evz $$1, ebg $$2) {
      this($$0, $$1, evr.b, $$2);
   }

   public evu(evz $$0, evz $$1, evs $$2, ebg $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public evu(evz $$0, evz $$1, evs $$2, ebg $$3, ewn $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(ebg $$0, ebg $$1, iw $$2, iw $$3, iw $$4, azz $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public ebg a() {
      return this.f;
   }

   @Nullable
   public ua a(azz $$0, @Nullable ua $$1) {
      return this.g.a($$0, $$1);
   }
}
