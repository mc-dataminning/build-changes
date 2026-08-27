import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class daa extends cso implements dab {
   public static final dfu f = dft.C;
   protected static final float g = 4.0F;
   protected static final eia h = ctc.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dgq a;

   protected daa(dgq $$0, dfc.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends daa> a();

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return h;
   }

   @Override
   public boolean a(dfd $$0) {
      return true;
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new deh($$0, $$1);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      cjg $$7 = $$6.d();
      ckk $$9 = $$6.d() instanceof ckk $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.ge();
      if ($$1.c_($$2) instanceof deh $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dei $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.w()) {
               $$1.a(null, $$11.p(), apg.zP, aph.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(djn.c, $$11.p(), djn.a.a($$3, $$11.q()));
               $$3.b(apq.c.b($$7));
               return bhe.a;
            } else if ($$14) {
               return bhe.a;
            } else if (!this.a($$3, $$11) && $$3.ge() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bhe.d;
            }
         } else {
            return !$$10 && !$$11.w() ? bhe.b : bhe.a;
         }
      } else {
         return bhe.d;
      }
   }

   private bhe a(boolean $$0) {
      return $$0 ? bhe.d : bhe.a;
   }

   private boolean b(cca $$0, deh $$1, boolean $$2) {
      dei $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(tk.a) || $$0x.b() instanceof us);
   }

   public abstract float g(dfd var1);

   public ehh h(dfd $$0) {
      return new ehh(0.5, 0.5, 0.5);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(f) ? eah.c.a(false) : super.c_($$0);
   }

   public dgq d() {
      return this.a;
   }

   public static dgq a(ctc $$0) {
      dgq $$1;
      if ($$0 instanceof daa) {
         $$1 = ((daa)$$0).d();
      } else {
         $$1 = dgq.b;
      }

      return $$1;
   }

   public void a(cca $$0, deh $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(cca $$0, deh $$1) {
      UUID $$2 = $$1.v();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.h, deh::a);
   }
}
