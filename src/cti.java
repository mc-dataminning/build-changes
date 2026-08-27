import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cti {
   private final bnv[] b;
   private final cti.a c;
   private final auo<cou> d;
   @Nullable
   protected String a;
   private final ij.c<cti> e = kf.f.g(this);

   @Nullable
   public static cti c(int $$0) {
      return kf.f.a($$0);
   }

   protected cti(cti.a $$0, auo<cou> $$1, bnv[] $$2) {
      this.c = $$0;
      this.d = $$1;
      this.b = $$2;
   }

   public Map<bnv, coz> a(bog $$0) {
      Map<bnv, coz> $$1 = Maps.newEnumMap(bnv.class);

      for (bnv $$2 : this.b) {
         coz $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public auo<cou> d() {
      return this.d;
   }

   public cti.a e() {
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

   public int a(int $$0, bmn $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bnu<?> $$1) {
      return 0.0F;
   }

   public final boolean b(cti $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cti $$0) {
      return this != $$0;
   }

   protected String g() {
      if (this.a == null) {
         this.a = ac.a("enchantment", kf.f.b(this));
      }

      return this.a;
   }

   public String h() {
      return this.g();
   }

   public vq d(int $$0) {
      we $$1 = vq.c(this.h());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(vp.v).b(vq.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(coz $$0) {
      return $$0.d().i().a(this.d);
   }

   public void a(bog $$0, bno $$1, int $$2) {
   }

   public void b(bog $$0, bno $$1, int $$2) {
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
   public ij.c<cti> k() {
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
