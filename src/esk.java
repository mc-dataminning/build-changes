import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esk extends esq {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqm.b.fieldOf("feature").forGetter($$0x -> $$0x.b), f()).apply($$0, esk::new)
   );
   private final jf<eqm> b;
   private final tz c;

   protected esk(jf<eqm> $$0, ess.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tz b() {
      tz $$0 = new tz();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dyq.a.a.c());
      return $$0;
   }

   @Override
   public ka a(evl $$0, dtg $$1) {
      return ka.i;
   }

   @Override
   public List<evk.a> a(evl $$0, iv $$1, dtg $$2, azv $$3) {
      return List.of(evk.a.a(new evk.d($$1, dmo.pH.m().b(dqt.b, jd.a(jb.a, jb.d)), this.c)));
   }

   @Override
   public era a(evl $$0, iv $$1, dtg $$2) {
      ka $$3 = this.a($$0, $$2);
      return new era($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(evl $$0, dkg $$1, dkd $$2, ecm $$3, iv $$4, iv $$5, dtg $$6, era $$7, azv $$8, euu $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public esr<?> a() {
      return esr.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
