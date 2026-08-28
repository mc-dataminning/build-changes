import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwm extends dvs implements duc {
   public static final MapCodec<dwm> a = b(dwm::new);
   public static final ebk c = ebj.I;

   @Override
   protected MapCodec<? extends dwm> a() {
      return a;
   }

   protected dwm(eas.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(exb.c)));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(c) ? exb.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }
}
