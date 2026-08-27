import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class ctm {
   private final bnx[] b;
   private final ctm.a c;
   private final aup<coy> d;
   @Nullable
   protected String a;
   private final ij.c<ctm> e = kf.f.g(this);

   @Nullable
   public static ctm c(int $$0) {
      return kf.f.a($$0);
   }

   protected ctm(ctm.a $$0, aup<coy> $$1, bnx[] $$2) {
      this.c = $$0;
      this.d = $$1;
      this.b = $$2;
   }

   public Map<bnx, cpd> a(boi $$0) {
      Map<bnx, cpd> $$1 = Maps.newEnumMap(bnx.class);

      for (bnx $$2 : this.b) {
         cpd $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public aup<coy> d() {
      return this.d;
   }

   public ctm.a e() {
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

   public int a(int $$0, bmp $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bnw<?> $$1) {
      return 0.0F;
   }

   public final boolean b(ctm $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(ctm $$0) {
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

   public boolean a(cpd $$0) {
      return $$0.d().i().a(this.d);
   }

   public void a(boi $$0, bnq $$1, int $$2) {
   }

   public void b(boi $$0, bnq $$1, int $$2) {
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
   public ij.c<ctm> k() {
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
