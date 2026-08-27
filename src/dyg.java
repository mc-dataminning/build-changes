import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyg {
   public static final dyy a = dyy.a;
   public static final Codec<dyg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyl.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               dyl.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               dye.c.optionalFieldOf("position_predicate", dyd.b).forGetter($$0x -> $$0x.e),
               dez.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               dyz.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyg::new)
   );
   private final dyl c;
   private final dyl d;
   private final dye e;
   private final dez f;
   private final dyz g;

   public dyg(dyl $$0, dyl $$1, dez $$2) {
      this($$0, $$1, dyd.b, $$2);
   }

   public dyg(dyl $$0, dyl $$1, dye $$2, dez $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public dyg(dyl $$0, dyl $$1, dye $$2, dez $$3, dyz $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dez $$0, dez $$1, gu $$2, gu $$3, gu $$4, aru $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dez a() {
      return this.f;
   }

   @Nullable
   public qr a(aru $$0, @Nullable qr $$1) {
      return this.g.a($$0, $$1);
   }
}
