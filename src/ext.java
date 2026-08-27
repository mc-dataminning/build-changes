import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ext extends eya {
   private static final int a = 0;
   private static final int b = 1;
   private final exy c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xe f;
   private xe g = xd.a;
   private xe h = xd.a;
   private boolean i = true;
   private boolean j = true;
   private eya.b k = eya.b.a;
   private eya.b l = eya.b.a;
   private n m = n.v;
   private eya.a n = eya.a.a;
   private final yb o;

   public ext(exy $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xe.b($$1);
      this.o = yb.a.a($$1).a(new xk(xk.a.a, xe.b($$1)));
   }

   public exy a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xe c() {
      return this.f;
   }

   public xs d() {
      xs $$0 = xh.a((xe)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xe $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xe $$0) {
      this.g = $$0 == null ? xd.a : $$0;
      this.c.b(this);
   }

   public xe e() {
      return this.g;
   }

   public void c(@Nullable xe $$0) {
      this.h = $$0 == null ? xd.a : $$0;
      this.c.b(this);
   }

   public xe f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xs d(xe $$0) {
      xs $$1 = xe.i().a(this.g).a($$0).a(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xs a(@Nullable eya $$0, xe $$1) {
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
   public eya.b j() {
      return this.k;
   }

   @Override
   public eya.b k() {
      return this.l;
   }

   public void a(eya.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eya.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eya.a l() {
      return this.n;
   }

   public void a(eya.a $$0) {
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
