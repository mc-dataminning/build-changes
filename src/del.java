import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class del extends der {
   public static final MapCodec<del> a = b(del::new);
   public static final dtb b = dsx.P;
   public static final dsy c = dsx.u;

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public del(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dpg) {
            $$3.a((dpg)$$5);
            $$3.a(avp.ar);
            cky.a($$3, true);
         }

         return bqd.c;
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      bpz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      dpn $$4 = $$1.c_($$2);
      if ($$4 instanceof dpg) {
         ((dpg)$$4).l();
      }
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpg($$0, $$1);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return cpe.a($$1.c_($$2));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
