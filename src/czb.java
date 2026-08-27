import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class czb implements coi {
   private final czb.b b;
   @Nullable
   protected String a;
   private final ix.c<czb> c = le.f.f(this);

   public static czb.a a(int $$0) {
      return new czb.a($$0, 0);
   }

   public static czb.a a(int $$0, int $$1) {
      return new czb.a($$0, $$1);
   }

   public static czb.b a(awm<ctl> $$0, awm<ctl> $$1, int $$2, int $$3, czb.a $$4, czb.a $$5, int $$6, bsd... $$7) {
      return new czb.b($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, coo.h, $$7);
   }

   public static czb.b a(awm<ctl> $$0, int $$1, int $$2, czb.a $$3, czb.a $$4, int $$5, bsd... $$6) {
      return new czb.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, coo.h, $$6);
   }

   public static czb.b a(awm<ctl> $$0, int $$1, int $$2, czb.a $$3, czb.a $$4, int $$5, col $$6, bsd... $$7) {
      return new czb.b($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   public static czb b(int $$0) {
      return le.f.a($$0);
   }

   public czb(czb.b $$0) {
      this.b = $$0;
   }

   public Map<bsd, ctq> a(bsq $$0) {
      Map<bsd, ctq> $$1 = Maps.newEnumMap(bsd.class);

      for (bsd $$2 : this.b.i()) {
         ctq $$3 = $$0.a($$2);
         if (!$$3.e()) {
            $$1.put($$2, $$3);
         }
      }

      return $$1;
   }

   public final awm<ctl> c() {
      return this.b.a();
   }

   public final boolean a(ctq $$0) {
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

   public int a(int $$0, bqp $$1) {
      return 0;
   }

   public float a(int $$0, @Nullable bsc<?> $$1) {
      return 0.0F;
   }

   public final boolean b(czb $$0) {
      return this.a($$0) && $$0.a(this);
   }

   protected boolean a(czb $$0) {
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

   public boolean b(ctq $$0) {
      return $$0.g().o().a(this.b.a());
   }

   public void a(bsq $$0, brw $$1, int $$2) {
   }

   public void b(bsq $$0, brw $$1, int $$2) {
   }

   public void c(bsq $$0, brw $$1, int $$2) {
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
   public ix.c<czb> m() {
      return this.c;
   }

   @Override
   public col i() {
      return this.b.h();
   }

   public static record a(int a, int b) {
      public int a(int $$0) {
         return this.a + this.b * ($$0 - 1);
      }
   }

   public static record b(awm<ctl> a, Optional<awm<ctl>> b, int c, int d, czb.a e, czb.a f, int g, col h, bsd[] i) {
   }
}
