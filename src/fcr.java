import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fcr extends fco {
   private final List<fcr.a> c = new ArrayList<>();
   private int d;
   private int e;
   private final fcw f = fcw.i().a(0.5F, 0.5F);

   public fcr() {
      this(0, 0, 0, 0);
   }

   public fcr(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public fcr(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3);
      this.a($$2, $$3);
   }

   public fcr a(int $$0, int $$1) {
      return this.b($$0).a($$1);
   }

   public fcr a(int $$0) {
      this.e = $$0;
      return this;
   }

   public fcr b(int $$0) {
      this.d = $$0;
      return this;
   }

   public fcw b() {
      return this.f.g();
   }

   public fcw c() {
      return this.f;
   }

   @Override
   public void a() {
      super.a();
      int $$0 = this.d;
      int $$1 = this.e;

      for (fcr.a $$2 : this.c) {
         $$0 = Math.max($$0, $$2.b());
         $$1 = Math.max($$1, $$2.a());
      }

      for (fcr.a $$3 : this.c) {
         $$3.a(this.B(), $$0);
         $$3.b(this.C(), $$1);
      }

      this.a = $$0;
      this.b = $$1;
   }

   public <T extends fcv> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fcv> T a(T $$0, fcw $$1) {
      this.c.add(new fcr.a($$0, $$1));
      return $$0;
   }

   public <T extends fcv> T a(T $$0, Consumer<fcw> $$1) {
      return this.a($$0, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fcv> $$0) {
      this.c.forEach($$1 -> $$0.accept($$1.a));
   }

   public static void a(fcv $$0, int $$1, int $$2, int $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 0.5F, 0.5F);
   }

   public static void a(fcv $$0, fdm $$1) {
      a($$0, $$1.f().a(), $$1.f().b(), $$1.g(), $$1.h());
   }

   public static void a(fcv $$0, fdm $$1, float $$2, float $$3) {
      a($$0, $$1.d(), $$1.b(), $$1.g(), $$1.h(), $$2, $$3);
   }

   public static void a(fcv $$0, int $$1, int $$2, int $$3, int $$4, float $$5, float $$6) {
      a($$1, $$3, $$0.w(), $$0::m, $$5);
      a($$2, $$4, $$0.u(), $$0::n, $$6);
   }

   public static void a(int $$0, int $$1, int $$2, Consumer<Integer> $$3, float $$4) {
      int $$5 = (int)awh.i($$4, 0.0F, (float)($$1 - $$2));
      $$3.accept($$0 + $$5);
   }

   static class a extends fco.a {
      protected a(fcv $$0, fcw $$1) {
         super($$0, $$1);
      }
   }
}
