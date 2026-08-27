import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cuu {
   private final bpd[] b;
   private final cuu.a c;
   private final avd<cqf> d;
   @Nullable
   protected String a;
   private final il.c<cuu> e = ki.f.f(this);

   @Nullable
   public static cuu c(int $$0) {
      return ki.f.a($$0);
   }

   protected cuu(cuu.a $$0, avd<cqf> $$1, bpd[] $$2) {
      this.c = $$0;
      this.d = $$1;
      this.b = $$2;
   }

   public Map<bpd, cqk> a(bpo $$0) {
      Map<bpd, cqk> $$1 = Maps.newEnumMap(bpd.class);

      for (bpd $$2 : this.b) {
         cqk $$3 = $$0.d($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public avd<cqf> d() {
      return this.d;
   }

   public cuu.a e() {
      return this.c;
   }

   public int f() {
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

   public int a(int $$0, bnv $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bpc<?> $$1) {
      return 0.0F;
   }

   public final boolean b(cuu $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cuu $$0) {
      return this != $$0;
   }

   protected String g() {
      if (this.a == null) {
         this.a = ac.a("enchantment", ki.f.b(this));
      }

      return this.a;
   }

   public String h() {
      return this.g();
   }

   public vu d(int $$0) {
      wi $$1 = vu.c(this.h());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(vt.v).b(vu.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cqk $$0) {
      return $$0.d().k().a(this.d);
   }

   public void a(bpo $$0, bow $$1, int $$2) {
   }

   public void b(bpo $$0, bow $$1, int $$2) {
   }

   public boolean b() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean i() {
      return true;
   }

   public boolean j() {
      return true;
   }

   @Deprecated
   public il.c<cuu> k() {
      return this.e;
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
