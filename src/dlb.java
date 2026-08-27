import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dlb extends cye {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final dmd b = dld.a;
   public static final dmh<dml> c = dld.c;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, dml.a));
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return null;
   }

   public static dix a(hz $$0, dlj $$1, dlj $$2, ie $$3, boolean $$4, boolean $$5) {
      return new dlf($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.k, dlf::a);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dix $$5 = $$1.c_($$2);
         if ($$5 instanceof dlf) {
            ((dlf)$$5).l();
         }
      }
   }

   @Override
   public void a(cvs $$0, hz $$1, dlj $$2) {
      hz $$3 = $$1.a($$2.c(b).g());
      dlj $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dlc && $$4.c(dlc.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return blw.b;
      } else {
         return blw.d;
      }
   }

   @Override
   protected List<cpd> a(dlj $$0, eji.a $$1) {
      dlf $$2 = this.a($$1.a(), hz.a($$1.a(eln.f)));
      return $$2 == null ? Collections.emptyList() : $$2.k().a($$1);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return eop.a();
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      dlf $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eop.a();
   }

   @Nullable
   private dlf a(cux $$0, hz $$1) {
      dix $$2 = $$0.c_($$1);
      return $$2 instanceof dlf ? (dlf)$$2 : null;
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return cpd.h;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
