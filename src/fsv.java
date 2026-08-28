import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class fsv extends ftx {
   private static final int d = 20;
   private final xv s;
   private foy u = foy.a;
   protected xv a;
   protected xv b;
   private int v;
   protected final BooleanConsumer c;
   private final List<foe> w = Lists.newArrayList();

   public fsv(BooleanConsumer $$0, xv $$1, xv $$2) {
      this($$0, $$1, $$2, xu.f, xu.g);
   }

   public fsv(BooleanConsumer $$0, xv $$1, xv $$2, xv $$3, xv $$4) {
      super($$1);
      this.c = $$0;
      this.s = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public xv i() {
      return xu.a(super.i(), this.s);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.u = foy.a(this.p, this.s, this.n - 50);
      int $$0 = bae.a(this.E() + this.F() + 20, this.o / 6 + 96, this.o - 24);
      this.w.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(foe.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(foe.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(foe $$0) {
      this.w.add(this.c($$0));
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.l(), 16777215);
      this.u.a($$0, this.n / 2, this.E());
   }

   private int l() {
      int $$0 = (this.o - this.F()) / 2;
      return bae.a($$0 - 20 - 9, 10, 80);
   }

   private int E() {
      return this.l() + 20;
   }

   private int F() {
      return this.u.a() * 9;
   }

   public void b(int $$0) {
      this.v = $$0;

      for (foe $$1 : this.w) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.v == 0) {
         for (foe $$0 : this.w) {
            $$0.j = true;
         }
      }
   }

   @Override
   public boolean aH_() {
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
