import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eqq extends eqx {
   private static final int a = 0;
   private static final int b = 1;
   private final eqv c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private vu f;
   private vu g = vt.a;
   private vu h = vt.a;
   private boolean i = true;
   private boolean j = true;
   private eqx.b k = eqx.b.a;
   private eqx.b l = eqx.b.a;
   private n m = n.v;
   private eqx.a n = eqx.a.a;
   private final wr o;

   public eqq(eqv $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = vu.b($$1);
      this.o = wr.a.a($$1).a(new wa(wa.a.a, vu.b($$1)));
   }

   public eqv a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public vu c() {
      return this.f;
   }

   public wi d() {
      wi $$0 = vx.a((vu)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(vu $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable vu $$0) {
      this.g = $$0 == null ? vt.a : $$0;
      this.c.b(this);
   }

   public vu e() {
      return this.g;
   }

   public void c(@Nullable vu $$0) {
      this.h = $$0 == null ? vt.a : $$0;
      this.c.b(this);
   }

   public vu f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public wi d(vu $$0) {
      wi $$1 = vu.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static wi a(@Nullable eqx $$0, vu $$1) {
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
   public eqx.b j() {
      return this.k;
   }

   @Override
   public eqx.b k() {
      return this.l;
   }

   public void a(eqx.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eqx.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eqx.a l() {
      return this.n;
   }

   public void a(eqx.a $$0) {
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
