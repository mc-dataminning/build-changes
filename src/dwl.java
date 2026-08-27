import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwl extends dwr {
   public static final Codec<dwl> a = RecordCodecBuilder.create($$0 -> $$0.group(duo.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dwl::new));
   private final hg<duo> b;
   private final qy c;

   protected dwl(hg<duo> $$0, dwt.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private qy b() {
      qy $$0 = new qy();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", ddw.a.a.c());
      return $$0;
   }

   @Override
   public ib a(dze $$0, czj $$1) {
      return ib.g;
   }

   @Override
   public List<dzd.c> a(dze $$0, gw $$1, czj $$2, ase $$3) {
      List<dzd.c> $$4 = Lists.newArrayList();
      $$4.add(new dzd.c($$1, csy.pb.n().a(cww.a, he.a(hc.a, hc.d)), this.c));
      return $$4;
   }

   @Override
   public dvc a(dze $$0, gw $$1, czj $$2) {
      ib $$3 = this.a($$0, $$2);
      return new dvc($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dze $$0, cqr $$1, cqp $$2, dhi $$3, gw $$4, gw $$5, czj $$6, dvc $$7, ase $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dws<?> a() {
      return dws.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
