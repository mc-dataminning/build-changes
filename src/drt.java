import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drt extends dmr implements duc {
   public static final MapCodec<drt> a = b(drt::new);
   public static final ebk b = ebj.I;

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   protected drt(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(eat $$0, eat $$1, jb $$2) {
      return $$1.a(dmt.ag) && $$2.o() == jb.a.b;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == exb.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
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

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }
}
