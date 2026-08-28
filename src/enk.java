import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class enk extends enq {
   public static final MapCodec<enk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(elm.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, enk::new)
   );
   private final jq<elm> b;
   private final ul c;

   protected enk(jq<elm> $$0, ens.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ul b() {
      ul $$0 = new ul();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dua.a.a.c());
      return $$0;
   }

   @Override
   public kl a(eql $$0, dpd $$1) {
      return kl.g;
   }

   @Override
   public List<eqk.c> a(eql $$0, jh $$1, dpd $$2, azu $$3) {
      List<eqk.c> $$4 = Lists.newArrayList();
      $$4.add(new eqk.c($$1, dis.pb.m().b(dmr.b, jo.a(jm.a, jm.d)), this.c));
      return $$4;
   }

   @Override
   public ema a(eql $$0, jh $$1, dpd $$2) {
      kl $$3 = this.a($$0, $$2);
      return new ema($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eql $$0, dgk $$1, dgi $$2, dxr $$3, jh $$4, jh $$5, dpd $$6, ema $$7, azu $$8, epu $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public enr<?> a() {
      return enr.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
