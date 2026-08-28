import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dnt extends dtk implements duc {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final ebk b = ebj.I;
   private static final Map<jb.a, ffw> e = fft.b(dmr.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(d, jb.a.b));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e.get($$0.c(d));
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
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(b) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
