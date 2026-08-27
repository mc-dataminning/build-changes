import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ecd {
   public static final ecv a = ecv.a;
   public static final Codec<ecd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eci.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eci.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ecb.c.optionalFieldOf("position_predicate", eca.b).forGetter($$0x -> $$0x.e),
               dip.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ecw.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ecd::new)
   );
   private final eci c;
   private final eci d;
   private final ecb e;
   private final dip f;
   private final ecw g;

   public ecd(eci $$0, eci $$1, dip $$2) {
      this($$0, $$1, eca.b, $$2);
   }

   public ecd(eci $$0, eci $$1, ecb $$2, dip $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ecd(eci $$0, eci $$1, ecb $$2, dip $$3, ecw $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dip $$0, dip $$1, hv $$2, hv $$3, hv $$4, auf $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dip a() {
      return this.f;
   }

   @Nullable
   public sj a(auf $$0, @Nullable sj $$1) {
      return this.g.a($$0, $$1);
   }
}
