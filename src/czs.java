import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class czs extends cwp {
   public static final MapCodec<czs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, czs::new)
   );
   private static final Map<cwp, cwp> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eml c = cwp.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cwp e;

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(cwp $$0, djf.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      cms $$7 = $$6.d();
      djg $$8 = ($$7 instanceof ckq ? d.getOrDefault(((ckq)$$7).e(), cwr.a) : cwr.a).o();
      boolean $$9 = $$8.a(cwr.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(asb.ah);
            if (!$$3.fT().d) {
               $$6.h(1);
            }
         } else {
            cmx $$11 = new cmx(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cwr.fR.o(), 3);
         }

         $$1.a($$3, dnq.c, $$2);
         return bka.a($$1.B);
      } else {
         return bka.b;
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cmx(this.e);
   }

   private boolean g() {
      return this.e == cwr.a;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cwp b() {
      return this.e;
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
