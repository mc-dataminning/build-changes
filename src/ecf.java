import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecf extends ecl {
   public static final Codec<ecf> a = RecordCodecBuilder.create($$0 -> $$0.group(eai.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ecf::new));
   private final ij<eai> b;
   private final sw c;

   protected ecf(ij<eai> $$0, ecn.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private sw b() {
      sw $$0 = new sw();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", djt.a.a.c());
      return $$0;
   }

   @Override
   public jd a(eff $$0, dfa $$1) {
      return jd.g;
   }

   @Override
   public List<efe.c> a(eff $$0, hz $$1, dfa $$2, awo $$3) {
      List<efe.c> $$4 = Lists.newArrayList();
      $$4.add(new efe.c($$1, cyq.pb.o().a(dcp.b, ih.a(ie.a, ie.d)), this.c));
      return $$4;
   }

   @Override
   public eaw a(eff $$0, hz $$1, dfa $$2) {
      jd $$3 = this.a($$0, $$2);
      return new eaw($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eff $$0, cwi $$1, cwg $$2, dnc $$3, hz $$4, hz $$5, dfa $$6, eaw $$7, awo $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ecm<?> a() {
      return ecm.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
