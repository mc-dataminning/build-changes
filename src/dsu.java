import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dsu extends dfk {
   public static final MapCodec<dsu> a = b(dsu::new);
   public static final dtw b = dsw.a;
   public static final dua<due> c = dsw.c;

   @Override
   public MapCodec<dsu> a() {
      return a;
   }

   public dsu(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, due.a));
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return null;
   }

   public static dqh a(jd $$0, dtc $$1, dtc $$2, ji $$3, boolean $$4, boolean $$5) {
      return new dsy($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.k, dsy::a);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqh $$5 = $$1.c_($$2);
         if ($$5 instanceof dsy) {
            ((dsy)$$5).k();
         }
      }
   }

   @Override
   public void a(dcx $$0, jd $$1, dtc $$2) {
      jd $$3 = $$1.a($$2.c(b).g());
      dtc $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dsv && $$4.c(dsv.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqr.c;
      } else {
         return bqr.e;
      }
   }

   @Override
   protected List<cuq> a(dtc $$0, ers.a $$1) {
      dsy $$2 = this.a($$1.a(), jd.a($$1.a(eul.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return exq.a();
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      dsy $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : exq.a();
   }

   @Nullable
   private dsy a(dcc $$0, jd $$1) {
      dqh $$2 = $$0.c_($$1);
      return $$2 instanceof dsy ? (dsy)$$2 : null;
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return cuq.l;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }
}
