import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtd extends dtc {
   public static final MapCodec<dtd> f = b(dtd::new);
   public static final ebr<jb> g = dqs.e;
   public static final ebk h = dtc.b;

   @Override
   public MapCodec<dtd> a() {
      return f;
   }

   protected dtd(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(g, jb.c).b(h, Boolean.valueOf(true)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return dwk.o($$0);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return dwk.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dmt.a.m() : $$0;
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = dmt.cA.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(h)) {
         jb $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lt.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(djm $$0, iv $$1, eat $$2) {
      jb $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected eyi a(djm $$0, eat $$1) {
      return eye.a($$0, $$1.c(g).g(), jb.b);
   }
}
