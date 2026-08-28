import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elz {
   public static final emr a = emr.a;
   public static final Codec<elz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eme.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eme.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               elx.c.lenientOptionalFieldOf("position_predicate", elw.b).forGetter($$0x -> $$0x.e),
               dsc.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ems.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elz::new)
   );
   private final eme c;
   private final eme d;
   private final elx e;
   private final dsc f;
   private final ems g;

   public elz(eme $$0, eme $$1, dsc $$2) {
      this($$0, $$1, elw.b, $$2);
   }

   public elz(eme $$0, eme $$1, elx $$2, dsc $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public elz(eme $$0, eme $$1, elx $$2, dsc $$3, ems $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dsc $$0, dsc $$1, iz $$2, iz $$3, iz $$4, azh $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dsc a() {
      return this.f;
   }

   @Nullable
   public us a(azh $$0, @Nullable us $$1) {
      return this.g.a($$0, $$1);
   }
}
