import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drk extends dmo {
   public static final MapCodec<drk> a = b(drk::new);
   public static final ebv b = ebu.q;

   @Override
   public MapCodec<drk> a() {
      return a;
   }

   protected drk(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, @Nullable bxu $$3, czy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcg $$5 = $$4.a(kk.aa, dcg.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dzh $$5) {
         $$5.s();
         return bur.a;
      } else {
         return bur.e;
      }
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$1.c(b)) {
         return bur.f;
      } else {
         czy $$7 = $$4.b($$5);
         bur $$8 = dad.a($$2, $$3, $$7, $$4);
         return (bur)(!$$8.a() ? bur.f : $$8);
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzh($$0, $$1);
   }

   @Override
   public boolean f_(ebe $$0) {
      return true;
   }

   @Override
   public int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      if ($$1.c_($$2) instanceof dzh $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return $$1.c_($$2) instanceof dzh $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$1.c(b) ? a($$2, dye.e, dzh::a) : null;
   }
}
