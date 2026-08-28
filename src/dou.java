import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dou extends dgh implements dkd {
   public static final MapCodec<dou> a = b(dou::new);
   public static final duy<dvk> b = duq.bj;

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   protected dou(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, dvk.b));
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsv($$0, $$1);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      dre $$5 = $$1.c_($$2);
      if ($$5 instanceof dsv) {
         return (brk)(((dsv)$$5).a($$3) ? brk.a : brk.e);
      } else {
         return brk.e;
      }
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, @Nullable buf $$3, cvl $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dre $$5 = $$0.c_($$1);
            if ($$5 instanceof dsv) {
               ((dsv)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if ($$1 instanceof arg) {
         if ($$1.c_($$2) instanceof dsv $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arg)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arg $$0, dsv $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
