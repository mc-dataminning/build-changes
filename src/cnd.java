import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cnd {
   private final bil[] a;
   private final cnd.a b;
   public final cne e;
   @Nullable
   protected String f;

   @Nullable
   public static cnd c(int $$0) {
      return jc.g.a($$0);
   }

   protected cnd(cnd.a $$0, cne $$1, bil[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<bil, ciw> a(biw $$0) {
      Map<bil, ciw> $$1 = Maps.newEnumMap(bil.class);

      for (bil $$2 : this.a) {
         ciw $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cnd.a d() {
      return this.b;
   }

   public int e() {
      return 1;
   }

   public int a() {
      return 1;
   }

   public int a(int $$0) {
      return 1 + $$0 * 10;
   }

   public int b(int $$0) {
      return this.a($$0) + 5;
   }

   public int a(int $$0, bhe $$1) {
      return 0;
   }

   public float a(int $$0, bjb $$1) {
      return 0.0F;
   }

   public final boolean b(cnd $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cnd $$0) {
      return this != $$0;
   }

   protected String f() {
      if (this.f == null) {
         this.f = ac.a("enchantment", jc.g.b(this));
      }

      return this.f;
   }

   public String g() {
      return this.f();
   }

   public te d(int $$0) {
      tr $$1 = te.c(this.g());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(td.u).b(te.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(ciw $$0) {
      return this.e.a($$0.d());
   }

   public void a(biw $$0, big $$1, int $$2) {
   }

   public void b(biw $$0, big $$1, int $$2) {
   }

   public boolean b() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean h() {
      return true;
   }

   public boolean i() {
      return true;
   }

   public static enum a {
      a(10),
      b(5),
      c(2),
      d(1);

      private final int e;

      private a(int $$0) {
         this.e = $$0;
      }

      public int a() {
         return this.e;
      }
   }
}
