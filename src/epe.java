import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epe extends epk {
   public static final MapCodec<epe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eng.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, epe::new)
   );
   private final jq<eng> b;
   private final ux c;

   protected epe(jq<eng> $$0, epm.a $$1) {
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
      $$0.a("joint", dvs.a.a.c());
      return $$0;
   }

   @Override
   public kl a(esf $$0, dqu $$1) {
      return kl.g;
   }

   @Override
   public List<ese.a> a(esf $$0, jh $$1, dqu $$2, bam $$3) {
      return List.of(ese.a.a(new ese.d($$1, dkg.pw.m().b(doi.b, jo.a(jm.a, jm.d)), this.c)));
   }

   @Override
   public enu a(esf $$0, jh $$1, dqu $$2) {
      kl $$3 = this.a($$0, $$2);
      return new enu($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(esf $$0, dhy $$1, dhw $$2, dzj $$3, jh $$4, jh $$5, dqu $$6, enu $$7, bam $$8, ero $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public epl<?> a() {
      return epl.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
