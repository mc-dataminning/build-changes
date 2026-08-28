import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dly extends dmr implements duc {
   public static final MapCodec<dly> a = b(dly::new);
   public static final ebk b = ebj.I;

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(eas.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(eat $$0) {
      return $$0.y().c();
   }

   @Override
   protected dte a_(eat $$0) {
      return dte.a;
   }

   @Override
   protected float c(eat $$0, diq $$1, iv $$2) {
      return 1.0F;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(b) ? exb.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == exb.c));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   public czn a(@Nullable bxj $$0, djn $$1, iv $$2, eat $$3) {
      if ($$0 instanceof crm $$4 && $$4.b()) {
         return duc.super.a($$0, $$1, $$2, $$3);
      }

      return czn.k;
   }

   @Override
   public boolean a(@Nullable bxj $$0, diq $$1, iv $$2, eat $$3, ewz $$4) {
      if ($$0 instanceof crm $$5 && $$5.b()) {
         return duc.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
