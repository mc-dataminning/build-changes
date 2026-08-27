import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cxj extends cyb implements cyr {
   public static final MapCodec<cxj> a = b(cxj::new);
   public static final djn<dji> b = djf.bd;

   @Override
   public MapCodec<cxj> a() {
      return a;
   }

   public cxj(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ia.c).a(d, Boolean.valueOf(false)).a(b, dji.a));
   }

   @Override
   protected int g(dip $$0) {
      return 2;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.a && !this.b($$3, $$5, $$2) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cse $$0, hv $$1, dip $$2) {
      dgd $$3 = $$0.c_($$1);
      return $$3 instanceof dgo ? ((dgo)$$3).c() : 0;
   }

   private int e(csy $$0, hv $$1, dip $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cto)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dji.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(csy $$0, hv $$1, dip $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cto)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dji.a;
      }
   }

   @Override
   protected int b(csy $$0, hv $$1, dip $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ia $$4 = $$2.c(aE);
      hv $$5 = $$1.a($$4);
      dip $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cax $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cax a(csy $$0, ia $$1, hv $$2) {
      List<cax> $$3 = $$0.a(
         cax.class,
         new ekw((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if (!$$3.fT().e) {
         return bjl.d;
      } else {
         $$0 = $$0.a(b);
         float $$6 = $$0.c(b) == dji.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, arc.eO, ard.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bjl.a($$1.B);
      }
   }

   @Override
   protected void c(csy $$0, hv $$1, dip $$2) {
      if (!$$0.M().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dgd $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dgo ? ((dgo)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            emr $$6 = this.b($$0, $$1, $$2) ? emr.c : emr.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(csy $$0, hv $$1, dip $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dgd $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dgo $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dji.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dip $$0, csy $$1, hv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgd $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgo($$0, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE, b, d);
   }
}
