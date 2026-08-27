import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cnu {
   private final bjb[] a;
   private final cnu.a b;
   public final cnv e;
   @Nullable
   protected String f;
   private final he.c<cnu> c = jb.g.f(this);

   @Nullable
   public static cnu c(int $$0) {
      return jb.g.a($$0);
   }

   protected cnu(cnu.a $$0, cnv $$1, bjb[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<bjb, cjl> a(bjm $$0) {
      Map<bjb, cjl> $$1 = Maps.newEnumMap(bjb.class);

      for (bjb $$2 : this.a) {
         cjl $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cnu.a d() {
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

   public int a(int $$0, bhu $$1) {
      return 0;
   }

   public float a(int $$0, bjr $$1) {
      return 0.0F;
   }

   public final boolean b(cnu $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cnu $$0) {
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

   public tl d(int $$0) {
      tz $$1 = tl.c(this.g());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(tk.u).b(tl.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cjl $$0) {
      return this.e.a($$0.d());
   }

   public void a(bjm $$0, biw $$1, int $$2) {
   }

   public void b(bjm $$0, biw $$1, int $$2) {
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
   public he.c<cnu> j() {
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
