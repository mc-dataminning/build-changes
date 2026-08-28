import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class esx {
   public static final etp a = etp.a;
   public static final Codec<esx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etc.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               etc.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               esv.c.lenientOptionalFieldOf("position_predicate", esu.b).forGetter($$0x -> $$0x.e),
               dym.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               etq.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, esx::new)
   );
   private final etc c;
   private final etc d;
   private final esv e;
   private final dym f;
   private final etq g;

   public esx(etc $$0, etc $$1, dym $$2) {
      this($$0, $$1, esu.b, $$2);
   }

   public esx(etc $$0, etc $$1, esv $$2, dym $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public esx(etc $$0, etc $$1, esv $$2, dym $$3, etq $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dym $$0, dym $$1, jj $$2, jj $$3, jj $$4, azs $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dym a() {
      return this.f;
   }

   @Nullable
   public tw a(azs $$0, @Nullable tw $$1) {
      return this.g.a($$0, $$1);
   }
}
