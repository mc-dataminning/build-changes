import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class drl extends dmr implements duc {
   public static final MapCodec<drl> a = b(drl::new);
   public static final int b = 15;
   public static final ebt c = ebj.aS;
   public static final ebk d = ebj.I;
   public static final ToIntFunction<eat> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<drl> a() {
      return a;
   }

   public drl(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C && $$3.gF()) {
         $$1.a($$2, $$0.a(c), 2);
         return bug.b;
      } else {
         return bug.c;
      }
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$3.a(czr.ig) ? fft.b() : fft.a();
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
      if ($$0.c(d)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(d) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static czn a(czn $$0, int $$1) {
      $$0.b(kk.aq, dbn.a.a(c, $$1));
      return $$0;
   }
}
