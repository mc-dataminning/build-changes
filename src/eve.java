import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eve {
   public static final evw a = evw.a;
   public static final Codec<eve> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               evj.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               evj.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               evc.c.lenientOptionalFieldOf("position_predicate", evb.b).forGetter($$0x -> $$0x.e),
               eat.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               evx.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eve::new)
   );
   private final evj c;
   private final evj d;
   private final evc e;
   private final eat f;
   private final evx g;

   public eve(evj $$0, evj $$1, eat $$2) {
      this($$0, $$1, evb.b, $$2);
   }

   public eve(evj $$0, evj $$1, evc $$2, eat $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eve(evj $$0, evj $$1, evc $$2, eat $$3, evx $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(eat $$0, eat $$1, iv $$2, iv $$3, iv $$4, azv $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public eat a() {
      return this.f;
   }

   @Nullable
   public tz a(azv $$0, @Nullable tz $$1) {
      return this.g.a($$0, $$1);
   }
}
