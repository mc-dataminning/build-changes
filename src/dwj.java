import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwj extends dwp {
   public static final Codec<dwj> a = RecordCodecBuilder.create($$0 -> $$0.group(dum.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dwj::new));
   private final he<dum> b;
   private final qw c;

   protected dwj(he<dum> $$0, dwr.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private qw b() {
      qw $$0 = new qw();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", ddu.a.a.c());
      return $$0;
   }

   @Override
   public hy a(dzc $$0, czh $$1) {
      return hy.g;
   }

   @Override
   public List<dzb.c> a(dzc $$0, gw $$1, czh $$2, asc $$3) {
      List<dzb.c> $$4 = Lists.newArrayList();
      $$4.add(new dzb.c($$1, csw.pb.n().a(cwu.a, hc.a(ha.a, ha.d)), this.c));
      return $$4;
   }

   @Override
   public dva a(dzc $$0, gw $$1, czh $$2) {
      hy $$3 = this.a($$0, $$2);
      return new dva($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dzc $$0, cqp $$1, cqn $$2, dhg $$3, gw $$4, gw $$5, czh $$6, dva $$7, asc $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dwq<?> a() {
      return dwq.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
