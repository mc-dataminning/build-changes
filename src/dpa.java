import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dpa extends dbt {
   public static final MapCodec<dpa> a = b(dpa::new);
   public static final dqc b = dpc.a;
   public static final dqg<dqk> c = dpc.c;

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   public dpa(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c).a(c, dqk.a));
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return null;
   }

   public static dmo a(id $$0, dpi $$1, dpi $$2, ij $$3, boolean $$4, boolean $$5) {
      return new dpe($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.k, dpe::a);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dpe) {
            ((dpe)$$5).k();
         }
      }
   }

   @Override
   public void a(czh $$0, id $$1, dpi $$2) {
      id $$3 = $$1.a($$2.c(b).g());
      dpi $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dpb && $$4.c(dpb.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bof.b;
      } else {
         return bof.d;
      }
   }

   @Override
   protected List<crs> a(dpi $$0, enq.a $$1) {
      dpe $$2 = this.a($$1.a(), id.a($$1.a(epx.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return esz.a();
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      dpe $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : esz.a();
   }

   @Nullable
   private dpe a(cym $$0, id $$1) {
      dmo $$2 = $$0.c_($$1);
      return $$2 instanceof dpe ? (dpe)$$2 : null;
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return crs.i;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
