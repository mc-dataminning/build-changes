import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejj extends ejp {
   public static final MapCodec<ejj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehm.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ejj::new)
   );
   private final ji<ehm> b;
   private final ur c;

   protected ejj(ji<ehm> $$0, ejr.a $$1) {
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
      $$0.a("joint", dqf.a.a.c());
      return $$0;
   }

   @Override
   public kd a(emj $$0, dlk $$1) {
      return kd.g;
   }

   @Override
   public List<emi.c> a(emj $$0, iz $$1, dlk $$2, azf $$3) {
      List<emi.c> $$4 = Lists.newArrayList();
      $$4.add(new emi.c($$1, dez.pb.o().a(diz.b, jg.a(je.a, je.d)), this.c));
      return $$4;
   }

   @Override
   public eia a(emj $$0, iz $$1, dlk $$2) {
      kd $$3 = this.a($$0, $$2);
      return new eia($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(emj $$0, dcr $$1, dcp $$2, dtx $$3, iz $$4, iz $$5, dlk $$6, eia $$7, azf $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ejq<?> a() {
      return ejq.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
