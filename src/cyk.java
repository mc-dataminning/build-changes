import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cyk extends cwn {
   public static final dcv a = ctg.aC;
   public static final efb b = cpn.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final efb c = cpn.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final efb d = eey.a(b, cpn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final efb h = eey.a(c, cpn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ha, efb> i = Maps.newEnumMap(ImmutableMap.of(ha.c, d, ha.d, d, ha.f, h, ha.e, h));

   public cyk(dca.d $$0, ddo $$1) {
      super($$0.a($$1.e()), $$1);
      this.k(this.C.b().a(a, ha.c).a(e, Boolean.valueOf(false)));
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.c_($$2) instanceof dav $$6) {
         cfz $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bdx.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dcb $$0, byo $$1, eee $$2, dav $$3, cfz $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cfl && !this.a($$2, $$0);
   }

   private boolean a(eee $$0, dcb $$1) {
      return $$0.b().o() == $$1.c(a).o();
   }

   @Override
   public String f() {
      return this.k().a();
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return i.get($$0.c(a));
   }

   @Override
   public efb b_(dcb $$0, cls $$1, gu $$2) {
      return this.a($$0, $$1, $$2, een.a());
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      switch ((ha)$$0.c(a)) {
         case f:
         case e:
            return c;
         default:
            return b;
      }
   }

   public boolean b(dcb $$0, cmp $$1, gu $$2) {
      ha $$3 = $$0.c(a).h();
      ha $$4 = $$0.c(a).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cmp $$0, dcb $$1, gu $$2, ha $$3) {
      dcb $$4 = $$0.a_($$2);
      return $$4.a(amw.ax) ? $$4.c(a).o().a($$1.c(a)) : $$4.a($$0, $$2, $$3, cxp.a);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = this.n();
      dxe $$2 = $$0.q().b_($$0.a());
      cmp $$3 = $$0.q();
      gu $$4 = $$0.a();

      for (ha $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(e, Boolean.valueOf($$2.a() == dxf.c));
            }
         }
      }

      return null;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1.o() == $$0.c(a).h().o() && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dcb $$0) {
      return $$0.c(a).p();
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, e);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new daj($$0, $$1);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return a($$2, czp.i, dav::a);
   }
}
