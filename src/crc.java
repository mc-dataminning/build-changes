import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class crc {
   private final blu[] a;
   private final crc.a b;
   public final crd e;
   @Nullable
   protected String f;
   private final ih.c<crc> c = kd.f.f(this);

   @Nullable
   public static crc c(int $$0) {
      return kd.f.a($$0);
   }

   protected crc(crc.a $$0, crd $$1, blu[] $$2) {
      this.b = $$0;
      this.e = $$1;
      this.a = $$2;
   }

   public Map<blu, cmr> a(bmf $$0) {
      Map<blu, cmr> $$1 = Maps.newEnumMap(blu.class);

      for (blu $$2 : this.a) {
         cmr $$3 = $$0.c($$2);
         if (!$$3.b()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public crc.a d() {
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

   public int a(int $$0, bkn $$1) {
      return 0;
   }

   public float a(int $$0, bmk $$1) {
      return 0.0F;
   }

   public final boolean b(crc $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(crc $$0) {
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

   public vd d(int $$0) {
      vr $$1 = vd.c(this.g());
      if (this.c()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.a() != 1) {
         $$1.b(vc.u).b(vd.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean a(cmr $$0) {
      return this.e.a($$0.d());
   }

   public void a(bmf $$0, blp $$1, int $$2) {
   }

   public void b(bmf $$0, blp $$1, int $$2) {
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
   public ih.c<crc> j() {
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
