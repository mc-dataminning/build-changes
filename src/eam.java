import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class eam extends dov {
   public static final MapCodec<eam> b = b(eam::new);
   public static final ebr<ebv> c = ebj.bj;
   public static final ebk d = ebj.B;
   public static final int e = 4;
   private static final ffw f = dmr.c(16.0, 0.0, 4.0);
   private static final Map<jb, ffw> g = fft.d(fft.a(f, dmr.c(4.0, 4.0, 16.0)));
   private static final Map<jb, ffw> h = fft.d(fft.a(f, dmr.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<eam> a() {
      return b;
   }

   public eam(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.c).b(c, ebv.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(eat $$0, eat $$1) {
      dmr $$2 = $$0.c(c) == ebv.a ? dmt.bI : dmt.by;
      return $$1.a($$2) && $$1.c(eal.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
      if (!$$0.C && $$3.gk()) {
         iv $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      iv $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dmt.ca) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if ($$0.a((djp)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eye.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn($$2.c(c) == ebv.b ? dmt.by : dmt.bI);
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
