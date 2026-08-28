import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esd extends esj {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqf.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, esd::new)
   );
   private final je<eqf> b;
   private final tz c;

   protected esd(je<eqf> $$0, esl.a $$1) {
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
      $$0.a("joint", dyj.a.a.c());
      return $$0;
   }

   @Override
   public jz a(eve $$0, dsz $$1) {
      return jz.i;
   }

   @Override
   public List<evd.a> a(eve $$0, iu $$1, dsz $$2, azv $$3) {
      return List.of(evd.a.a(new evd.d($$1, dmh.pH.m().b(dqm.b, jc.a(ja.a, ja.d)), this.c)));
   }

   @Override
   public eqt a(eve $$0, iu $$1, dsz $$2) {
      jz $$3 = this.a($$0, $$2);
      return new eqt($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eve $$0, djz $$1, djw $$2, ecf $$3, iu $$4, iu $$5, dsz $$6, eqt $$7, azv $$8, eun $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public esk<?> a() {
      return esk.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
