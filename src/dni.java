import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dni extends dke {
   public static final MapCodec<dni> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dni::new)
   );
   private static final Map<dke, dke> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fcm c = dke.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dke e;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dke $$0, dxm.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      dxn $$8 = ($$0.h() instanceof cvq $$7 ? d.getOrDefault($$7.d(), dkg.a) : dkg.a).m();
      if ($$8.l()) {
         return bte.f;
      } else if (!this.q()) {
         return bte.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ecj.c, $$3);
         $$4.a(axp.ah);
         $$0.a(1, $$4);
         return bte.a;
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (this.q()) {
         return bte.c;
      } else {
         cxk $$5 = new cxk(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dkg.gf.m(), 3);
         $$1.a($$3, ecj.c, $$2);
         return bte.a;
      }
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cxk(this.e);
   }

   private boolean q() {
      return this.e == dkg.a;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dke b() {
      return this.e;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
