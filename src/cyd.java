import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cyd extends cva {
   public static final MapCodec<cyd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, cyd::new)
   );
   private static final Map<cva, cva> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ekn c = cva.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cva e;

   @Override
   public MapCodec<cyd> a() {
      return a;
   }

   public cyd(cva $$0, dhh.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      cle $$7 = $$6.d();
      dhi $$8 = ($$7 instanceof cjc ? d.getOrDefault(((cjc)$$7).e(), cvc.a) : cvc.a).o();
      boolean $$9 = $$8.a(cvc.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(arb.ah);
            if (!$$3.fU().d) {
               $$6.h(1);
            }
         } else {
            clj $$11 = new clj(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cvc.fR.o(), 3);
         }

         $$1.a($$3, dls.c, $$2);
         return bix.a($$1.B);
      } else {
         return bix.b;
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new clj(this.e);
   }

   private boolean g() {
      return this.e == cvc.a;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cva b() {
      return this.e;
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
