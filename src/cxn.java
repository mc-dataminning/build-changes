import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cxn {
   private final bqs[] b;
   private final cxn.a c;
   private final awd<cry> d;
   @Nullable
   protected String a;
   private final iv.c<cxn> e = lc.f.f(this);

   @Nullable
   public static cxn c(int $$0) {
      return lc.f.a($$0);
   }

   protected cxn(cxn.a $$0, awd<cry> $$1, bqs[] $$2) {
      this.c = $$0;
      this.d = $$1;
      this.b = $$2;
   }

   public Map<bqs, csd> a(bre $$0) {
      Map<bqs, csd> $$1 = Maps.newEnumMap(bqs.class);

      for (bqs $$2 : this.b) {
         csd $$3 = $$0.d($$2);
         if (!$$3.d()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public awd<cry> d() {
      return this.d;
   }

   public cxn.a e() {
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

   public int a(int $$0, bpj $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bqr<?> $$1) {
      return 0.0F;
   }

   public final boolean b(cxn $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cxn $$0) {
      return this != $$0;
   }

   protected String g() {
      if (this.a == null) {
         this.a = ac.a("enchantment", lc.f.b(this));
      }

      return this.a;
   }

   public String h() {
      return this.g();
   }

   public ws d(int $$0) {
      xg $$1 = ws.c(this.h());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(wr.v).b(ws.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(csd $$0) {
      return $$0.f().n().a(this.d);
   }

   public void a(bre $$0, bql $$1, int $$2) {
   }

   public void b(bre $$0, bql $$1, int $$2) {
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
   public iv.c<cxn> k() {
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
