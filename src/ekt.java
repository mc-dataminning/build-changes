import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekt extends ekz {
   public static final MapCodec<ekt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eiv.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, ekt::new)
   );
   private final jm<eiv> b;
   private final ub c;

   protected ekt(jm<eiv> $$0, elb.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ub b() {
      ub $$0 = new ub();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dri.a.a.c());
      return $$0;
   }

   @Override
   public kh a(enu $$0, dmm $$1) {
      return kh.g;
   }

   @Override
   public List<ent.c> a(enu $$0, jd $$1, dmm $$2, ayw $$3) {
      List<ent.c> $$4 = Lists.newArrayList();
      $$4.add(new ent.c($$1, dga.pb.o().a(dka.b, jk.a(ji.a, ji.d)), this.c));
      return $$4;
   }

   @Override
   public ejj a(enu $$0, jd $$1, dmm $$2) {
      kh $$3 = this.a($$0, $$2);
      return new ejj($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(enu $$0, dds $$1, ddq $$2, duz $$3, jd $$4, jd $$5, dmm $$6, ejj $$7, ayw $$8, end $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ela<?> a() {
      return ela.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
