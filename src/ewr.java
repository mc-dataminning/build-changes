import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ewr extends ewy {
   private static final int a = 0;
   private static final int b = 1;
   private final eww c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xp f;
   private xp g = xo.a;
   private xp h = xo.a;
   private boolean i = true;
   private boolean j = true;
   private ewy.b k = ewy.b.a;
   private ewy.b l = ewy.b.a;
   private n m = n.v;
   private ewy.a n = ewy.a.a;
   private final ym o;

   public ewr(eww $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xp.b($$1);
      this.o = ym.a.a($$1).a(new xv(xv.a.a, xp.b($$1)));
   }

   public eww a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xp c() {
      return this.f;
   }

   public yd d() {
      yd $$0 = xs.a((xp)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xp $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xp $$0) {
      this.g = $$0 == null ? xo.a : $$0;
      this.c.b(this);
   }

   public xp e() {
      return this.g;
   }

   public void c(@Nullable xp $$0) {
      this.h = $$0 == null ? xo.a : $$0;
      this.c.b(this);
   }

   public xp f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public yd d(xp $$0) {
      yd $$1 = xp.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static yd a(@Nullable ewy $$0, xp $$1) {
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
   public ewy.b j() {
      return this.k;
   }

   @Override
   public ewy.b k() {
      return this.l;
   }

   public void a(ewy.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(ewy.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public ewy.a l() {
      return this.n;
   }

   public void a(ewy.a $$0) {
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
