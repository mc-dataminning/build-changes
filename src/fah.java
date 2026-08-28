import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class fah extends fao {
   private static final int a = 0;
   private static final int b = 1;
   private final fam c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xh f;
   private xh g = xg.a;
   private xh h = xg.a;
   private boolean i = true;
   private boolean j = true;
   private fao.b k = fao.b.a;
   private fao.b l = fao.b.a;
   private n m = n.v;
   private fao.a n = fao.a.a;
   private final ye o;

   public fah(fam $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xh.b($$1);
      this.o = ye.a.a($$1).a(new xn(xn.a.a, xh.b($$1)));
   }

   public fam a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xh c() {
      return this.f;
   }

   public xv d() {
      xv $$0 = xk.a((xh)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xh $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xh $$0) {
      this.g = $$0 == null ? xg.a : $$0;
      this.c.b(this);
   }

   public xh e() {
      return this.g;
   }

   public void c(@Nullable xh $$0) {
      this.h = $$0 == null ? xg.a : $$0;
      this.c.b(this);
   }

   public xh f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xv d(xh $$0) {
      xv $$1 = xh.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xv a(@Nullable fao $$0, xh $$1) {
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
   public fao.b j() {
      return this.k;
   }

   @Override
   public fao.b k() {
      return this.l;
   }

   public void a(fao.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fao.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fao.a l() {
      return this.n;
   }

   public void a(fao.a $$0) {
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
