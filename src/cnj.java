import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cnj {
   private final biq[] a;
   private final cnj.a b;
   public final cnk e;
   @Nullable
   protected String f;
   private final hg.c<cnj> c = jd.g.f(this);

   @Nullable
   public static cnj c(int $$0) {
      return jd.g.a($$0);
   }

   protected cnj(cnj.a $$0, cnk $$1, biq[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<biq, cja> a(bjb $$0) {
      Map<biq, cja> $$1 = Maps.newEnumMap(biq.class);

      for (biq $$2 : this.a) {
         cja $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cnj.a d() {
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

   public int a(int $$0, bhj $$1) {
      return 0;
   }

   public float a(int $$0, bjg $$1) {
      return 0.0F;
   }

   public final boolean b(cnj $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cnj $$0) {
      return this != $$0;
   }

   protected String f() {
      if (this.f == null) {
         this.f = ac.a("enchantment", jd.g.b(this));
      }

      return this.f;
   }

   public String g() {
      return this.f();
   }

   public ti d(int $$0) {
      tv $$1 = ti.c(this.g());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(th.u).b(ti.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cja $$0) {
      return this.e.a($$0.d());
   }

   public void a(bjb $$0, bil $$1, int $$2) {
   }

   public void b(bjb $$0, bil $$1, int $$2) {
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

   @Deprecated
   public hg.c<cnj> j() {
      return this.c;
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
