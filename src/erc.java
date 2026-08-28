import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class erc {
   public static final eru a = eru.a;
   public static final Codec<erc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erh.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               erh.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               era.c.lenientOptionalFieldOf("position_predicate", eqz.b).forGetter($$0x -> $$0x.e),
               dww.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               erv.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, erc::new)
   );
   private final erh c;
   private final erh d;
   private final era e;
   private final dww f;
   private final erv g;

   public erc(erh $$0, erh $$1, dww $$2) {
      this($$0, $$1, eqz.b, $$2);
   }

   public erc(erh $$0, erh $$1, era $$2, dww $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public erc(erh $$0, erh $$1, era $$2, dww $$3, erv $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dww $$0, dww $$1, ji $$2, ji $$3, ji $$4, azh $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dww a() {
      return this.f;
   }

   @Nullable
   public tq a(azh $$0, @Nullable tq $$1) {
      return this.g.a($$0, $$1);
   }
}
