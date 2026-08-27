import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class ews extends exz {
   private static final int k = 20;
   private final tf l;
   private eta m = eta.a;
   protected tf a;
   protected tf b;
   private int n;
   protected final BooleanConsumer c;
   private final List<esh> o = Lists.newArrayList();

   public ews(BooleanConsumer $$0, tf $$1, tf $$2) {
      this($$0, $$1, $$2, te.f, te.g);
   }

   public ews(BooleanConsumer $$0, tf $$1, tf $$2, tf $$3, tf $$4) {
      super($$1);
      this.c = $$0;
      this.l = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public tf e() {
      return te.a(super.e(), this.l);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.m = eta.a(this.i, this.l, this.g - 50);
      int $$0 = arp.a(this.B() + this.C() + 20, this.h / 6 + 96, this.h - 24);
      this.o.clear();
      this.a($$0);
   }

   protected void a(int $$0) {
      this.a(esh.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 155, $$0, 150, 20).a());
      this.a(esh.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 155 + 160, $$0, 150, 20).a());
   }

   protected void a(esh $$0) {
      this.o.add(this.d($$0));
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.l(), 16777215);
      this.m.a($$0, this.g / 2, this.B());
   }

   private int l() {
      int $$0 = (this.h - this.C()) / 2;
      return arp.a($$0 - 20 - 9, 10, 80);
   }

   private int B() {
      return this.l() + 20;
   }

   private int C() {
      return this.m.a() * 9;
   }

   public void b(int $$0) {
      this.n = $$0;

      for (esh $$1 : this.o) {
         $$1.i = false;
      }
   }

   @Override
   public void c() {
      super.c();
      if (--this.n == 0) {
         for (esh $$0 : this.o) {
            $$0.i = true;
         }
      }
   }

   @Override
   public boolean aA_() {
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
