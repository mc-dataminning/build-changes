import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cxv extends czo implements dab {
   public static final MapCodec<cxv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(des.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, cxv::new)
   );
   public static final dgd b = dft.at;
   public static final int c = 4;
   private static final eia[] j = new eia[]{
      ctc.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      ctc.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      ctc.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      ctc.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      ctc.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dfu k = dft.C;
   public static final dfu d = dft.j;

   @Override
   public MapCodec<cxv> a() {
      return a;
   }

   public cxv(des $$0, dfc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cte.dR);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eah.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      ehh $$4 = $$0.n($$1, $$2);
      eia $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cte.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return $$1 == ha.b && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(k) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!h($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!n($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dfd $$0) {
      return $$0.c(d);
   }

   private static boolean n(dfd $$0) {
      return $$0.c(b) == 4;
   }

   public static dfd c() {
      return b(0);
   }

   public static dfd b(int $$0) {
      return cte.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
