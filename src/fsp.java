import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fsp extends fti<cdp> {
   private final Map<cdp.b, Pair<aey, ffx<cdp>>> a;

   public fsp(ftj.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cdp.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new aey(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private ffx<cdp> a(ftj.a $$0, cdp.b $$1, boolean $$2) {
      fic $$3 = $$2 ? fid.d($$1) : fid.c($$1);
      fie $$4 = $$0.a($$3);
      if ($$1 == cdp.b.i) {
         return (ffx<cdp>)($$2 ? new fes($$4) : new fgr($$4));
      } else {
         return (ffx<cdp>)($$2 ? new fer($$4) : new fen($$4));
      }
   }

   private static String a(cdp.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cdp $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.y() - $$2;
      float $$7 = $$0.x() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ary.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.z()));
      }

      float $$8 = $$0.b($$2);
      if (!ary.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.b($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<aey, ffx<cdp>> $$9 = this.a.get($$0.A());
      aey $$10 = (aey)$$9.getFirst();
      ffx<cdp> $$11 = (ffx<cdp>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elv $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         elv $$13 = $$4.getBuffer(foo.j());
         if ($$11 instanceof fhs $$14) {
            $$14.c().a($$3, $$13, $$5, fyx.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aey a(cdp $$0) {
      return (aey)this.a.get($$0.A()).getFirst();
   }
}
