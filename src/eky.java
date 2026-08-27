import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eky {
   public static final elq a = elq.a;
   public static final Codec<eky> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eld.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eld.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ekw.c.lenientOptionalFieldOf("position_predicate", ekv.b).forGetter($$0x -> $$0x.e),
               drb.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               elr.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eky::new)
   );
   private final eld c;
   private final eld d;
   private final ekw e;
   private final drb f;
   private final elr g;

   public eky(eld $$0, eld $$1, drb $$2) {
      this($$0, $$1, ekv.b, $$2);
   }

   public eky(eld $$0, eld $$1, ekw $$2, drb $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eky(eld $$0, eld $$1, ekw $$2, drb $$3, elr $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(drb $$0, drb $$1, io $$2, io $$3, io $$4, ayk $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public drb a() {
      return this.f;
   }

   @Nullable
   public ud a(ayk $$0, @Nullable ud $$1) {
      return this.g.a($$0, $$1);
   }
}
