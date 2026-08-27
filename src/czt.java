import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class czt extends cwq {
   public static final MapCodec<czt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, czt::new)
   );
   private static final Map<cwq, cwq> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final emm c = cwq.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cwq e;

   @Override
   public MapCodec<czt> a() {
      return a;
   }

   public czt(cwq $$0, djg.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      cmt $$7 = $$6.d();
      djh $$8 = ($$7 instanceof ckr ? d.getOrDefault(((ckr)$$7).e(), cws.a) : cws.a).o();
      boolean $$9 = $$8.a(cws.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(asc.ah);
            if (!$$3.fT().d) {
               $$6.h(1);
            }
         } else {
            cmy $$11 = new cmy(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cws.fR.o(), 3);
         }

         $$1.a($$3, dnr.c, $$2);
         return bkb.a($$1.B);
      } else {
         return bkb.b;
      }
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cmy(this.e);
   }

   private boolean g() {
      return this.e == cws.a;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cwq b() {
      return this.e;
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
