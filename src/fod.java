import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fod extends fox<cah> {
   private final Map<cah.b, Pair<acq, fbx<cah>>> a;

   public fod(foy.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cah.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new acq(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fbx<cah> a(foy.a $$0, cah.b $$1, boolean $$2) {
      fec $$3 = $$2 ? fed.d($$1) : fed.c($$1);
      fee $$4 = $$0.a($$3);
      if ($$1 == cah.b.i) {
         return (fbx<cah>)($$2 ? new fas($$4) : new fcr($$4));
      } else {
         return (fbx<cah>)($$2 ? new far($$4) : new fan($$4));
      }
   }

   private static String a(cah.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cah $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.s() - $$2;
      float $$7 = $$0.r() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(apa.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.t()));
      }

      float $$8 = $$0.s($$2);
      if (!apa.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.s($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<acq, fbx<cah>> $$9 = this.a.get($$0.v());
      acq $$10 = (acq)$$9.getFirst();
      fbx<cah> $$11 = (fbx<cah>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ein $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, fum.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.aZ()) {
         ein $$13 = $$4.getBuffer(fkf.j());
         if ($$11 instanceof fds $$14) {
            $$14.c().a($$3, $$13, $$5, fum.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public acq a(cah $$0) {
      return (acq)this.a.get($$0.v()).getFirst();
   }
}
