import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvi extends dpa implements dro {
   public static final MapCodec<dvi> c = b(dvi::new);
   public static final ebr<ebp> d = dpa.b;
   private static final ffw e = dmr.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvi> a() {
      return c;
   }

   public dvi(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.c($$1, $$2, jb.b) && !$$0.a(dmt.lp);
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(dmt.bG);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = super.a($$0);
      if ($$1 != null) {
         exa $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axh.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      if ($$0.c(d) == ebp.a) {
         eat $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == ebp.b;
      } else {
         exa $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axh.a) && $$4.e() == 8;
      }
   }

   @Override
   protected exa b_(eat $$0) {
      return exb.c.a(false);
   }

   @Override
   public boolean a(@Nullable bxj $$0, diq $$1, iv $$2, eat $$3, ewz $$4) {
      return false;
   }

   @Override
   public boolean a(djn $$0, iv $$1, eat $$2, exa $$3) {
      return false;
   }
}
