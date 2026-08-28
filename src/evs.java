import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class evs {
   public static final ewk a = ewk.a;
   public static final Codec<evs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               evx.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               evx.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               evq.c.lenientOptionalFieldOf("position_predicate", evp.b).forGetter($$0x -> $$0x.e),
               ebe.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               ewl.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, evs::new)
   );
   private final evx c;
   private final evx d;
   private final evq e;
   private final ebe f;
   private final ewl g;

   public evs(evx $$0, evx $$1, ebe $$2) {
      this($$0, $$1, evp.b, $$2);
   }

   public evs(evx $$0, evx $$1, evq $$2, ebe $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public evs(evx $$0, evx $$1, evq $$2, ebe $$3, ewl $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(ebe $$0, ebe $$1, iv $$2, iv $$3, iv $$4, azx $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public ebe a() {
      return this.f;
   }

   @Nullable
   public tz a(azx $$0, @Nullable tz $$1) {
      return this.g.a($$0, $$1);
   }
}
