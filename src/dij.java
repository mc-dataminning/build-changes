import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dij extends dfc {
   public static final MapCodec<dij> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lh.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dij::new)
   );
   private static final Map<dfc, dfc> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final exn c = dfc.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dfc e;

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(dfc $$0, dtb.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      dtc $$8 = ($$0.f() instanceof csc $$7 ? d.getOrDefault($$7.d(), dfe.a) : dfe.a).n();
      if ($$8.i()) {
         return bqc.d;
      } else if (!this.k()) {
         return bqc.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dxv.c, $$3);
         $$4.a(avz.ai);
         $$0.a(1, $$4);
         return bqc.a($$2.C);
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if (this.k()) {
         return bqa.b;
      } else {
         cuh $$5 = new cuh(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfe.gK.n(), 3);
         $$1.a($$3, dxv.c, $$2);
         return bqa.a($$1.C);
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return this.k() ? super.a($$0, $$1, $$2) : new cuh(this.e);
   }

   private boolean k() {
      return this.e == dfe.a;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.a && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dfc b() {
      return this.e;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
