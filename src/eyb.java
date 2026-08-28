import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eyb extends eyi {
   private static final int a = 0;
   private static final int b = 1;
   private final eyg c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wz f;
   private wz g = wy.a;
   private wz h = wy.a;
   private boolean i = true;
   private boolean j = true;
   private eyi.b k = eyi.b.a;
   private eyi.b l = eyi.b.a;
   private n m = n.v;
   private eyi.a n = eyi.a.a;
   private final xw o;

   public eyb(eyg $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wz.b($$1);
      this.o = xw.a.a($$1).a(new xf(xf.a.a, wz.b($$1)));
   }

   public eyg a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wz c() {
      return this.f;
   }

   public xn d() {
      xn $$0 = xc.a((wz)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wz $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wz $$0) {
      this.g = $$0 == null ? wy.a : $$0;
      this.c.b(this);
   }

   public wz e() {
      return this.g;
   }

   public void c(@Nullable wz $$0) {
      this.h = $$0 == null ? wy.a : $$0;
      this.c.b(this);
   }

   public wz f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xn d(wz $$0) {
      xn $$1 = wz.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xn a(@Nullable eyi $$0, wz $$1) {
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
   public eyi.b j() {
      return this.k;
   }

   @Override
   public eyi.b k() {
      return this.l;
   }

   public void a(eyi.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eyi.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eyi.a l() {
      return this.n;
   }

   public void a(eyi.a $$0) {
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
