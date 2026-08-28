import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drd extends dmr implements duc {
   public static final MapCodec<drd> a = b(drd::new);
   public static final ebk b = ebj.m;
   public static final ebk c = ebj.I;
   private static final ffw d = fft.a(dmr.b(4.0, 7.0, 9.0), dmr.b(6.0, 0.0, 7.0));
   private static final ffw e = d.a(0.0, 0.0625, 0.0).d();

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   public drd(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());

      for (jb $$2 : $$0.f()) {
         if ($$2.o() == jb.a.b) {
            eat $$3 = this.m().b(b, Boolean.valueOf($$2 == jb.b));
            if ($$3.a((djp)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == exb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      jb $$3 = o($$0).g();
      return dmr.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jb o(eat $$0) {
      return $$0.c(b) ? jb.a : jb.b;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(c) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
