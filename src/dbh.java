import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class dbh extends czk {
   public static final dfs a = cwd.aC;
   public static final ehy b = csk.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ehy c = csk.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ehy d = ehv.a(b, csk.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ehy h = ehv.a(c, csk.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<hb, ehy> i = Maps.newEnumMap(ImmutableMap.of(hb.c, d, hb.d, d, hb.f, h, hb.e, h));

   public dbh(dex.d $$0, dgl $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, hb.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.c_($$2) instanceof dds $$6) {
         ciw $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bgo.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dey $$0, cbl $$1, ehb $$2, dds $$3, ciw $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cii && !this.a($$2, $$0);
   }

   private boolean a(ehb $$0, dey $$1) {
      return $$0.b().o() == $$1.c(a).o();
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return i.get($$0.c(a));
   }

   @Override
   public ehy b_(dey $$0, coq $$1, gv $$2) {
      return this.a($$0, $$1, $$2, ehk.a());
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((hb)$$0.c(a)) {
         case f:
         case e:
            return c;
         default:
            return b;
      }
   }

   public boolean b(dey $$0, cpn $$1, gv $$2) {
      hb $$3 = $$0.c(a).h();
      hb $$4 = $$0.c(a).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cpn $$0, dey $$1, gv $$2, hb $$3) {
      dey $$4 = $$0.a_($$2);
      return $$4.a(apj.ay) ? $$4.c(a).o().a($$1.c(a)) : $$4.a($$0, $$2, $$3, dam.a);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = this.n();
      eab $$2 = $$0.q().b_($$0.a());
      cpn $$3 = $$0.q();
      gv $$4 = $$0.a();

      for (hb $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            hb $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == eac.c));
            }
         }
      }

      return null;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1.o() == $$0.c(a).h().o() && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dey $$0) {
      return $$0.c(a).p();
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, e);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddg($$0, $$1);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.i, dds::a);
   }
}
