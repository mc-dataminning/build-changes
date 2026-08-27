import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cuw {
   private final bpe[] b;
   private final cuw.a c;
   private final avd<cqh> d;
   @Nullable
   protected String a;
   private final il.c<cuw> e = ki.f.f(this);

   @Nullable
   public static cuw c(int $$0) {
      return ki.f.a($$0);
   }

   protected cuw(cuw.a $$0, avd<cqh> $$1, bpe[] $$2) {
      this.c = $$0;
      this.d = $$1;
      this.b = $$2;
   }

   public Map<bpe, cqm> a(bpp $$0) {
      Map<bpe, cqm> $$1 = Maps.newEnumMap(bpe.class);

      for (bpe $$2 : this.b) {
         cqm $$3 = $$0.d($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public avd<cqh> d() {
      return this.d;
   }

   public cuw.a e() {
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

   public int a(int $$0, bnw $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bpd<?> $$1) {
      return 0.0F;
   }

   public final boolean b(cuw $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cuw $$0) {
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

   public boolean a(cqm $$0) {
      return $$0.d().k().a(this.d);
   }

   public void a(bpp $$0, box $$1, int $$2) {
   }

   public void b(bpp $$0, box $$1, int $$2) {
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
   public il.c<cuw> k() {
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
