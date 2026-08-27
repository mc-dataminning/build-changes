import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddd extends daa {
   public static final MapCodec<ddd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, ddd::new)
   );
   private static final Map<daa, daa> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eqk c = daa.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final daa e;

   @Override
   public MapCodec<ddd> a() {
      return a;
   }

   public ddd(daa $$0, dmy.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      dmz $$8 = ($$0.d() instanceof cof $$7 ? d.getOrDefault($$7.d(), dac.a) : dac.a).o();
      if ($$8.i()) {
         return bne.d;
      } else if (!this.i()) {
         return bne.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, drn.c, $$3);
         $$4.a(aui.ah);
         $$0.a(1, $$4);
         return bne.a($$2.B);
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if (this.i()) {
         return bnc.b;
      } else {
         cqk $$5 = new cqk(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dac.fR.o(), 3);
         $$1.a($$3, drn.c, $$2);
         return bnc.a($$1.B);
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return this.i() ? super.a($$0, $$1, $$2) : new cqk(this.e);
   }

   private boolean i() {
      return this.e == dac.a;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public daa b() {
      return this.e;
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
