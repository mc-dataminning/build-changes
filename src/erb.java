import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class erb {
   public static final ert a = ert.a;
   public static final Codec<erb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erg.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               erg.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               eqz.c.lenientOptionalFieldOf("position_predicate", eqy.b).forGetter($$0x -> $$0x.e),
               dwv.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eru.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, erb::new)
   );
   private final erg c;
   private final erg d;
   private final eqz e;
   private final dwv f;
   private final eru g;

   public erb(erg $$0, erg $$1, dwv $$2) {
      this($$0, $$1, eqy.b, $$2);
   }

   public erb(erg $$0, erg $$1, eqz $$2, dwv $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public erb(erg $$0, erg $$1, eqz $$2, dwv $$3, eru $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dwv $$0, dwv $$1, ji $$2, ji $$3, ji $$4, azg $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dwv a() {
      return this.f;
   }

   @Nullable
   public tq a(azg $$0, @Nullable tq $$1) {
      return this.g.a($$0, $$1);
   }
}
