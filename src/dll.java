import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dll extends dij {
   public static final MapCodec<dll> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dll::new)
   );
   private static final Map<dij, dij> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final fal c = dij.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dij e;

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dij $$0, dvn.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      dvo $$8 = ($$0.h() instanceof cul $$7 ? d.getOrDefault($$7.d(), dil.a) : dil.a).m();
      if ($$8.l()) {
         return bsh.f;
      } else if (!this.q()) {
         return bsh.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, eak.c, $$3);
         $$4.a(awy.ah);
         $$0.a(1, $$4);
         return bsh.a;
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (this.q()) {
         return bsh.c;
      } else {
         cwf $$5 = new cwf(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dil.fR.m(), 3);
         $$1.a($$3, eak.c, $$2);
         return bsh.a;
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return this.q() ? super.a($$0, $$1, $$2) : new cwf(this.e);
   }

   private boolean q() {
      return this.e == dil.a;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dij b() {
      return this.e;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
