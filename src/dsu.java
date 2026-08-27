import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dsu extends den {
   public static final MapCodec<dsu> a = b(dsu::new);
   public static final dtw b = dsw.a;
   public static final dua<due> c = dsw.c;

   @Override
   public MapCodec<dsu> a() {
      return a;
   }

   public dsu(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c).a(c, due.a));
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return null;
   }

   public static dqc a(ir $$0, dtc $$1, dtc $$2, iw $$3, boolean $$4, boolean $$5) {
      return new dsy($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.l, dsy::a);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof dsy) {
            ((dsy)$$5).k();
         }
      }
   }

   @Override
   public void a(dcb $$0, ir $$1, dtc $$2) {
      ir $$3 = $$1.a($$2.c(b).g());
      dtc $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dsv && $$4.c(dsv.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqa.b;
      } else {
         return bqa.d;
      }
   }

   @Override
   protected List<cuh> a(dtc $$0, ers.a $$1) {
      dsy $$2 = this.a($$1.a(), ir.a($$1.a(eug.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.a();
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      dsy $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : exk.a();
   }

   @Nullable
   private dsy a(dbg $$0, ir $$1) {
      dqc $$2 = $$0.c_($$1);
      return $$2 instanceof dsy ? (dsy)$$2 : null;
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return cuh.i;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
