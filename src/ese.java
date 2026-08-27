import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ese extends esd {
   private final List<ese.a> c = new ArrayList<>();
   private int d;
   private int e;
   private final esj f = esj.i().a(0.5F, 0.5F);

   public ese() {
      this(0, 0, 0, 0);
   }

   public ese(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public ese(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3);
      this.a($$2, $$3);
   }

   public ese a(int $$0, int $$1) {
      return this.b($$0).a($$1);
   }

   public ese a(int $$0) {
      this.e = $$0;
      return this;
   }

   public ese b(int $$0) {
      this.d = $$0;
      return this;
   }

   public esj a() {
      return this.f.g();
   }

   public esj b() {
      return this.f;
   }

   @Override
   public void c() {
      super.c();
      int $$0 = this.d;
      int $$1 = this.e;

      for (ese.a $$2 : this.c) {
         $$0 = Math.max($$0, $$2.b());
         $$1 = Math.max($$1, $$2.a());
      }

      for (ese.a $$3 : this.c) {
         $$3.a(this.p(), $$0);
         $$3.b(this.r(), $$1);
      }

      this.a = $$0;
      this.b = $$1;
   }

   public <T extends esi> T a(T $$0) {
      return this.a($$0, this.a());
   }

   public <T extends esi> T a(T $$0, esj $$1) {
      this.c.add(new ese.a($$0, $$1));
      return $$0;
   }

   @Override
   public void b(Consumer<esi> $$0) {
      this.c.forEach($$1 -> $$0.accept($$1.a));
   }

   public static void a(esi $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 0.5F, 0.5F);
   }

   public static void a(esi $$0, esz $$1) {
      a($$0, $$1.f().a(), $$1.f().b(), $$1.g(), $$1.h());
   }

   public static void a(esi $$0, esz $$1, float $$2, float $$3) {
      a($$0, $$1.d(), $$1.b(), $$1.g(), $$1.h(), $$2, $$3);
   }

   public static void a(esi $$0, int $$1, int $$2, int $$3, int $$4, float $$5, float $$6) {
      a($$1, $$3, $$0.k(), $$0::e, $$5);
      a($$2, $$4, $$0.h(), $$0::f, $$6);
   }

   public static void a(int $$0, int $$1, int $$2, Consumer<Integer> $$3, float $$4) {
      int $$5 = (int)apa.i($$4, 0.0F, (float)($$1 - $$2));
      $$3.accept($$0 + $$5);
   }

   static class a extends esd.a {
      protected a(esi $$0, esj $$1) {
         super($$0, $$1);
      }
   }
}
