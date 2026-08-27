import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ekf extends ekj {
   private static final int a = 0;
   private static final int b = 1;
   private final ekh c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private ur f;
   private ur g = uq.a;
   private ur h = uq.a;
   private boolean i = true;
   private boolean j = true;
   private ekj.b k = ekj.b.a;
   private ekj.b l = ekj.b.a;
   private n m = n.v;
   private ekj.a n = ekj.a.a;
   private final vo o;

   public ekf(ekh $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = ur.b($$1);
      this.o = vo.a.a($$1).a(new ux(ux.a.a, ur.b($$1)));
   }

   public ekh a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public ur c() {
      return this.f;
   }

   public vf d() {
      vf $$0 = uu.a((ur)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(ur $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable ur $$0) {
      this.g = $$0 == null ? uq.a : $$0;
      this.c.b(this);
   }

   public ur e() {
      return this.g;
   }

   public void c(@Nullable ur $$0) {
      this.h = $$0 == null ? uq.a : $$0;
      this.c.b(this);
   }

   public ur f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public vf d(ur $$0) {
      vf $$1 = ur.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static vf a(@Nullable ekj $$0, ur $$1) {
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
   public ekj.b j() {
      return this.k;
   }

   @Override
   public ekj.b k() {
      return this.l;
   }

   public void a(ekj.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(ekj.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public ekj.a l() {
      return this.n;
   }

   public void a(ekj.a $$0) {
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
