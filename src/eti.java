import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eti extends etp {
   private static final int a = 0;
   private static final int b = 1;
   private final etn c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wi f;
   private wi g = wh.a;
   private wi h = wh.a;
   private boolean i = true;
   private boolean j = true;
   private etp.b k = etp.b.a;
   private etp.b l = etp.b.a;
   private n m = n.v;
   private etp.a n = etp.a.a;
   private final xf o;

   public eti(etn $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wi.b($$1);
      this.o = xf.a.a($$1).a(new wo(wo.a.a, wi.b($$1)));
   }

   public etn a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wi c() {
      return this.f;
   }

   public ww d() {
      ww $$0 = wl.a((wi)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wi $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wi $$0) {
      this.g = $$0 == null ? wh.a : $$0;
      this.c.b(this);
   }

   public wi e() {
      return this.g;
   }

   public void c(@Nullable wi $$0) {
      this.h = $$0 == null ? wh.a : $$0;
      this.c.b(this);
   }

   public wi f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public ww d(wi $$0) {
      ww $$1 = wi.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static ww a(@Nullable etp $$0, wi $$1) {
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
   public etp.b j() {
      return this.k;
   }

   @Override
   public etp.b k() {
      return this.l;
   }

   public void a(etp.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(etp.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public etp.a l() {
      return this.n;
   }

   public void a(etp.a $$0) {
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
