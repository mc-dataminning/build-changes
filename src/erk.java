import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erk extends erq {
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(epm.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, erk::new)
   );
   private final je<epm> b;
   private final tx c;

   protected erk(je<epm> $$0, ers.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tx b() {
      tx $$0 = new tx();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dxr.a.a.c());
      return $$0;
   }

   @Override
   public jz a(eul $$0, dsm $$1) {
      return jz.i;
   }

   @Override
   public List<euk.a> a(eul $$0, iu $$1, dsm $$2, azt $$3) {
      return List.of(euk.a.a(new euk.d($$1, dlw.pD.m().b(dpz.b, jc.a(ja.a, ja.d)), this.c)));
   }

   @Override
   public eqa a(eul $$0, iu $$1, dsm $$2) {
      jz $$3 = this.a($$0, $$2);
      return new eqa($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eul $$0, djo $$1, djl $$2, ebm $$3, iu $$4, iu $$5, dsm $$6, eqa $$7, azt $$8, etu $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public err<?> a() {
      return err.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
