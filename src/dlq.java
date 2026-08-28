import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlq extends dlg {
   public static final MapCodec<dlq> a = b(dlq::new);
   public static final eam<ja> b = dpt.e;
   public static final eam<eac> c = eae.Y;
   public static final eaf d = eae.A;
   private static final feq f = fen.a(dlu.b(6.0, 6.0, 13.0), dlu.b(8.0, 4.0, 6.0));
   private static final feq g = fen.a(f, dlu.b(2.0, 13.0, 16.0));
   private static final Map<ja.a, feq> h = fen.a(dlu.a(16.0, 16.0, 8.0));
   private static final Map<ja.a, feq> i = fen.a(fen.a(f, dlu.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<ja, feq> C = fen.c(fen.a(f, dlu.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, eac.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      cqs $$6 = $$3.q() instanceof cqs $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      return (bty)(this.a($$1, $$0, $$4, $$3, true) ? bty.a : bty.e);
   }

   public boolean a(dip $$0, dzo $$1, fds $$2, @Nullable cqs $$3, boolean $$4) {
      ja $$5 = $$2.c();
      iu $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awv.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dzo $$0, ja $$1, double $$2) {
      if ($$1.o() != ja.a.b && !($$2 > 0.8124F)) {
         ja $$3 = $$0.c(b);
         eac $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dip $$0, iu $$1, @Nullable ja $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bwa $$0, dip $$1, iu $$2, @Nullable ja $$3) {
      dwn $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dwl) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dwl)$$4).a($$3);
         $$1.a(null, $$2, awl.bZ, awm.e, 2.0F, 1.0F);
         $$1.a($$0, eeo.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private feq o(dzo $$0) {
      ja $$1 = $$0.c(b);

      return switch ((eac)$$0.c(c)) {
         case a -> (feq)h.get($$1.o());
         case c -> (feq)C.get($$1);
         case d -> (feq)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.o($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      ja $$1 = $$0.k();
      iu $$2 = $$0.a();
      dip $$3 = $$0.q();
      ja.a $$4 = $$1.o();
      if ($$4 == ja.a.b) {
         dzo $$5 = this.m().b(c, $$1 == ja.a ? eac.b : eac.a).b(b, $$0.g());
         if ($$5.a((dis)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ja.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), ja.f) && $$3.a_($$2.i()).c($$3, $$2.i(), ja.e)
            || $$4 == ja.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), ja.d) && $$3.a_($$2.g()).c($$3, $$2.g(), ja.c);
         dzo $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? eac.d : eac.c);
         if ($$7.a((dis)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), ja.b);
         $$7 = $$7.b(c, $$8 ? eac.a : eac.b);
         if ($$7.a((dis)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      eac $$8 = $$0.c(c);
      ja $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != eac.d) {
         return dlw.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == eac.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, eac.c).b(b, $$4.g());
            }

            if ($$8 == eac.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, eac.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      ja $$3 = q($$0).g();
      return $$3 == ja.b ? dlu.a($$1, $$2.d(), ja.a) : dop.b($$1, $$2, $$3);
   }

   private static ja q(dzo $$0) {
      switch ((eac)$$0.c(c)) {
         case a:
            return ja.b;
         case b:
            return ja.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.F, $$0.C ? dwl::a : dwl::b);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   public dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
