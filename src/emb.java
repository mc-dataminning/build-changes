import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emb {
   public static final emt a = emt.a;
   public static final Codec<emb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emg.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               emg.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               elz.c.lenientOptionalFieldOf("position_predicate", ely.b).forGetter($$0x -> $$0x.e),
               dse.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               emu.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, emb::new)
   );
   private final emg c;
   private final emg d;
   private final elz e;
   private final dse f;
   private final emu g;

   public emb(emg $$0, emg $$1, dse $$2) {
      this($$0, $$1, ely.b, $$2);
   }

   public emb(emg $$0, emg $$1, elz $$2, dse $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public emb(emg $$0, emg $$1, elz $$2, dse $$3, emu $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dse $$0, dse $$1, iz $$2, iz $$3, iz $$4, azh $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dse a() {
      return this.f;
   }

   @Nullable
   public us a(azh $$0, @Nullable us $$1) {
      return this.g.a($$0, $$1);
   }
}
