import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class don extends dpf implements dpw {
   public static final MapCodec<don> a = b(don::new);
   public static final ecc<ebx> b = ebu.bg;

   @Override
   public MapCodec<don> a() {
      return a;
   }

   public don(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(c, Boolean.valueOf(false)).b(b, ebx.a));
   }

   @Override
   protected int h(ebe $$0) {
      return 2;
   }

   @Override
   public ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.a && !this.a($$1, $$5, $$6) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(djb $$0, iv $$1, ebe $$2) {
      dyc $$3 = $$0.c_($$1);
      return $$3 instanceof dyo ? ((dyo)$$3).a() : 0;
   }

   private int e(djx $$0, iv $$1, ebe $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dkp)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == ebx.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(djx $$0, iv $$1, ebe $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dkp)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == ebx.a;
      }
   }

   @Override
   protected int b(djx $$0, iv $$1, ebe $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jb $$4 = $$2.c(e);
      iv $$5 = $$1.a($$4);
      ebe $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cnv $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cnv a(djx $$0, jb $$1, iv $$2) {
      List<cnv> $$3 = $$0.a(
         cnv.class,
         new ffl((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$3.gk().e) {
         return bur.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == ebx.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awp.fv, awq.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bur.a;
      }
   }

   @Override
   protected void c(djx $$0, iv $$1, ebe $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dyc $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dyo ? ((dyo)$$4).a() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            fhm $$6 = this.b($$0, $$1, $$2) ? fhm.c : fhm.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(djx $$0, iv $$1, ebe $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dyc $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dyo $$6) {
         $$5 = $$6.a();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == ebx.a) {
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
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(ebe $$0, djx $$1, iv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dyc $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyo($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e, b, c);
   }
}
