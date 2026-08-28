import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dob extends dlu {
   public static final MapCodec<dob> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ead.a.fieldOf("block_set_type").forGetter(dob::b), t()).apply($$0, dob::new)
   );
   public static final eam<ja> b = dpt.e;
   public static final eam<eak> c = eae.ah;
   public static final eam<eaj> d = eae.bh;
   public static final eaf e = eae.y;
   public static final eaf f = eae.A;
   private static final Map<ja, feq> g = fen.c(dlu.c(16.0, 13.0, 16.0));
   private final ead h;

   @Override
   public MapCodec<? extends dob> a() {
      return a;
   }

   protected dob(ead $$0, dzn.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.B.b().b(b, ja.c).b(e, Boolean.valueOf(false)).b(d, eaj.a).b(f, Boolean.valueOf(false)).b(c, eak.b));
   }

   public ead b() {
      return this.h;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      ja $$4 = $$0.c(b);
      ja $$5 = $$0.c(e) ? ($$0.c(d) == eaj.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      eak $$8 = $$0.c(c);
      if ($$4.o() != ja.a.b || $$8 == eak.b != ($$4 == ja.b)) {
         return $$8 == eak.b && $$4 == ja.a && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dob && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dlw.a.m();
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if ($$3.g() && $$0.c(c) == eak.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      if (!$$0.C && ($$3.gk() || !$$3.d($$2))) {
         dod.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      iu $$1 = $$0.a();
      dip $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.D($$1) || $$2.D($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, eak.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwz $$3, cys $$4) {
      $$0.a($$1.d(), $$2.b(c, eak.a), 3);
   }

   private eaj b(dcl $$0) {
      dhv $$1 = $$0.q();
      iu $$2 = $$0.a();
      ja $$3 = $$0.g();
      iu $$4 = $$2.d();
      ja $$5 = $$3.i();
      iu $$6 = $$2.a($$5);
      dzo $$7 = $$1.a_($$6);
      iu $$8 = $$4.a($$5);
      dzo $$9 = $$1.a_($$8);
      ja $$10 = $$3.h();
      iu $$11 = $$2.a($$10);
      dzo $$12 = $$1.a_($$11);
      iu $$13 = $$4.a($$10);
      dzo $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dob && $$7.c(c) == eak.b;
      boolean $$17 = $$12.b() instanceof dob && $$12.c(c) == eak.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fdw $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? eaj.a : eaj.b;
         } else {
            return eaj.a;
         }
      } else {
         return eaj.b;
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!this.h.c()) {
         return bty.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? eeo.h : eeo.d, $$2);
         return bty.a;
      }
   }

   public boolean n(dzo $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bwa $$0, dip $$1, dzo $$2, iu $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? eeo.h : eeo.d, $$3);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.a($$0.c(c) == eak.b ? ja.b : ja.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? eeo.h : eeo.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.e();
      dzo $$4 = $$1.a_($$3);
      return $$0.c(c) == eak.b ? $$4.c($$1, $$3, ja.b) : $$4.a(this);
   }

   private void a(@Nullable bwa $$0, dip $$1, iu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awm.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$1 == dqv.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dzo $$0, iu $$1) {
      return azk.b($$1.u(), $$1.c($$0.c(c) == eak.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(dip $$0, iu $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dzo $$0) {
      if ($$0.b() instanceof dob $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
