import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class flv extends fls {
   private final List<flv.a> c = new ArrayList<>();
   private int d;
   private int e;
   private final fma f = fma.i().a(0.5F, 0.5F);

   public flv() {
      this(0, 0, 0, 0);
   }

   public flv(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public flv(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3);
      this.a($$2, $$3);
   }

   public flv a(int $$0, int $$1) {
      return this.b($$0).a($$1);
   }

   public flv a(int $$0) {
      this.e = $$0;
      return this;
   }

   public flv b(int $$0) {
      this.d = $$0;
      return this;
   }

   public fma b() {
      return this.f.g();
   }

   public fma c() {
      return this.f;
   }

   @Override
   public void a() {
      super.a();
      int $$0 = this.d;
      int $$1 = this.e;

      for (flv.a $$2 : this.c) {
         $$0 = Math.max($$0, $$2.b());
         $$1 = Math.max($$1, $$2.a());
      }

      for (flv.a $$3 : this.c) {
         $$3.a(this.D(), $$0);
         $$3.b(this.E(), $$1);
      }

      this.a = $$0;
      this.b = $$1;
   }

   public <T extends flz> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends flz> T a(T $$0, fma $$1) {
      this.c.add(new flv.a($$0, $$1));
      return $$0;
   }

   public <T extends flz> T a(T $$0, Consumer<fma> $$1) {
      return this.a($$0, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<flz> $$0) {
      this.c.forEach($$1 -> $$0.accept($$1.a));
   }

   public static void a(flz $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 0.5F, 0.5F);
   }

   public static void a(flz $$0, fmq $$1) {
      a($$0, $$1.f().a(), $$1.f().b(), $$1.g(), $$1.h());
   }

   public static void a(flz $$0, fmq $$1, float $$2, float $$3) {
      a($$0, $$1.d(), $$1.b(), $$1.g(), $$1.h(), $$2, $$3);
   }

   public static void a(flz $$0, int $$1, int $$2, int $$3, int $$4, float $$5, float $$6) {
      a($$1, $$3, $$0.y(), $$0::m, $$5);
      a($$2, $$4, $$0.w(), $$0::n, $$6);
   }

   public static void a(int $$0, int $$1, int $$2, Consumer<Integer> $$3, float $$4) {
      int $$5 = (int)ayo.i($$4, 0.0F, (float)($$1 - $$2));
      $$3.accept($$0 + $$5);
   }

   static class a extends fls.a {
      protected a(flz $$0, fma $$1) {
         super($$0, $$1);
      }
   }
}
