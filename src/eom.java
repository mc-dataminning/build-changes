import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eom extends eos {
   public static final MapCodec<eom> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emo.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, eom::new)
   );
   private final jr<emo> b;
   private final tq c;

   protected eom(jr<emo> $$0, eou.a $$1) {
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
      $$0.a("joint", dva.a.a.c());
      return $$0;
   }

   @Override
   public km a(ern $$0, dqc $$1) {
      return km.h;
   }

   @Override
   public List<erm.a> a(ern $$0, ji $$1, dqc $$2, azg $$3) {
      return List.of(erm.a.a(new erm.d($$1, djm.pD.m().b(dno.b, jp.a(jn.a, jn.d)), this.c)));
   }

   @Override
   public enc a(ern $$0, ji $$1, dqc $$2) {
      km $$3 = this.a($$0, $$2);
      return new enc($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ern $$0, dhe $$1, dhc $$2, dyr $$3, ji $$4, ji $$5, dqc $$6, enc $$7, azg $$8, eqw $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eot<?> a() {
      return eot.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
