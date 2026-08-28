import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eon extends eot {
   public static final MapCodec<eon> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emp.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, eon::new)
   );
   private final jr<emp> b;
   private final tq c;

   protected eon(jr<emp> $$0, eov.a $$1) {
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
      $$0.a("joint", dvb.a.a.c());
      return $$0;
   }

   @Override
   public km a(ero $$0, dqd $$1) {
      return km.h;
   }

   @Override
   public List<ern.a> a(ero $$0, ji $$1, dqd $$2, azh $$3) {
      return List.of(ern.a.a(new ern.d($$1, djn.pD.m().b(dnp.b, jp.a(jn.a, jn.d)), this.c)));
   }

   @Override
   public end a(ero $$0, ji $$1, dqd $$2) {
      km $$3 = this.a($$0, $$2);
      return new end($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ero $$0, dhf $$1, dhd $$2, dys $$3, ji $$4, ji $$5, dqd $$6, end $$7, azh $$8, eqx $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eou<?> a() {
      return eou.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
