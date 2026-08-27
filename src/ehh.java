import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehh extends ehn {
   public static final Codec<ehh> a = RecordCodecBuilder.create($$0 -> $$0.group(efk.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ehh::new));
   private final iv<efk> b;
   private final ty c;

   protected ehh(iv<efk> $$0, ehp.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ty b() {
      ty $$0 = new ty();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dod.a.a.c());
      return $$0;
   }

   @Override
   public jq a(ekh $$0, dji $$1) {
      return jq.g;
   }

   @Override
   public List<ekg.c> a(ekh $$0, im $$1, dji $$2, ayd $$3) {
      List<ekg.c> $$4 = Lists.newArrayList();
      $$4.add(new ekg.c($$1, dcx.pb.n().a(dgx.b, it.a(ir.a, ir.d)), this.c));
      return $$4;
   }

   @Override
   public efy a(ekh $$0, im $$1, dji $$2) {
      jq $$3 = this.a($$0, $$2);
      return new efy($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ekh $$0, dap $$1, dan $$2, drv $$3, im $$4, im $$5, dji $$6, efy $$7, ayd $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eho<?> a() {
      return eho.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
