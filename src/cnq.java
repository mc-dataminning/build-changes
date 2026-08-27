import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cnq {
   private final bix[] a;
   private final cnq.a b;
   public final cnr e;
   @Nullable
   protected String f;
   private final hg.c<cnq> c = jd.g.f(this);

   @Nullable
   public static cnq c(int $$0) {
      return jd.g.a($$0);
   }

   protected cnq(cnq.a $$0, cnr $$1, bix[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<bix, cjh> a(bji $$0) {
      Map<bix, cjh> $$1 = Maps.newEnumMap(bix.class);

      for (bix $$2 : this.a) {
         cjh $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cnq.a d() {
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

   public int a(int $$0, bhq $$1) {
      return 0;
   }

   public float a(int $$0, bjn $$1) {
      return 0.0F;
   }

   public final boolean b(cnq $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cnq $$0) {
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

   public tn d(int $$0) {
      ua $$1 = tn.c(this.g());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(tm.u).b(tn.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cjh $$0) {
      return this.e.a($$0.d());
   }

   public void a(bji $$0, bis $$1, int $$2) {
   }

   public void b(bji $$0, bis $$1, int $$2) {
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
   public hg.c<cnq> j() {
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
