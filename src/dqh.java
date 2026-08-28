import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqh extends dlm {
   public static final MapCodec<dqh> a = b(dqh::new);
   public static final eaq b = eap.q;

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   protected dqh(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, @Nullable bxc $$3, cyy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dbg $$5 = $$4.a(kj.aa, dbg.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dyc $$5) {
         $$5.s();
         return bub.a;
      } else {
         return bub.e;
      }
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$1.c(b)) {
         return bub.f;
      } else {
         cyy $$7 = $$4.b($$5);
         bub $$8 = czd.a($$2, $$3, $$7, $$4);
         return (bub)(!$$8.a() ? bub.f : $$8);
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyc($$0, $$1);
   }

   @Override
   public boolean f_(dzz $$0) {
      return true;
   }

   @Override
   public int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      if ($$1.c_($$2) instanceof dyc $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return $$1.c_($$2) instanceof dyc $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$1.c(b) ? a($$2, dwz.e, dyc::a) : null;
   }
}
