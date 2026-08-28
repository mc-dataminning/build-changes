import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dhe {
   public static final MapCodec<djd> a = b(djd::new);
   public static final duy<duw> b = duq.ae;

   @Override
   public MapCodec<? extends djd> a() {
      return a;
   }

   public djd(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, duw.b));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      duw $$6 = $$0.c(b);
      if ($$1.o() != jj.a.b || $$6 == duw.b != ($$1 == jj.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == duw.b && $$1 == jj.a && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dgx.a.o();
      }
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      je $$1 = $$0.a();
      dds $$2 = $$0.q();
      return $$1.v() < $$2.an() - 1 && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, buf $$3, cvl $$4) {
      je $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.o().b(b, duw.a)), 3);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      if ($$0.c(b) != duw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dua $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == duw.b;
      }
   }

   public static void a(ddt $$0, dua $$1, je $$2, int $$3) {
      je $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, duw.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, duw.a)), $$3);
   }

   public static dua c(ddv $$0, je $$1, dua $$2) {
      return $$2.b(duq.C) ? $$2.b(duq.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eW());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dds $$0, cnp $$1, je $$2, dua $$3, @Nullable dre $$4, cvl $$5) {
      super.a($$0, $$1, $$2, dgx.a.o(), $$4, $$5);
   }

   protected static void b(dds $$0, je $$1, dua $$2, cnp $$3) {
      duw $$4 = $$2.c(b);
      if ($$4 == duw.a) {
         je $$5 = $$1.e();
         dua $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == duw.b) {
            dua $$7 = $$6.y().b(eqc.c) ? dgx.G.o() : dgx.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dgv.j($$6));
         }
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dua $$0, je $$1) {
      return azc.b($$1.u(), $$1.c($$0.c(b) == duw.b ? 0 : 1).v(), $$1.w());
   }
}
