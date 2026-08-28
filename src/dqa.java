import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqa extends dlg {
   public static final MapCodec<dqa> a = b(dqa::new);
   public static final eaf b = eae.q;

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   protected dqa(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, @Nullable bwz $$3, cys $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dba $$5 = $$4.a(kj.aa, dba.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dxs $$5) {
         $$5.s();
         return bty.a;
      } else {
         return bty.e;
      }
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if ($$1.c(b)) {
         return bty.f;
      } else {
         cys $$7 = $$4.b($$5);
         bty $$8 = cyx.a($$2, $$3, $$7, $$4);
         return (bty)(!$$8.a() ? bty.f : $$8);
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxs($$0, $$1);
   }

   @Override
   public boolean f_(dzo $$0) {
      return true;
   }

   @Override
   public int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      if ($$1.c_($$2) instanceof dxs $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return $$1.c_($$2) instanceof dxs $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$1.c(b) ? a($$2, dwp.e, dxs::a) : null;
   }
}
