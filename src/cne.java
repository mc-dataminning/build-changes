import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cne {
   private final bin[] a;
   private final cne.a b;
   public final cnf e;
   @Nullable
   protected String f;
   private final he.c<cne> c = jb.g.f(this);

   @Nullable
   public static cne c(int $$0) {
      return jb.g.a($$0);
   }

   protected cne(cne.a $$0, cnf $$1, bin[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<bin, cix> a(biy $$0) {
      Map<bin, cix> $$1 = Maps.newEnumMap(bin.class);

      for (bin $$2 : this.a) {
         cix $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cne.a d() {
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

   public int a(int $$0, bhg $$1) {
      return 0;
   }

   public float a(int $$0, bjd $$1) {
      return 0.0F;
   }

   public final boolean b(cne $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cne $$0) {
      return this != $$0;
   }

   protected String f() {
      if (this.f == null) {
         this.f = ac.a("enchantment", jb.g.b(this));
      }

      return this.f;
   }

   public String g() {
      return this.f();
   }

   public tf d(int $$0) {
      ts $$1 = tf.c(this.g());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(te.u).b(tf.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cix $$0) {
      return this.e.a($$0.d());
   }

   public void a(biy $$0, bii $$1, int $$2) {
   }

   public void b(biy $$0, bii $$1, int $$2) {
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
   public he.c<cne> j() {
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
