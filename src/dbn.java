import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbn extends dbt {
   public static final MapCodec<dbn> a = b(dbn::new);
   public static final dqc b = dpy.P;
   public static final dpz c = dpy.u;

   @Override
   public MapCodec<dbn> a() {
      return a;
   }

   public dbn(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dmh) {
            $$3.a((dmh)$$5);
            $$3.a(auz.ar);
            cir.a($$3, true);
         }

         return bof.b;
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      bob.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      dmo $$4 = $$1.c_($$2);
      if ($$4 instanceof dmh) {
         ((dmh)$$4).l();
      }
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmh($$0, $$1);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return cmw.a($$1.c_($$2));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.d().g());
   }
}
