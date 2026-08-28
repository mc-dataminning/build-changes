import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dts extends dgh {
   public static final MapCodec<dts> a = b(dts::new);
   public static final duu b = dtu.a;
   public static final duy<dvc> c = dtu.c;

   @Override
   public MapCodec<dts> a() {
      return a;
   }

   public dts(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c).b(c, dvc.a));
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return null;
   }

   public static dre a(je $$0, dua $$1, dua $$2, jj $$3, boolean $$4, boolean $$5) {
      return new dtw($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.k, dtw::a);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dre $$5 = $$1.c_($$2);
         if ($$5 instanceof dtw) {
            ((dtw)$$5).k();
         }
      }
   }

   @Override
   public void a(ddt $$0, je $$1, dua $$2) {
      je $$3 = $$1.a($$2.c(b).g());
      dua $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dtt && $$4.c(dtt.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return brk.c;
      } else {
         return brk.e;
      }
   }

   @Override
   protected List<cvl> a(dua $$0, esw.a $$1) {
      dtw $$2 = this.a($$1.a(), je.a($$1.a(evp.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return eyu.a();
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      dtw $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eyu.a();
   }

   @Nullable
   private dtw a(dcx $$0, je $$1) {
      dre $$2 = $$0.c_($$1);
      return $$2 instanceof dtw ? (dtw)$$2 : null;
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return cvl.k;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
