import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class ezn extends fau {
   private static final int k = 20;
   private final ur l;
   private evs m = evs.a;
   protected ur a;
   protected ur b;
   private int n;
   protected final BooleanConsumer c;
   private final List<euz> o = Lists.newArrayList();

   public ezn(BooleanConsumer $$0, ur $$1, ur $$2) {
      this($$0, $$1, $$2, uq.f, uq.g);
   }

   public ezn(BooleanConsumer $$0, ur $$1, ur $$2, ur $$3, ur $$4) {
      super($$1);
      this.c = $$0;
      this.l = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public ur h() {
      return uq.a(super.h(), this.l);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.m = evs.a(this.i, this.l, this.g - 50);
      int $$0 = atm.a(this.C() + this.D() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(euz.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(euz.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(euz $$0) {
      this.o.add(this.d($$0));
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.l(), 16777215);
      this.m.a($$0, this.g / 2, this.C());
   }

   private int l() {
      int $$0 = (this.h - this.D()) / 2;
      return atm.a($$0 - 20 - 9, 10, 80);
   }

   private int C() {
      return this.l() + 20;
   }

   private int D() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (euz $$1 : this.o) {
         $$1.i = false;
      }
   }

   @Override
   public void d() {
      super.d();
      if (--this.n == 0) {
         for (euz $$0 : this.o) {
            $$0.i = true;
         }
      }
   }

   @Override
   public boolean aE_() {
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
