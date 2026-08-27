import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cno {
   private final biv[] a;
   private final cno.a b;
   public final cnp e;
   @Nullable
   protected String f;
   private final he.c<cno> c = jb.g.f(this);

   @Nullable
   public static cno c(int $$0) {
      return jb.g.a($$0);
   }

   protected cno(cno.a $$0, cnp $$1, biv[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<biv, cjf> a(bjg $$0) {
      Map<biv, cjf> $$1 = Maps.newEnumMap(biv.class);

      for (biv $$2 : this.a) {
         cjf $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cno.a d() {
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

   public int a(int $$0, bho $$1) {
      return 0;
   }

   public float a(int $$0, bjl $$1) {
      return 0.0F;
   }

   public final boolean b(cno $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cno $$0) {
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
      ty $$1 = tl.c(this.g());
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

   public boolean a(cjf $$0) {
      return this.e.a($$0.d());
   }

   public void a(bjg $$0, biq $$1, int $$2) {
   }

   public void b(bjg $$0, biq $$1, int $$2) {
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
   public he.c<cno> j() {
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
