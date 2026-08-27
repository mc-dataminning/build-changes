import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class ewy extends eyf {
   private static final int k = 20;
   private final ti l;
   private ete m = ete.a;
   protected ti a;
   protected ti b;
   private int n;
   protected final BooleanConsumer c;
   private final List<esl> o = Lists.newArrayList();

   public ewy(BooleanConsumer $$0, ti $$1, ti $$2) {
      this($$0, $$1, $$2, th.f, th.g);
   }

   public ewy(BooleanConsumer $$0, ti $$1, ti $$2, ti $$3, ti $$4) {
      super($$1);
      this.c = $$0;
      this.l = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public ti g() {
      return th.a(super.g(), this.l);
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.m = ete.a(this.i, this.l, this.g - 50);
      int $$0 = ars.a(this.C() + this.D() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(esl.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(esl.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(esl $$0) {
      this.o.add(this.d($$0));
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.l(), 16777215);
      this.m.a($$0, this.g / 2, this.C());
   }

   private int l() {
      int $$0 = (this.h - this.D()) / 2;
      return ars.a($$0 - 20 - 9, 10, 80);
   }

   private int C() {
      return this.l() + 20;
   }

   private int D() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (esl $$1 : this.o) {
         $$1.i = false;
      }
   }

   @Override
   public void c() {
      super.c();
      if (--this.n == 0) {
         for (esl $$0 : this.o) {
            $$0.i = true;
         }
      }
   }

   @Override
   public boolean at_() {
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
