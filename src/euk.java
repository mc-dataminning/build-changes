import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class euk {
   public static final evc a = evc.a;
   public static final Codec<euk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eup.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eup.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eui.c.lenientOptionalFieldOf("position_predicate", euh.b).forGetter($$0x -> $$0x.e),
               dzz.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               evd.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, euk::new)
   );
   private final eup c;
   private final eup d;
   private final eui e;
   private final dzz f;
   private final evd g;

   public euk(eup $$0, eup $$1, dzz $$2) {
      this($$0, $$1, euh.b, $$2);
   }

   public euk(eup $$0, eup $$1, eui $$2, dzz $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public euk(eup $$0, eup $$1, eui $$2, dzz $$3, evd $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dzz $$0, dzz $$1, iu $$2, iu $$3, iu $$4, azv $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dzz a() {
      return this.f;
   }

   @Nullable
   public tz a(azv $$0, @Nullable tz $$1) {
      return this.g.a($$0, $$1);
   }
}
