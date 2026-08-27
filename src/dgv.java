import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dgv extends dfc {
   public static final MapCodec<dgv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(u()).apply($$0, dgv::new));

   public dgv(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<dgv> a() {
      return a;
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$3.a(500) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.CM, avq.e, 0.5F, $$3.i() * 0.2F + 0.3F, false);
      }

      if ($$3.a(2) == 0) {
         double $$4 = (double)$$2.u() + $$3.j();
         double $$5 = (double)$$2.v() + 0.5 + $$3.j();
         double $$6 = (double)$$2.w() + $$3.j();
         double $$7 = ((double)$$3.i() - 0.5) * 0.5;
         double $$8 = -((double)$$3.i() - 0.5) * 1.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         $$1.a(lb.s, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      super.b($$0, $$1, $$2, $$3);
      List<brv> $$4 = $$1.a_((brv)null, ewp.a($$2, $$2.a(iw.b)));
      int $$5 = 0;
      if (!$$4.isEmpty()) {
         for (brv $$6 : $$4) {
            if ($$6 instanceof bso) {
               $$5++;
            }
         }
      }

      if ($$5 <= 0) {
         if ($$3.a(20) == 0) {
            int $$7 = $$3.a(1000);
            if ($$7 < 500) {
               brv $$8 = bsb.J.b($$1, $$0x -> {
               }, $$2, bss.a, true, false);
               $$1.b($$8);
            } else if ($$7 < 900) {
               brv $$9 = bsb.bz.b($$1, $$0x -> {
               }, $$2, bss.a, true, false);
               $$1.b($$9);
            } else if ($$7 < 980) {
               brv $$10 = bsb.ai.b($$1, $$0x -> $$0x.a(new cuh(cuk.vT)), $$2, bss.a, true, false);
               $$1.b($$10);
            } else if ($$7 == 999) {
               brv $$11 = bsb.V.b($$1, $$0x -> {
               }, $$2.a(iw.b, 2), bss.a, true, false);
               $$1.b($$11);
            } else {
               brv $$12 = bsb.i.b($$1, $$0x -> {
               }, $$2, bss.a, true, false);
               $$1.b($$12);
            }
         }
      }
   }
}
