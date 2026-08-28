import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejg extends ejm {
   public static final MapCodec<ejg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehj.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ejg::new)
   );
   private final ji<ehj> b;
   private final ur c;

   protected ejg(ji<ehj> $$0, ejo.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ur b() {
      ur $$0 = new ur();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dqc.a.a.c());
      return $$0;
   }

   @Override
   public kd a(emg $$0, dlh $$1) {
      return kd.g;
   }

   @Override
   public List<emf.c> a(emg $$0, iz $$1, dlh $$2, azc $$3) {
      List<emf.c> $$4 = Lists.newArrayList();
      $$4.add(new emf.c($$1, dew.pb.n().a(diw.b, jg.a(je.a, je.d)), this.c));
      return $$4;
   }

   @Override
   public ehx a(emg $$0, iz $$1, dlh $$2) {
      kd $$3 = this.a($$0, $$2);
      return new ehx($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(emg $$0, dco $$1, dcm $$2, dtu $$3, iz $$4, iz $$5, dlh $$6, ehx $$7, azc $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ejn<?> a() {
      return ejn.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
