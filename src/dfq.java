import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfq extends dgh {
   public static final duu a = dkr.aE;
   public static final dur b = duq.r;

   protected dfq(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(a, jj.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dfq> a();

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         this.a($$1, $$2, $$3);
      }

      return brk.a;
   }

   protected abstract void a(dds var1, je var2, cnp var3);

   @Override
   public dua a(cyw $$0) {
      return this.o().b(a, $$0.g().g());
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dre $$5 = $$1.c_($$2);
         if ($$5 instanceof dqs) {
            if ($$1 instanceof arg) {
               brg.a($$1, $$2, (dqs)$$5);
               ((dqs)$$5).a((arg)$$1, eye.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return cqq.a($$1.c_($$2));
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dre> drf<T> a(dds $$0, drg<T> $$1, drg<? extends dqs> $$2) {
      return $$0.B ? null : a($$1, $$2, dqs::a);
   }
}
