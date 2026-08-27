import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ddr extends dej implements dez {
   public static final MapCodec<ddr> a = b(ddr::new);
   public static final dqg<dqb> b = dpy.bd;

   @Override
   public MapCodec<ddr> a() {
      return a;
   }

   public ddr(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ij.c).a(d, Boolean.valueOf(false)).a(b, dqb.a));
   }

   @Override
   protected int g(dpi $$0) {
      return 2;
   }

   @Override
   public dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.a && !this.b($$3, $$5, $$2) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cym $$0, id $$1, dpi $$2) {
      dmo $$3 = $$0.c_($$1);
      return $$3 instanceof dmz ? ((dmz)$$3).b() : 0;
   }

   private int e(czg $$0, id $$1, dpi $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((czw)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dqb.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(czg $$0, id $$1, dpi $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((czw)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dqb.a;
      }
   }

   @Override
   protected int b(czg $$0, id $$1, dpi $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ij $$4 = $$2.c(aE);
      id $$5 = $$1.a($$4);
      dpi $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cgd $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cgd a(czg $$0, ij $$1, id $$2) {
      List<cgd> $$3 = $$0.a(
         cgd.class,
         new ese((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if (!$$3.ga().e) {
         return bof.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dqb.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, auo.fm, aup.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bof.a($$1.B);
      }
   }

   @Override
   protected void c(czg $$0, id $$1, dpi $$2) {
      if (!$$0.O().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dmo $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dmz ? ((dmz)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eue $$6 = this.b($$0, $$1, $$2) ? eue.c : eue.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(czg $$0, id $$1, dpi $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dmo $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dmz $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dqb.a) {
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
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dpi $$0, czg $$1, id $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dmo $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmz($$0, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(aE, b, d);
   }
}
