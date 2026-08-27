import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fsn extends ftg<cdn> {
   private final Map<cdn.b, Pair<aew, ffv<cdn>>> a;

   public fsn(fth.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cdn.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new aew(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private ffv<cdn> a(fth.a $$0, cdn.b $$1, boolean $$2) {
      fia $$3 = $$2 ? fib.d($$1) : fib.c($$1);
      fic $$4 = $$0.a($$3);
      if ($$1 == cdn.b.i) {
         return (ffv<cdn>)($$2 ? new feq($$4) : new fgp($$4));
      } else {
         return (ffv<cdn>)($$2 ? new fep($$4) : new fel($$4));
      }
   }

   private static String a(cdn.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cdn $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.y() - $$2;
      float $$7 = $$0.x() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(arw.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.z()));
      }

      float $$8 = $$0.b($$2);
      if (!arw.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.b($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<aew, ffv<cdn>> $$9 = this.a.get($$0.A());
      aew $$10 = (aew)$$9.getFirst();
      ffv<cdn> $$11 = (ffv<cdn>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elt $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         elt $$13 = $$4.getBuffer(fom.j());
         if ($$11 instanceof fhq $$14) {
            $$14.c().a($$3, $$13, $$5, fyv.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aew a(cdn $$0) {
      return (aew)this.a.get($$0.A()).getFirst();
   }
}
