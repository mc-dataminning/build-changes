import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyz implements cog {
   private final cyz.b b;
   @Nullable
   protected String a;
   private final ix.c<cyz> c = le.f.f(this);

   public static cyz.a a(int $$0) {
      return new cyz.a($$0, 0);
   }

   public static cyz.a a(int $$0, int $$1) {
      return new cyz.a($$0, $$1);
   }

   public static cyz.b a(awl<ctj> $$0, awl<ctj> $$1, int $$2, int $$3, cyz.a $$4, cyz.a $$5, int $$6, bsb... $$7) {
      return new cyz.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, col.h, $$7);
   }

   public static cyz.b a(awl<ctj> $$0, int $$1, int $$2, cyz.a $$3, cyz.a $$4, int $$5, bsb... $$6) {
      return new cyz.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, col.h, $$6);
   }

   public static cyz.b a(awl<ctj> $$0, int $$1, int $$2, cyz.a $$3, cyz.a $$4, int $$5, coj $$6, bsb... $$7) {
      return new cyz.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   public static cyz b(int $$0) {
      return le.f.a($$0);
   }

   public cyz(cyz.b $$0) {
      this.b = $$0;
   }

   public Map<bsb, cto> a(bso $$0) {
      Map<bsb, cto> $$1 = Maps.newEnumMap(bsb.class);

      for (bsb $$2 : this.b.i()) {
         cto $$3 = $$0.a($$2);
         if (!$$3.e()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final awl<ctj> c() {
      return this.b.a();
   }

   public final boolean a(cto $$0) {
      return this.b.b.isEmpty() || $$0.a(this.b.b.get());
   }

   public final int d() {
      return this.b.c();
   }

   public final int e() {
      return this.b.g();
   }

   public final int f() {
      return 1;
   }

   public final int g() {
      return this.b.d();
   }

   public final int c(int $$0) {
      return this.b.e().a($$0);
   }

   public final int d(int $$0) {
      return this.b.f().a($$0);
   }

   public int a(int $$0, bqn $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bsa<?> $$1) {
      return 0.0F;
   }

   public final boolean b(cyz $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(cyz $$0) {
      return this != $$0;
   }

   protected String h() {
      if (this.a == null) {
         this.a = ac.a("enchantment", le.f.b(this));
      }

      return this.a;
   }

   public String j() {
      return this.h();
   }

   public wx e(int $$0) {
      xl $$1 = wx.c(this.j());
      if (this.b()) {
         $$1.a(n.m);
      } else {
         $$1.a(n.h);
      }

      if ($$0 != 1 || this.g() != 1) {
         $$1.b(ww.v).b(wx.c("enchantment.level." + $$0));
      }

      return $$1;
   }

   public boolean b(cto $$0) {
      return $$0.g().n().a(this.b.a());
   }

   public void a(bso $$0, bru $$1, int $$2) {
   }

   public void b(bso $$0, bru $$1, int $$2) {
   }

   public void c(bso $$0, bru $$1, int $$2) {
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean k() {
      return true;
   }

   public boolean l() {
      return true;
   }

   @Deprecated
   public ix.c<cyz> m() {
      return this.c;
   }

   @Override
   public coj i() {
      return this.b.h();
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(awl<ctj> a, Optional<awl<ctj>> b, int c, int d, cyz.a e, cyz.a f, int g, coj h, bsb[] i) {
   }
}
