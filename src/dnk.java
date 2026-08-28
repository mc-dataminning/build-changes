import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnk extends dod implements dot {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final eax<eas> b = eap.bg;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, ja.c).b(c, Boolean.valueOf(false)).b(b, eas.a));
   }

   @Override
   protected int h(dzz $$0) {
      return 2;
   }

   @Override
   public dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.a && !this.a($$1, $$5, $$6) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dib $$0, iu $$1, dzz $$2) {
      dwx $$3 = $$0.c_($$1);
      return $$3 instanceof dxj ? ((dxj)$$3).a() : 0;
   }

   private int e(div $$0, iu $$1, dzz $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((djn)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == eas.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(div $$0, iu $$1, dzz $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((djn)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == eas.a;
      }
   }

   @Override
   protected int b(div $$0, iu $$1, dzz $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ja $$4 = $$2.c(e);
      iu $$5 = $$1.a($$4);
      dzz $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cmw $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cmw a(div $$0, ja $$1, iu $$2) {
      List<cmw> $$3 = $$0.a(
         cmw.class,
         new fed((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$3.gj().e) {
         return bub.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == eas.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awn.ft, awo.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bub.a;
      }
   }

   @Override
   protected void c(div $$0, iu $$1, dzz $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dwx $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dxj ? ((dxj)$$4).a() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            fge $$6 = this.b($$0, $$1, $$2) ? fge.c : fge.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(div $$0, iu $$1, dzz $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dwx $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dxj $$6) {
         $$5 = $$6.a();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == eas.a) {
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
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dzz $$0, div $$1, iu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dwx $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxj($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e, b, c);
   }
}
