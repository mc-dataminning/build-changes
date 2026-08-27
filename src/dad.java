import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dad {
   private final dad.b b;
   @Nullable
   protected String a;
   private final ja.c<dad> c = lh.f.f(this);

   public static dad.a a(int $$0) {
      return new dad.a($$0, 0);
   }

   public static dad.a a(int $$0, int $$1) {
      return new dad.a($$0, $$1);
   }

   public static dad.b a(awt<cuc> $$0, awt<cuc> $$1, int $$2, int $$3, dad.a $$4, dad.a $$5, int $$6, bsc... $$7) {
      return new dad.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public static dad.b a(awt<cuc> $$0, int $$1, int $$2, dad.a $$3, dad.a $$4, int $$5, bsc... $$6) {
      return new dad.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   public static dad b(int $$0) {
      return lh.f.a($$0);
   }

   public dad(dad.b $$0) {
      this.b = $$0;
   }

   public Map<bsc, cuh> a(bso $$0) {
      Map<bsc, cuh> $$1 = Maps.newEnumMap(bsc.class);

      for (bsc $$2 : this.b.h()) {
         cuh $$3 = $$0.d($$2);
         if (!$$3.d()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final awt<cuc> c() {
      return this.b.a();
   }

   public final boolean a(cuh $$0) {
      return this.b.b.isEmpty() || $$0.a(this.b.b.get());
   }

   public final int d() {
      return this.b.c();
   }

   public final int e() {
      return this.b.g();
   }

   public final int f() {
      return 1;
   }

   public final int g() {
      return this.b.d();
   }

   public final int c(int $$0) {
      return this.b.e().a($$0);
   }

   public final int d(int $$0) {
      return this.b.f().a($$0);
   }

   public int a(int $$0, bqt $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bsb<?> $$1) {
      return 0.0F;
   }

   public final boolean b(dad $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(dad $$0) {
      return this != $$0;
   }

   protected String h() {
      if (this.a == null) {
         this.a = ad.a("enchantment", lh.f.b(this));
      }

      return this.a;
   }

   public String i() {
      return this.h();
   }

   public xe e(int $$0) {
      xs $$1 = xe.c(this.i());
      if (this.b()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.g() != 1) {
         $$1.a(xd.v).a(xe.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean b(cuh $$0) {
      return $$0.f().n().a(this.b.a());
   }

   public void a(bso $$0, brv $$1, int $$2) {
   }

   public void b(bso $$0, brv $$1, int $$2) {
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean j() {
      return true;
   }

   public boolean k() {
      return true;
   }

   @Deprecated
   public ja.c<dad> l() {
      return this.c;
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(awt<cuc> a, Optional<awt<cuc>> b, int c, int d, dad.a e, dad.a f, int g, bsc[] h) {
   }
}
