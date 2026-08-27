import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cpu {
   private final bkv[] a;
   private final cpu.a b;
   public final cpv e;
   @Nullable
   protected String f;
   private final ib.c<cpu> c = jy.g.f(this);

   @Nullable
   public static cpu c(int $$0) {
      return jy.g.a($$0);
   }

   protected cpu(cpu.a $$0, cpv $$1, bkv[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<bkv, clj> a(blg $$0) {
      Map<bkv, clj> $$1 = Maps.newEnumMap(bkv.class);

      for (bkv $$2 : this.a) {
         clj $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cpu.a d() {
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

   public int a(int $$0, bjo $$1) {
      return 0;
   }

   public float a(int $$0, bll $$1) {
      return 0.0F;
   }

   public final boolean b(cpu $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cpu $$0) {
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

   public boolean a(clj $$0) {
      return this.e.a($$0.d());
   }

   public void a(blg $$0, bkq $$1, int $$2) {
   }

   public void b(blg $$0, bkq $$1, int $$2) {
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
   public ib.c<cpu> j() {
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
