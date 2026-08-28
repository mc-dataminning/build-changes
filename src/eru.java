import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eru {
   public static final esm a = esm.a;
   public static final Codec<eru> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erz.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               erz.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ers.c.lenientOptionalFieldOf("position_predicate", err.b).forGetter($$0x -> $$0x.e),
               dxo.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               esn.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eru::new)
   );
   private final erz c;
   private final erz d;
   private final ers e;
   private final dxo f;
   private final esn g;

   public eru(erz $$0, erz $$1, dxo $$2) {
      this($$0, $$1, err.b, $$2);
   }

   public eru(erz $$0, erz $$1, ers $$2, dxo $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eru(erz $$0, erz $$1, ers $$2, dxo $$3, esn $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dxo $$0, dxo $$1, jh $$2, jh $$3, jh $$4, bac $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dxo a() {
      return this.f;
   }

   @Nullable
   public um a(bac $$0, @Nullable um $$1) {
      return this.g.a($$0, $$1);
   }
}
