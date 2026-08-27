import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class czm extends cwj {
   public static final MapCodec<czm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, czm::new)
   );
   private static final Map<cwj, cwj> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final emf c = cwj.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cwj e;

   @Override
   public MapCodec<czm> a() {
      return a;
   }

   public czm(cwj $$0, diz.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      cmm $$7 = $$6.d();
      dja $$8 = ($$7 instanceof ckk ? d.getOrDefault(((ckk)$$7).e(), cwl.a) : cwl.a).o();
      boolean $$9 = $$8.a(cwl.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(arw.ah);
            if (!$$3.fT().d) {
               $$6.h(1);
            }
         } else {
            cmr $$11 = new cmr(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cwl.fR.o(), 3);
         }

         $$1.a($$3, dnk.c, $$2);
         return bjv.a($$1.B);
      } else {
         return bjv.b;
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cmr(this.e);
   }

   private boolean g() {
      return this.e == cwl.a;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cwj b() {
      return this.e;
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
