import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dfr extends dhg implements dck, djh {
   public static final MapCodec<dfr> a = b(dfr::new);
   private static final dpz c = dpy.C;
   private final dhh d = new dhh(this);

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   public dfr(dph.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dpi> b(int $$0) {
      return $$1 -> dhg.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      return !$$1.n().a(crv.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return ij.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return $$0.u().c();
   }

   @Override
   public dhh c() {
      return this.d;
   }
}
