import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class ctz {
   private final bom[] b;
   private final ctz.a c;
   private final aut<cpl> d;
   @Nullable
   protected String a;
   private final il.c<ctz> e = kh.f.g(this);

   @Nullable
   public static ctz c(int $$0) {
      return kh.f.a($$0);
   }

   protected ctz(ctz.a $$0, aut<cpl> $$1, bom[] $$2) {
      this.c = $$0;
      this.d = $$1;
      this.b = $$2;
   }

   public Map<bom, cpq> a(box $$0) {
      Map<bom, cpq> $$1 = Maps.newEnumMap(bom.class);

      for (bom $$2 : this.b) {
         cpq $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public aut<cpl> d() {
      return this.d;
   }

   public ctz.a e() {
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

   public int a(int $$0, bne $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bol<?> $$1) {
      return 0.0F;
   }

   public final boolean b(ctz $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(ctz $$0) {
      return this != $$0;
   }

   protected String g() {
      if (this.a == null) {
         this.a = ac.a("enchantment", kh.f.b(this));
      }

      return this.a;
   }

   public String h() {
      return this.g();
   }

   public vs d(int $$0) {
      wg $$1 = vs.c(this.h());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(vr.v).b(vs.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cpq $$0) {
      return $$0.d().k().a(this.d);
   }

   public void a(box $$0, bof $$1, int $$2) {
   }

   public void b(box $$0, bof $$1, int $$2) {
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
   public il.c<ctz> k() {
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
