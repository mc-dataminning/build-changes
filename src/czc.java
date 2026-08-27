import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class czc extends cvz {
   public static final MapCodec<czc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, czc::new)
   );
   private static final Map<cvz, cvz> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final elu c = cvz.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cvz e;

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   public czc(cvz $$0, dio.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      cmc $$7 = $$6.d();
      dip $$8 = ($$7 instanceof cka ? d.getOrDefault(((cka)$$7).e(), cwb.a) : cwb.a).o();
      boolean $$9 = $$8.a(cwb.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(arm.ah);
            if (!$$3.fT().d) {
               $$6.h(1);
            }
         } else {
            cmh $$11 = new cmh(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cwb.fR.o(), 3);
         }

         $$1.a($$3, dmz.c, $$2);
         return bjl.a($$1.B);
      } else {
         return bjl.b;
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cmh(this.e);
   }

   private boolean g() {
      return this.e == cwb.a;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.a && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cvz b() {
      return this.e;
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
