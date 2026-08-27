import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cri {
   private final blz[] a;
   private final cri.a b;
   public final crj e;
   @Nullable
   protected String f;
   private final ih.c<cri> c = kd.f.f(this);

   @Nullable
   public static cri c(int $$0) {
      return kd.f.a($$0);
   }

   protected cri(cri.a $$0, crj $$1, blz[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<blz, cmx> a(bmk $$0) {
      Map<blz, cmx> $$1 = Maps.newEnumMap(blz.class);

      for (blz $$2 : this.a) {
         cmx $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public cri.a d() {
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

   public int a(int $$0, bks $$1) {
      return 0;
   }

   public float a(int $$0, bmp $$1) {
      return 0.0F;
   }

   public final boolean b(cri $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cri $$0) {
      return this != $$0;
   }

   protected String f() {
      if (this.f == null) {
         this.f = ac.a("enchantment", kd.f.b(this));
      }

      return this.f;
   }

   public String g() {
      return this.f();
   }

   public vf d(int $$0) {
      vt $$1 = vf.c(this.g());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(ve.u).b(vf.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cmx $$0) {
      return this.e.a($$0.d());
   }

   public void a(bmk $$0, blu $$1, int $$2) {
   }

   public void b(bmk $$0, blu $$1, int $$2) {
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
   public ih.c<cri> j() {
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
