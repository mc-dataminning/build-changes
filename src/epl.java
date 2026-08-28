import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epl extends epr {
   public static final MapCodec<epl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(enn.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, epl::new)
   );
   private final jq<enn> b;
   private final ux c;

   protected epl(jq<enn> $$0, ept.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ux b() {
      ux $$0 = new ux();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dvz.a.a.c());
      return $$0;
   }

   @Override
   public kl a(esm $$0, drb $$1) {
      return kl.g;
   }

   @Override
   public List<esl.a> a(esm $$0, jh $$1, drb $$2, bam $$3) {
      return List.of(esl.a.a(new esl.d($$1, dkn.pw.m().b(dop.b, jo.a(jm.a, jm.d)), this.c)));
   }

   @Override
   public eob a(esm $$0, jh $$1, drb $$2) {
      kl $$3 = this.a($$0, $$2);
      return new eob($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(esm $$0, dif $$1, did $$2, dzq $$3, jh $$4, jh $$5, drb $$6, eob $$7, bam $$8, erv $$9, boolean $$10) {
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
