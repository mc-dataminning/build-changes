import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dqt extends ddk {
   public static final MapCodec<dqt> a = b(dqt::new);
   public static final drv b = dqv.a;
   public static final drz<dsd> c = dqv.c;

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, dsd.a));
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return null;
   }

   public static dog a(io $$0, drb $$1, drb $$2, it $$3, boolean $$4, boolean $$5) {
      return new dqx($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return a($$2, doi.k, dqx::a);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof dqx) {
            ((dqx)$$5).k();
         }
      }
   }

   @Override
   public void a(day $$0, io $$1, drb $$2) {
      io $$3 = $$1.a($$2.c(b).g());
      drb $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dqu && $$4.c(dqu.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bpu.b;
      } else {
         return bpu.d;
      }
   }

   @Override
   protected List<cto> a(drb $$0, epi.a $$1) {
      dqx $$2 = this.a($$1.a(), io.a($$1.a(erx.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return eva.a();
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      dqx $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eva.a();
   }

   @Nullable
   private dqx a(dad $$0, io $$1) {
      dog $$2 = $$0.c_($$1);
      return $$2 instanceof dqx ? (dqx)$$2 : null;
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return cto.i;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
