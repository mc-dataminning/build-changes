import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eus {
   public static final evk a = evk.a;
   public static final Codec<eus> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eux.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eux.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               euq.c.lenientOptionalFieldOf("position_predicate", eup.b).forGetter($$0x -> $$0x.e),
               eah.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               evl.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eus::new)
   );
   private final eux c;
   private final eux d;
   private final euq e;
   private final eah f;
   private final evl g;

   public eus(eux $$0, eux $$1, eah $$2) {
      this($$0, $$1, eup.b, $$2);
   }

   public eus(eux $$0, eux $$1, euq $$2, eah $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eus(eux $$0, eux $$1, euq $$2, eah $$3, evl $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(eah $$0, eah $$1, iu $$2, iu $$3, iu $$4, azv $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public eah a() {
      return this.f;
   }

   @Nullable
   public tz a(azv $$0, @Nullable tz $$1) {
      return this.g.a($$0, $$1);
   }
}
