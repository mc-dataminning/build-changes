import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends dgh {
   public static final MapCodec<dky> a = b(dky::new);
   public static final dur b = duq.n;

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   protected dky(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, @Nullable buf $$3, cvl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cya $$5 = $$4.a(kr.Q, cya.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dsh $$5) {
         $$5.t();
         return brk.a;
      } else {
         return brk.e;
      }
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$1.c(b)) {
         return brk.f;
      } else {
         cvl $$7 = $$4.b($$5);
         brk $$8 = cvp.a($$2, $$3, $$7, $$4);
         return (brk)(!$$8.a() ? brk.f : $$8);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dsh $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsh($$0, $$1);
   }

   @Override
   public boolean f_(dua $$0) {
      return true;
   }

   @Override
   public int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      if ($$1.c_($$2) instanceof dsh $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return $$1.c_($$2) instanceof dsh $$3 ? $$3.u() : 0;
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$1.c(b) ? a($$2, drg.e, dsh::a) : null;
   }
}
