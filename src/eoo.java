import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eoo extends eou {
   public static final MapCodec<eoo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emq.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, eoo::new)
   );
   private final jr<emq> b;
   private final tq c;

   protected eoo(jr<emq> $$0, eow.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tq b() {
      tq $$0 = new tq();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dvc.a.a.c());
      return $$0;
   }

   @Override
   public km a(erp $$0, dqe $$1) {
      return km.h;
   }

   @Override
   public List<ero.a> a(erp $$0, ji $$1, dqe $$2, azh $$3) {
      return List.of(ero.a.a(new ero.d($$1, djo.pD.m().b(dnq.b, jp.a(jn.a, jn.d)), this.c)));
   }

   @Override
   public ene a(erp $$0, ji $$1, dqe $$2) {
      km $$3 = this.a($$0, $$2);
      return new ene($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(erp $$0, dhg $$1, dhe $$2, dyt $$3, ji $$4, ji $$5, dqe $$6, ene $$7, azh $$8, eqy $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eov<?> a() {
      return eov.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
