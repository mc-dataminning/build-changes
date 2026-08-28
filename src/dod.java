import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dod extends dme {
   public static final MapCodec<dod> a = b(dod::new);
   public static final eam<eak> b = eae.ah;

   @Override
   public MapCodec<? extends dod> a() {
      return a;
   }

   public dod(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, eak.b));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      eak $$8 = $$0.c(b);
      if ($$4.o() != ja.a.b || $$8 == eak.b != ($$4 == ja.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == eak.b && $$4 == ja.a && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dlw.a.m();
      }
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      iu $$1 = $$0.a();
      dip $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwz $$3, cys $$4) {
      iu $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, eak.a)), 3);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      if ($$0.c(b) != eak.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dzo $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == eak.b;
      }
   }

   public static void a(diq $$0, dzo $$1, iu $$2, int $$3) {
      iu $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, eak.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, eak.a)), $$3);
   }

   public static dzo b(dis $$0, iu $$1, dzo $$2) {
      return $$2.b(eae.I) ? $$2.b(eae.I, Boolean.valueOf($$0.A($$1))) : $$2;
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
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
   public void a(dip $$0, cqs $$1, iu $$2, dzo $$3, @Nullable dwn $$4, cys $$5) {
      super.a($$0, $$1, $$2, dlw.a.m(), $$4, $$5);
   }

   protected static void b(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      eak $$4 = $$2.c(b);
      if ($$4 == eak.a) {
         iu $$5 = $$1.e();
         dzo $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == eak.b) {
            dzo $$7 = $$6.y().b(evw.c) ? dlw.J.m() : dlw.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dlu.j($$6));
         }
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dzo $$0, iu $$1) {
      return azk.b($$1.u(), $$1.c($$0.c(b) == eak.b ? 0 : 1).v(), $$1.w());
   }
}
