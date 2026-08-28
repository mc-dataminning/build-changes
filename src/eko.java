import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eko extends eku {
   public static final MapCodec<eko> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eiq.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eko::new)
   );
   private final jm<eiq> b;
   private final ua c;

   protected eko(jm<eiq> $$0, ekw.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ua b() {
      ua $$0 = new ua();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", drg.a.a.c());
      return $$0;
   }

   @Override
   public kh a(eno $$0, dmk $$1) {
      return kh.g;
   }

   @Override
   public List<enn.c> a(eno $$0, jd $$1, dmk $$2, ayv $$3) {
      List<enn.c> $$4 = Lists.newArrayList();
      $$4.add(new enn.c($$1, dfy.pb.o().a(djy.b, jk.a(ji.a, ji.d)), this.c));
      return $$4;
   }

   @Override
   public eje a(eno $$0, jd $$1, dmk $$2) {
      kh $$3 = this.a($$0, $$2);
      return new eje($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eno $$0, ddq $$1, ddo $$2, dux $$3, jd $$4, jd $$5, dmk $$6, eje $$7, ayv $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ekv<?> a() {
      return ekv.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
