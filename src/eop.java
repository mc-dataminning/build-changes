import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eop extends eov {
   public static final MapCodec<eop> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emr.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, eop::new)
   );
   private final jr<emr> b;
   private final tq c;

   protected eop(jr<emr> $$0, eox.a $$1) {
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
      $$0.a("joint", dvd.a.a.c());
      return $$0;
   }

   @Override
   public km a(erq $$0, dqf $$1) {
      return km.h;
   }

   @Override
   public List<erp.a> a(erq $$0, ji $$1, dqf $$2, azh $$3) {
      return List.of(erp.a.a(new erp.d($$1, djp.pD.m().b(dnr.b, jp.a(jn.a, jn.d)), this.c)));
   }

   @Override
   public enf a(erq $$0, ji $$1, dqf $$2) {
      km $$3 = this.a($$0, $$2);
      return new enf($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(erq $$0, dhh $$1, dhf $$2, dyu $$3, ji $$4, ji $$5, dqf $$6, enf $$7, azh $$8, eqz $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eow<?> a() {
      return eow.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
