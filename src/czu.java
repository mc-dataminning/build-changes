import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class czu extends dbn implements dca {
   public static final MapCodec<czu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgx.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, czu::new)
   );
   public static final dii b = dhy.at;
   public static final int c = 4;
   private static final ekn[] j = new ekn[]{
      cva.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cva.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cva.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cva.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cva.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dhz k = dhy.C;
   public static final dhz d = dhy.j;

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   public czu(dgx $$0, dhh.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cvc.dR);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ect.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      eju $$4 = $$0.n($$1, $$2);
      ekn $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cvc.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return $$1 == hx.b && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(k) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
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
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dhi $$0) {
      return $$0.c(d);
   }

   private static boolean n(dhi $$0) {
      return $$0.c(b) == 4;
   }

   public static dhi c() {
      return b(0);
   }

   public static dhi b(int $$0) {
      return cvc.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
