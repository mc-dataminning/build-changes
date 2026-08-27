import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class exd extends eyk {
   private static final int k = 20;
   private final tl l;
   private etj m = etj.a;
   protected tl a;
   protected tl b;
   private int n;
   protected final BooleanConsumer c;
   private final List<esq> o = Lists.newArrayList();

   public exd(BooleanConsumer $$0, tl $$1, tl $$2) {
      this($$0, $$1, $$2, tk.f, tk.g);
   }

   public exd(BooleanConsumer $$0, tl $$1, tl $$2, tl $$3, tl $$4) {
      super($$1);
      this.c = $$0;
      this.l = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public tl g() {
      return tk.a(super.g(), this.l);
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.m = etj.a(this.i, this.l, this.g - 50);
      int $$0 = arw.a(this.D() + this.E() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(esq.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(esq.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(esq $$0) {
      this.o.add(this.d($$0));
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.l(), 16777215);
      this.m.a($$0, this.g / 2, this.D());
   }

   private int l() {
      int $$0 = (this.h - this.E()) / 2;
      return arw.a($$0 - 20 - 9, 10, 80);
   }

   private int D() {
      return this.l() + 20;
   }

   private int E() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (esq $$1 : this.o) {
         $$1.i = false;
      }
   }

   @Override
   public void c() {
      super.c();
      if (--this.n == 0) {
         for (esq $$0 : this.o) {
            $$0.i = true;
         }
      }
   }

   @Override
   public boolean ay_() {
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
