import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epl extends epr {
   public static final MapCodec<epl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(enn.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, epl::new)
   );
   private final jr<enn> b;
   private final tq c;

   protected epl(jr<enn> $$0, ept.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tq b() {
      tq $$0 = new tq();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dvv.a.a.c());
      return $$0;
   }

   @Override
   public km a(esm $$0, dqw $$1) {
      return km.h;
   }

   @Override
   public List<esl.a> a(esm $$0, ji $$1, dqw $$2, azh $$3) {
      return List.of(esl.a.a(new esl.d($$1, dkg.pD.m().b(doj.b, jp.a(jn.a, jn.d)), this.c)));
   }

   @Override
   public eob a(esm $$0, ji $$1, dqw $$2) {
      km $$3 = this.a($$0, $$2);
      return new eob($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(esm $$0, dhy $$1, dhv $$2, dzn $$3, ji $$4, ji $$5, dqw $$6, eob $$7, azh $$8, erv $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eps<?> a() {
      return eps.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
