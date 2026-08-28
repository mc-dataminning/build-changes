import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnd extends dle {
   public static final MapCodec<dnd> a = b(dnd::new);
   public static final dzk<dzi> b = dzc.ah;

   @Override
   public MapCodec<? extends dnd> a() {
      return a;
   }

   public dnd(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dzi.b));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      dzi $$8 = $$0.c(b);
      if ($$4.o() != jo.a.b || $$8 == dzi.b != ($$4 == jo.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == dzi.b && $$4 == jo.a && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dkw.a.m();
      }
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      jj $$1 = $$0.a();
      dhp $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
      jj $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, dzi.a)), 3);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      if ($$0.c(b) != dzi.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dym $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dzi.b;
      }
   }

   public static void a(dhq $$0, dym $$1, jj $$2, int $$3) {
      jj $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, dzi.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, dzi.a)), $$3);
   }

   public static dym b(dhs $$0, jj $$1, dym $$2) {
      return $$2.b(dzc.I) ? $$2.b(dzc.I, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      if (!$$0.C) {
         if ($$3.gk()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fa());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhp $$0, cqi $$1, jj $$2, dym $$3, @Nullable dvl $$4, cxy $$5) {
      super.a($$0, $$1, $$2, dkw.a.m(), $$4, $$5);
   }

   protected static void b(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      dzi $$4 = $$2.c(b);
      if ($$4 == dzi.a) {
         jj $$5 = $$1.e();
         dym $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dzi.b) {
            dym $$7 = $$6.y().b(euu.c) ? dkw.J.m() : dkw.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dku.j($$6));
         }
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dym $$0, jj $$1) {
      return azk.b($$1.u(), $$1.c($$0.c(b) == dzi.b ? 0 : 1).v(), $$1.w());
   }
}
