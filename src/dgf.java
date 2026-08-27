import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dgf extends dhv implements dcy, djw {
   public static final MapCodec<dgf> a = b(dgf::new);
   private static final dqp c = dqo.C;
   private final dhw d = new dhw(this);

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public dgf(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dpy> b(int $$0) {
      return $$1 -> dhv.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      return !$$1.n().a(csg.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return ir.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return $$0.u().c();
   }

   @Override
   public dhw c() {
      return this.d;
   }
}
