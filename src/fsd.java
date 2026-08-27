import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fsd extends fsw<cdf> {
   private final Map<cdf.b, Pair<aer, ffl<cdf>>> a;

   public fsd(fsx.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cdf.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new aer(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private ffl<cdf> a(fsx.a $$0, cdf.b $$1, boolean $$2) {
      fhq $$3 = $$2 ? fhr.d($$1) : fhr.c($$1);
      fhs $$4 = $$0.a($$3);
      if ($$1 == cdf.b.i) {
         return (ffl<cdf>)($$2 ? new feg($$4) : new fgf($$4));
      } else {
         return (ffl<cdf>)($$2 ? new fef($$4) : new feb($$4));
      }
   }

   private static String a(cdf.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cdf $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.s() - $$2;
      float $$7 = $$0.r() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(arp.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.t()));
      }

      float $$8 = $$0.b($$2);
      if (!arp.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.b($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<aer, ffl<cdf>> $$9 = this.a.get($$0.v());
      aer $$10 = (aer)$$9.getFirst();
      ffl<cdf> $$11 = (ffl<cdf>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elj $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         elj $$13 = $$4.getBuffer(foc.j());
         if ($$11 instanceof fhg $$14) {
            $$14.c().a($$3, $$13, $$5, fyl.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(cdf $$0) {
      return (aer)this.a.get($$0.v()).getFirst();
   }
}
