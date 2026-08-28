import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ezs extends ezz {
   private static final int a = 0;
   private static final int b = 1;
   private final ezx c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xd f;
   private xd g = xc.a;
   private xd h = xc.a;
   private boolean i = true;
   private boolean j = true;
   private ezz.b k = ezz.b.a;
   private ezz.b l = ezz.b.a;
   private n m = n.v;
   private ezz.a n = ezz.a.a;
   private final ya o;

   public ezs(ezx $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xd.b($$1);
      this.o = ya.a.a($$1).a(new xj(xj.a.a, xd.b($$1)));
   }

   public ezx a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xd c() {
      return this.f;
   }

   public xr d() {
      xr $$0 = xg.a((xd)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xd $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xd $$0) {
      this.g = $$0 == null ? xc.a : $$0;
      this.c.b(this);
   }

   public xd e() {
      return this.g;
   }

   public void c(@Nullable xd $$0) {
      this.h = $$0 == null ? xc.a : $$0;
      this.c.b(this);
   }

   public xd f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xr d(xd $$0) {
      xr $$1 = xd.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xr a(@Nullable ezz $$0, xd $$1) {
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
   public ezz.b j() {
      return this.k;
   }

   @Override
   public ezz.b k() {
      return this.l;
   }

   public void a(ezz.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(ezz.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public ezz.a l() {
      return this.n;
   }

   public void a(ezz.a $$0) {
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
