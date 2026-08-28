import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejm extends ejs {
   public static final MapCodec<ejm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehp.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ejm::new)
   );
   private final ji<ehp> b;
   private final us c;

   protected ejm(ji<ehp> $$0, eju.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private us b() {
      us $$0 = new us();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dqi.a.a.c());
      return $$0;
   }

   @Override
   public kd a(emm $$0, dln $$1) {
      return kd.g;
   }

   @Override
   public List<eml.c> a(emm $$0, iz $$1, dln $$2, azh $$3) {
      List<eml.c> $$4 = Lists.newArrayList();
      $$4.add(new eml.c($$1, dfc.pb.o().a(djc.b, jg.a(je.a, je.d)), this.c));
      return $$4;
   }

   @Override
   public eid a(emm $$0, iz $$1, dln $$2) {
      kd $$3 = this.a($$0, $$2);
      return new eid($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(emm $$0, dcu $$1, dcs $$2, dua $$3, iz $$4, iz $$5, dln $$6, eid $$7, azh $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ejt<?> a() {
      return ejt.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
