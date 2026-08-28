import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class foq extends fpt {
   private static final int d = 20;
   private final xd s;
   private fkt u = fkt.a;
   protected xd a;
   protected xd b;
   private int v;
   protected final BooleanConsumer c;
   private final List<fka> w = Lists.newArrayList();

   public foq(BooleanConsumer $$0, xd $$1, xd $$2) {
      this($$0, $$1, $$2, xc.f, xc.g);
   }

   public foq(BooleanConsumer $$0, xd $$1, xd $$2, xd $$3, xd $$4) {
      super($$1);
      this.c = $$0;
      this.s = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public xd i() {
      return xc.a(super.i(), this.s);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.u = fkt.a(this.p, this.s, this.n - 50);
      int $$0 = azc.a(this.D() + this.E() + 20, this.o / 6 + 96, this.o - 24);
      this.w.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(fka.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 155, $$0, 150, 20).a());
      this.a(fka.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(fka $$0) {
      this.w.add(this.c($$0));
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.m(), 16777215);
      this.u.a($$0, this.n / 2, this.D());
   }

   private int m() {
      int $$0 = (this.o - this.E()) / 2;
      return azc.a($$0 - 20 - 9, 10, 80);
   }

   private int D() {
      return this.m() + 20;
   }

   private int E() {
      return this.u.a() * 9;
   }

   public void b(int $$0) {
      this.v = $$0;

      for (fka $$1 : this.w) {
         $$1.j = false;
      }
   }

   @Override
   public void e() {
      super.e();
      if (--this.v == 0) {
         for (fka $$0 : this.w) {
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
