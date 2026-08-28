import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class fca extends fch {
   private static final int a = 0;
   private static final int b = 1;
   private final fcf c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wo f;
   private wo g = wn.a;
   private wo h = wn.a;
   private boolean i = true;
   private boolean j = true;
   private fch.b k = fch.b.a;
   private fch.b l = fch.b.a;
   private n m = n.v;
   private fch.a n = fch.a.a;
   private final xl o;

   public fca(fcf $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wo.b($$1);
      this.o = xl.a.a($$1).a(new wu(wu.a.a, wo.b($$1)));
   }

   public fcf a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wo c() {
      return this.f;
   }

   public xc d() {
      xc $$0 = wr.a((wo)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wo $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wo $$0) {
      this.g = $$0 == null ? wn.a : $$0;
      this.c.b(this);
   }

   public wo e() {
      return this.g;
   }

   public void c(@Nullable wo $$0) {
      this.h = $$0 == null ? wn.a : $$0;
      this.c.b(this);
   }

   public wo f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xc d(wo $$0) {
      xc $$1 = wo.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xc a(@Nullable fch $$0, wo $$1) {
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
   public fch.b j() {
      return this.k;
   }

   @Override
   public fch.b k() {
      return this.l;
   }

   public void a(fch.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fch.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fch.a l() {
      return this.n;
   }

   public void a(fch.a $$0) {
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
