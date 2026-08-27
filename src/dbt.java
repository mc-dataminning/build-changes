import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dbt extends cpa {
   public static final dcv a = dbv.a;
   public static final dcz<ddd> b = dbv.b;

   public dbt(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, ddd.a));
   }

   @Nullable
   @Override
   public czn a(gu $$0, dcb $$1) {
      return null;
   }

   public static czn a(gu $$0, dcb $$1, dcb $$2, ha $$3, boolean $$4, boolean $$5) {
      return new dbx($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return a($$2, czp.k, dbx::a);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         czn $$5 = $$1.c_($$2);
         if ($$5 instanceof dbx) {
            ((dbx)$$5).j();
         }
      }
   }

   @Override
   public void a(cmn $$0, gu $$1, dcb $$2) {
      gu $$3 = $$1.a($$2.c(a).g());
      dcb $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dbu && $$4.c(dbu.b)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bdx.b;
      } else {
         return bdx.d;
      }
   }

   @Override
   public List<cfz> a(dcb $$0, dzq.a $$1) {
      dbx $$2 = this.a($$1.a(), gu.a($$1.a(ebw.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return eey.a();
   }

   @Override
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      dbx $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eey.a();
   }

   @Nullable
   private dbx a(cls $$0, gu $$1) {
      czn $$2 = $$0.c_($$1);
      return $$2 instanceof dbx ? (dbx)$$2 : null;
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return cfz.b;
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
      $$0.a(a, b);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
