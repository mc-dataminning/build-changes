import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fru extends fsn<cdg> {
   private final Map<cdg.b, Pair<aer, ffg<cdg>>> a;

   public fru(fso.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cdg.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new aer(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private ffg<cdg> a(fso.a $$0, cdg.b $$1, boolean $$2) {
      fhl $$3 = $$2 ? fhm.d($$1) : fhm.c($$1);
      fhn $$4 = $$0.a($$3);
      if ($$1 == cdg.b.i) {
         return (ffg<cdg>)($$2 ? new feb($$4) : new fga($$4));
      } else {
         return (ffg<cdg>)($$2 ? new fea($$4) : new fdw($$4));
      }
   }

   private static String a(cdg.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cdg $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
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

      Pair<aer, ffg<cdg>> $$9 = this.a.get($$0.v());
      aer $$10 = (aer)$$9.getFirst();
      ffg<cdg> $$11 = (ffg<cdg>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elk $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fyc.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         elk $$13 = $$4.getBuffer(fnt.j());
         if ($$11 instanceof fhb $$14) {
            $$14.c().a($$3, $$13, $$5, fyc.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(cdg $$0) {
      return (aer)this.a.get($$0.v()).getFirst();
   }
}
