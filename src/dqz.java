import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqz extends dmd {
   public static final MapCodec<dqz> a = b(dqz::new);
   public static final ebk b = ebj.q;

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   protected dqz(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, @Nullable bxj $$3, czn $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dbv $$5 = $$4.a(kk.aa, dbv.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dyw $$5) {
         $$5.s();
         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$1.c(b)) {
         return bug.f;
      } else {
         czn $$7 = $$4.b($$5);
         bug $$8 = czs.a($$2, $$3, $$7, $$4);
         return (bug)(!$$8.a() ? bug.f : $$8);
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyw($$0, $$1);
   }

   @Override
   public boolean f_(eat $$0) {
      return true;
   }

   @Override
   public int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      if ($$1.c_($$2) instanceof dyw $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return $$1.c_($$2) instanceof dyw $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$1.c(b) ? a($$2, dxt.e, dyw::a) : null;
   }
}
