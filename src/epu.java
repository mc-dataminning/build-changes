import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class epu extends eqb {
   private static final int a = 0;
   private static final int b = 1;
   private final epz c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private vs f;
   private vs g = vr.a;
   private vs h = vr.a;
   private boolean i = true;
   private boolean j = true;
   private eqb.b k = eqb.b.a;
   private eqb.b l = eqb.b.a;
   private n m = n.v;
   private eqb.a n = eqb.a.a;
   private final wp o;

   public epu(epz $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = vs.b($$1);
      this.o = wp.a.a($$1).a(new vy(vy.a.a, vs.b($$1)));
   }

   public epz a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public vs c() {
      return this.f;
   }

   public wg d() {
      wg $$0 = vv.a((vs)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(vs $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable vs $$0) {
      this.g = $$0 == null ? vr.a : $$0;
      this.c.b(this);
   }

   public vs e() {
      return this.g;
   }

   public void c(@Nullable vs $$0) {
      this.h = $$0 == null ? vr.a : $$0;
      this.c.b(this);
   }

   public vs f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public wg d(vs $$0) {
      wg $$1 = vs.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static wg a(@Nullable eqb $$0, vs $$1) {
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
   public eqb.b j() {
      return this.k;
   }

   @Override
   public eqb.b k() {
      return this.l;
   }

   public void a(eqb.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eqb.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eqb.a l() {
      return this.n;
   }

   public void a(eqb.a $$0) {
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
