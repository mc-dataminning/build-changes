import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cpm {
   private final bkn[] a;
   private final cpm.a b;
   public final cpn e;
   @Nullable
   protected String f;
   private final ib.c<cpm> c = jy.g.f(this);

   @Nullable
   public static cpm c(int $$0) {
      return jy.g.a($$0);
   }

   protected cpm(cpm.a $$0, cpn $$1, bkn[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<bkn, clb> a(bky $$0) {
      Map<bkn, clb> $$1 = Maps.newEnumMap(bkn.class);

      for (bkn $$2 : this.a) {
         clb $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cpm.a d() {
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

   public int a(int $$0, bjg $$1) {
      return 0;
   }

   public float a(int $$0, bld $$1) {
      return 0.0F;
   }

   public final boolean b(cpm $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cpm $$0) {
      return this != $$0;
   }

   protected String f() {
      if (this.f == null) {
         this.f = ac.a("enchantment", jy.g.b(this));
      }

      return this.f;
   }

   public String g() {
      return this.f();
   }

   public ur d(int $$0) {
      vf $$1 = ur.c(this.g());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(uq.u).b(ur.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(clb $$0) {
      return this.e.a($$0.d());
   }

   public void a(bky $$0, bki $$1, int $$2) {
   }

   public void b(bky $$0, bki $$1, int $$2) {
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
   public ib.c<cpm> j() {
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
