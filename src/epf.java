import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epf extends epl {
   public static final MapCodec<epf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(enh.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, epf::new)
   );
   private final jq<enh> b;
   private final um c;

   protected epf(jq<enh> $$0, epn.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private um b() {
      um $$0 = new um();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dvt.a.a.c());
      return $$0;
   }

   @Override
   public kl a(esg $$0, dqv $$1) {
      return kl.h;
   }

   @Override
   public List<esf.a> a(esg $$0, jh $$1, dqv $$2, bac $$3) {
      return List.of(esf.a.a(new esf.d($$1, dkf.pD.m().b(doh.b, jo.a(jm.a, jm.d)), this.c)));
   }

   @Override
   public env a(esg $$0, jh $$1, dqv $$2) {
      kl $$3 = this.a($$0, $$2);
      return new env($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(esg $$0, dhx $$1, dhv $$2, dzk $$3, jh $$4, jh $$5, dqv $$6, env $$7, bac $$8, erp $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public epm<?> a() {
      return epm.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
