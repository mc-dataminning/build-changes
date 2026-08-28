import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dil extends dfi {
   public static final MapCodec<dil> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dil::new)
   );
   private static final Map<dfi, dfi> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final exa c = dfi.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dfi e;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   public dil(dfi $$0, dsk.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      dsl $$8 = ($$0.g() instanceof csc $$7 ? d.getOrDefault($$7.d(), dfk.a) : dfk.a).o();
      if ($$8.i()) {
         return bqj.d;
      } else if (!this.m()) {
         return bqj.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dxh.c, $$3);
         $$4.a(avr.ah);
         $$0.a(1, $$4);
         return bqj.a($$2.B);
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if (this.m()) {
         return bqh.c;
      } else {
         cud $$5 = new cud(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfk.fR.o(), 3);
         $$1.a($$3, dxh.c, $$2);
         return bqh.a($$1.B);
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cud(this.e);
   }

   private boolean m() {
      return this.e == dfk.a;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dfi b() {
      return this.e;
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
