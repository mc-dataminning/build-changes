import java.util.List;

public class cdj<T extends bup & bus> extends cbk {
   private static final int a = 10;
   private final T b;
   private final boolean c;
   private int d;

   public cdj(T $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public boolean b() {
      return this.b.dS().ac().b(def.O) && this.h();
   }

   private boolean h() {
      return this.b.en() != null && this.b.en().ao() == bty.by && this.b.eo() > this.d;
   }

   @Override
   public void d() {
      this.d = this.b.eo();
      this.b.ae_();
      if (this.c) {
         this.i().stream().filter($$0 -> $$0 != this.b).map($$0 -> (bus)$$0).forEach(bus::ae_);
      }

      super.d();
   }

   private List<? extends bup> i() {
      double $$0 = this.b.h(bvu.m);
      eyr $$1 = eyr.a(this.b.dq()).c($$0, 10.0, $$0);
      return this.b.dS().a((Class<? extends bup>)this.b.getClass(), $$1, btw.f);
   }
}
