import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ewl extends ews {
   private static final int a = 0;
   private static final int b = 1;
   private final ewq c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xl f;
   private xl g = xk.a;
   private xl h = xk.a;
   private boolean i = true;
   private boolean j = true;
   private ews.b k = ews.b.a;
   private ews.b l = ews.b.a;
   private n m = n.v;
   private ews.a n = ews.a.a;
   private final yi o;

   public ewl(ewq $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xl.b($$1);
      this.o = yi.a.a($$1).a(new xr(xr.a.a, xl.b($$1)));
   }

   public ewq a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xl c() {
      return this.f;
   }

   public xz d() {
      xz $$0 = xo.a((xl)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xl $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xl $$0) {
      this.g = $$0 == null ? xk.a : $$0;
      this.c.b(this);
   }

   public xl e() {
      return this.g;
   }

   public void c(@Nullable xl $$0) {
      this.h = $$0 == null ? xk.a : $$0;
      this.c.b(this);
   }

   public xl f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xz d(xl $$0) {
      xz $$1 = xl.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xz a(@Nullable ews $$0, xl $$1) {
      return $$0 == null ? $$1.f() : $$0.d($$1);
   }

   @Override
   public boolean h() {
      return this.i;
   }

   public void a(boolean $$0) {
      this.i = $$0;
      this.c.b(this);
   }

   @Override
   public boolean i() {
      return this.j;
   }

   public void b(boolean $$0) {
      this.j = $$0;
      this.c.b(this);
   }

   @Override
   public ews.b j() {
      return this.k;
   }

   @Override
   public ews.b k() {
      return this.l;
   }

   public void a(ews.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(ews.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public ews.a l() {
      return this.n;
   }

   public void a(ews.a $$0) {
      this.n = $$0;
      this.c.b(this);
   }

   public int m() {
      int $$0 = 0;
      if (this.h()) {
         $$0 |= 1;
      }

      if (this.i()) {
         $$0 |= 2;
      }

      return $$0;
   }

   public void a(int $$0) {
      this.a(($$0 & 1) > 0);
      this.b(($$0 & 2) > 0);
   }

   public void a(n $$0) {
      this.m = $$0;
      this.c.b(this);
   }

   @Override
   public n n() {
      return this.m;
   }
}
