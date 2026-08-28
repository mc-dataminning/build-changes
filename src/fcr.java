import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class fcr extends fcy {
   private static final int a = 0;
   private static final int b = 1;
   private final fcw c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xk f;
   private xk g = xj.a;
   private xk h = xj.a;
   private boolean i = true;
   private boolean j = true;
   private fcy.b k = fcy.b.a;
   private fcy.b l = fcy.b.a;
   private n m = n.v;
   private fcy.a n = fcy.a.a;
   private final yh o;

   public fcr(fcw $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xk.b($$1);
      this.o = yh.a.a($$1).a(new xq(xq.a.a, xk.b($$1)));
   }

   public fcw a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xk c() {
      return this.f;
   }

   public xy d() {
      xy $$0 = xn.a((xk)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xk $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xk $$0) {
      this.g = $$0 == null ? xj.a : $$0;
      this.c.b(this);
   }

   public xk e() {
      return this.g;
   }

   public void c(@Nullable xk $$0) {
      this.h = $$0 == null ? xj.a : $$0;
      this.c.b(this);
   }

   public xk f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xy d(xk $$0) {
      xy $$1 = xk.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xy a(@Nullable fcy $$0, xk $$1) {
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
   public fcy.b j() {
      return this.k;
   }

   @Override
   public fcy.b k() {
      return this.l;
   }

   public void a(fcy.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fcy.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fcy.a l() {
      return this.n;
   }

   public void a(fcy.a $$0) {
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
