import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fnb extends fod {
   private static final int r = 20;
   private final wz s;
   private fjf u = fjf.a;
   protected wz a;
   protected wz b;
   private int v;
   protected final BooleanConsumer c;
   private final List<fim> w = Lists.newArrayList();

   public fnb(BooleanConsumer $$0, wz $$1, wz $$2) {
      this($$0, $$1, $$2, wy.f, wy.g);
   }

   public fnb(BooleanConsumer $$0, wz $$1, wz $$2, wz $$3, wz $$4) {
      super($$1);
      this.c = $$0;
      this.s = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public wz i() {
      return wy.a(super.i(), this.s);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.u = fjf.a(this.o, this.s, this.m - 50);
      int $$0 = ayo.a(this.C() + this.D() + 20, this.n / 6 + 96, this.n - 24);
      this.w.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fim.a(this.a, $$0x -> this.c.accept(true)).a(this.m / 2 - 155, $$0, 150, 20).a());
      this.a(fim.a(this.b, $$0x -> this.c.accept(false)).a(this.m / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fim $$0) {
      this.w.add(this.c($$0));
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, this.m(), 16777215);
      this.u.a($$0, this.m / 2, this.C());
   }

   private int m() {
      int $$0 = (this.n - this.D()) / 2;
      return ayo.a($$0 - 20 - 9, 10, 80);
   }

   private int C() {
      return this.m() + 20;
   }

   private int D() {
      return this.u.a() * 9;
   }

   public void b(int $$0) {
      this.v = $$0;

      for (fim $$1 : this.w) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.v == 0) {
         for (fim $$0 : this.w) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aJ_() {
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
