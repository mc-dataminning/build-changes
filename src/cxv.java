import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cxv extends cut {
   public static final MapCodec<cxv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, cxv::new)
   );
   private static final Map<cut, cut> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ekb c = cut.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cut e;

   @Override
   public MapCodec<cxv> a() {
      return a;
   }

   public cxv(cut $$0, dgv.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      ckw $$7 = $$6.d();
      dgw $$8 = ($$7 instanceof ciu ? d.getOrDefault(((ciu)$$7).e(), cuv.a) : cuv.a).o();
      boolean $$9 = $$8.a(cuv.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(aqx.ah);
            if (!$$3.fT().d) {
               $$6.h(1);
            }
         } else {
            clb $$11 = new clb(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cuv.fR.o(), 3);
         }

         $$1.a($$3, dlg.c, $$2);
         return biq.a($$1.B);
      } else {
         return biq.b;
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new clb(this.e);
   }

   private boolean g() {
      return this.e == cuv.a;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cut b() {
      return this.e;
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
