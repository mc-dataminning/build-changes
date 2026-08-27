import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cwz {
   private final bqh[] b;
   private final cwz.a c;
   private final avt<crn> d;
   @Nullable
   protected String a;
   private final in.c<cwz> e = kt.f.f(this);

   @Nullable
   public static cwz c(int $$0) {
      return kt.f.a($$0);
   }

   protected cwz(cwz.a $$0, avt<crn> $$1, bqh[] $$2) {
      this.c = $$0;
      this.d = $$1;
      this.b = $$2;
   }

   public Map<bqh, crs> a(bqt $$0) {
      Map<bqh, crs> $$1 = Maps.newEnumMap(bqh.class);

      for (bqh $$2 : this.b) {
         crs $$3 = $$0.d($$2);
         if (!$$3.d()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public avt<crn> d() {
      return this.d;
   }

   public cwz.a e() {
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

   public int a(int $$0, boy $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bqg<?> $$1) {
      return 0.0F;
   }

   public final boolean b(cwz $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cwz $$0) {
      return this != $$0;
   }

   protected String g() {
      if (this.a == null) {
         this.a = ac.a("enchantment", kt.f.b(this));
      }

      return this.a;
   }

   public String h() {
      return this.g();
   }

   public wi d(int $$0) {
      ww $$1 = wi.c(this.h());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(wh.v).b(wi.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(crs $$0) {
      return $$0.f().n().a(this.d);
   }

   public void a(bqt $$0, bqa $$1, int $$2) {
   }

   public void b(bqt $$0, bqa $$1, int $$2) {
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
   public in.c<cwz> k() {
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
