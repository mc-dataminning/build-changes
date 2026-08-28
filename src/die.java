import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class die extends dfb {
   public static final MapCodec<die> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, die::new)
   );
   private static final Map<dfb, dfb> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ewm c = dfb.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dfb e;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dfb $$0, dsd.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      dse $$8 = ($$0.g() instanceof csp $$7 ? d.getOrDefault($$7.d(), dfd.a) : dfd.a).o();
      if ($$8.i()) {
         return bqy.d;
      } else if (!this.m()) {
         return bqy.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dwx.c, $$3);
         $$4.a(awk.ah);
         $$0.a(1, $$4);
         return bqy.a($$2.B);
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if (this.m()) {
         return bqw.c;
      } else {
         cur $$5 = new cur(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfd.fR.o(), 3);
         $$1.a($$3, dwx.c, $$2);
         return bqw.a($$1.B);
      }
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cur(this.e);
   }

   private boolean m() {
      return this.e == dfd.a;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dfb b() {
      return this.e;
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
