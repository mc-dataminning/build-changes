import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fip extends fjx {
   private static final int d = 20;
   private final wi o;
   private fer p = fer.a;
   protected wi a;
   protected wi b;
   private int q;
   protected final BooleanConsumer c;
   private final List<fdy> r = Lists.newArrayList();

   public fip(BooleanConsumer $$0, wi $$1, wi $$2) {
      this($$0, $$1, $$2, wh.f, wh.g);
   }

   public fip(BooleanConsumer $$0, wi $$1, wi $$2, wi $$3, wi $$4) {
      super($$1);
      this.c = $$0;
      this.o = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public wi i() {
      return wh.a(super.i(), this.o);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.p = fer.a(this.m, this.o, this.k - 50);
      int $$0 = axm.a(this.C() + this.D() + 20, this.l / 6 + 96, this.l - 24);
      this.r.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fdy.a(this.a, $$0x -> this.c.accept(true)).a(this.k / 2 - 155, $$0, 150, 20).a());
      this.a(fdy.a(this.b, $$0x -> this.c.accept(false)).a(this.k / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fdy $$0) {
      this.r.add(this.c($$0));
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, this.m(), 16777215);
      this.p.a($$0, this.k / 2, this.C());
   }

   private int m() {
      int $$0 = (this.l - this.D()) / 2;
      return axm.a($$0 - 20 - 9, 10, 80);
   }

   private int C() {
      return this.m() + 20;
   }

   private int D() {
      return this.p.a() * 9;
   }

   public void b(int $$0) {
      this.q = $$0;

      for (fdy $$1 : this.r) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.q == 0) {
         for (fdy $$0 : this.r) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.c.accept(false);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }
}
