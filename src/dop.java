import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dop extends dph implements dpy {
   public static final MapCodec<dop> a = b(dop::new);
   public static final ece<ebz> b = ebw.bg;

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   public dop(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jc.c).b(c, Boolean.valueOf(false)).b(b, ebz.a));
   }

   @Override
   protected int h(ebg $$0) {
      return 2;
   }

   @Override
   public ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.a && !this.a($$1, $$5, $$6) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(djd $$0, iw $$1, ebg $$2) {
      dye $$3 = $$0.c_($$1);
      return $$3 instanceof dyq ? ((dyq)$$3).a() : 0;
   }

   private int e(djz $$0, iw $$1, ebg $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dkr)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == ebz.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(djz $$0, iw $$1, ebg $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dkr)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == ebz.a;
      }
   }

   @Override
   protected int b(djz $$0, iw $$1, ebg $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jc $$4 = $$2.c(e);
      iw $$5 = $$1.a($$4);
      ebg $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cnx $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cnx a(djz $$0, jc $$1, iw $$2) {
      List<cnx> $$3 = $$0.a(
         cnx.class,
         new ffn((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$3.gk().e) {
         return but.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == ebz.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awr.fv, aws.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return but.a;
      }
   }

   @Override
   protected void c(djz $$0, iw $$1, ebg $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dye $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dyq ? ((dyq)$$4).a() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            fho $$6 = this.b($$0, $$1, $$2) ? fho.c : fho.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(djz $$0, iw $$1, ebg $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dye $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dyq $$6) {
         $$5 = $$6.a();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == ebz.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(c, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(ebg $$0, djz $$1, iw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dye $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyq($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e, b, c);
   }
}
