import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class ftj extends fuc<ceq> {
   private final Map<ceq.b, Pair<afw, fgp<ceq>>> a;

   public ftj(fud.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(ceq.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new afw(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fgp<ceq> a(fud.a $$0, ceq.b $$1, boolean $$2) {
      fiu $$3 = $$2 ? fiv.d($$1) : fiv.c($$1);
      fiw $$4 = $$0.a($$3);
      if ($$1 == ceq.b.i) {
         return (fgp<ceq>)($$2 ? new ffk($$4) : new fhj($$4));
      } else {
         return (fgp<ceq>)($$2 ? new ffj($$4) : new fff($$4));
      }
   }

   private static String a(ceq.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(ceq $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.N() - $$2;
      float $$7 = $$0.M() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(asy.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.O()));
      }

      float $$8 = $$0.a($$2);
      if (!asy.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<afw, fgp<ceq>> $$9 = this.a.get($$0.x());
      afw $$10 = (afw)$$9.getFirst();
      fgp<ceq> $$11 = (fgp<ceq>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eml $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         eml $$13 = $$4.getBuffer(fpj.j());
         if ($$11 instanceof fik $$14) {
            $$14.c().a($$3, $$13, $$5, fzr.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public afw a(ceq $$0) {
      return (afw)this.a.get($$0.x()).getFirst();
   }
}
