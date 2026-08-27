import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dvz extends dwf {
   public static final Codec<dvz> a = RecordCodecBuilder.create($$0 -> $$0.group(duc.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dvz::new));
   private final he<duc> b;
   private final qr c;

   protected dvz(he<duc> $$0, dwh.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private qr b() {
      qr $$0 = new qr();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", ddk.a.a.c());
      return $$0;
   }

   @Override
   public hz a(dys $$0, cyx $$1) {
      return hz.g;
   }

   @Override
   public List<dyr.c> a(dys $$0, gu $$1, cyx $$2, aru $$3) {
      List<dyr.c> $$4 = Lists.newArrayList();
      $$4.add(new dyr.c($$1, csm.pb.n().a(cwk.a, hc.a(ha.a, ha.d)), this.c));
      return $$4;
   }

   @Override
   public duq a(dys $$0, gu $$1, cyx $$2) {
      hz $$3 = this.a($$0, $$2);
      return new duq($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dys $$0, cqf $$1, cqd $$2, dgw $$3, gu $$4, gu $$5, cyx $$6, duq $$7, aru $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dwg<?> a() {
      return dwg.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
