import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emz extends enf {
   public static final MapCodec<emz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(elb.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, emz::new)
   );
   private final jq<elb> b;
   private final uk c;

   protected emz(jq<elb> $$0, enh.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private uk b() {
      uk $$0 = new uk();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dto.a.a.c());
      return $$0;
   }

   @Override
   public kl a(eqa $$0, dor $$1) {
      return kl.g;
   }

   @Override
   public List<epz.c> a(eqa $$0, jh $$1, dor $$2, azs $$3) {
      List<epz.c> $$4 = Lists.newArrayList();
      $$4.add(new epz.c($$1, dig.pb.m().b(dmf.b, jo.a(jm.a, jm.d)), this.c));
      return $$4;
   }

   @Override
   public elp a(eqa $$0, jh $$1, dor $$2) {
      kl $$3 = this.a($$0, $$2);
      return new elp($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eqa $$0, dfy $$1, dfw $$2, dxg $$3, jh $$4, jh $$5, dor $$6, elp $$7, azs $$8, epj $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eng<?> a() {
      return eng.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
