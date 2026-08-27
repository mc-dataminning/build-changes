import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eic extends eig {
   private static final int a = 0;
   private static final int b = 1;
   private final eie c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private te f;
   private te g = td.a;
   private te h = td.a;
   private boolean i = true;
   private boolean j = true;
   private eig.b k = eig.b.a;
   private eig.b l = eig.b.a;
   private n m = n.v;
   private eig.a n = eig.a.a;
   private final ua o;

   public eic(eie $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = te.b($$1);
      this.o = ua.a.a($$1).a(new tj(tj.a.a, te.b($$1)));
   }

   public eie a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public te c() {
      return this.f;
   }

   public tr d() {
      tr $$0 = tg.a((te)this.f.e().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(te $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable te $$0) {
      this.g = $$0 == null ? td.a : $$0;
      this.c.b(this);
   }

   public te e() {
      return this.g;
   }

   public void c(@Nullable te $$0) {
      this.h = $$0 == null ? td.a : $$0;
      this.c.b(this);
   }

   public te f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public tr d(te $$0) {
      tr $$1 = te.h().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static tr a(@Nullable eig $$0, te $$1) {
      return $$0 == null ? $$1.e() : $$0.d($$1);
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
   public eig.b j() {
      return this.k;
   }

   @Override
   public eig.b k() {
      return this.l;
   }

   public void a(eig.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eig.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eig.a l() {
      return this.n;
   }

   public void a(eig.a $$0) {
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
