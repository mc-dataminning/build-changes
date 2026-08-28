import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class fay extends fbf {
   private static final int a = 0;
   private static final int b = 1;
   private final fbd c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xj f;
   private xj g = xi.a;
   private xj h = xi.a;
   private boolean i = true;
   private boolean j = true;
   private fbf.b k = fbf.b.a;
   private fbf.b l = fbf.b.a;
   private n m = n.v;
   private fbf.a n = fbf.a.a;
   private final yg o;

   public fay(fbd $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xj.b($$1);
      this.o = yg.a.a($$1).a(new xp(xp.a.a, xj.b($$1)));
   }

   public fbd a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xj c() {
      return this.f;
   }

   public xx d() {
      xx $$0 = xm.a((xj)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xj $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xj $$0) {
      this.g = $$0 == null ? xi.a : $$0;
      this.c.b(this);
   }

   public xj e() {
      return this.g;
   }

   public void c(@Nullable xj $$0) {
      this.h = $$0 == null ? xi.a : $$0;
      this.c.b(this);
   }

   public xj f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xx d(xj $$0) {
      xx $$1 = xj.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xx a(@Nullable fbf $$0, xj $$1) {
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
   public fbf.b j() {
      return this.k;
   }

   @Override
   public fbf.b k() {
      return this.l;
   }

   public void a(fbf.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fbf.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fbf.a l() {
      return this.n;
   }

   public void a(fbf.a $$0) {
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
