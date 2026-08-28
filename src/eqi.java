import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqi extends eqo {
   public static final MapCodec<eqi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eok.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, eqi::new)
   );
   private final js<eok> b;
   private final tw c;

   protected eqi(js<eok> $$0, eqq.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tw b() {
      tw $$0 = new tw();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dwp.a.a.c());
      return $$0;
   }

   @Override
   public kn a(etj $$0, drm $$1) {
      return kn.i;
   }

   @Override
   public List<eti.a> a(etj $$0, jj $$1, drm $$2, azs $$3) {
      return List.of(eti.a.a(new eti.d($$1, dkw.pD.m().b(doz.b, jq.a(jo.a, jo.d)), this.c)));
   }

   @Override
   public eoy a(etj $$0, jj $$1, drm $$2) {
      kn $$3 = this.a($$0, $$2);
      return new eoy($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(etj $$0, dio $$1, dil $$2, eak $$3, jj $$4, jj $$5, drm $$6, eoy $$7, azs $$8, ess $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eqp<?> a() {
      return eqp.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
