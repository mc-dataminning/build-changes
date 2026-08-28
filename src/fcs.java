import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class fcs extends fcz {
   private static final int a = 0;
   private static final int b = 1;
   private final fcx c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xv f;
   private xv g = xu.a;
   private xv h = xu.a;
   private boolean i = true;
   private boolean j = true;
   private fcz.b k = fcz.b.a;
   private fcz.b l = fcz.b.a;
   private n m = n.v;
   private fcz.a n = fcz.a.a;
   private final ys o;

   public fcs(fcx $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xv.b($$1);
      this.o = ys.a.a($$1).a(new yb(yb.a.a, xv.b($$1)));
   }

   public fcx a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xv c() {
      return this.f;
   }

   public yj d() {
      yj $$0 = xy.a((xv)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xv $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xv $$0) {
      this.g = $$0 == null ? xu.a : $$0;
      this.c.b(this);
   }

   public xv e() {
      return this.g;
   }

   public void c(@Nullable xv $$0) {
      this.h = $$0 == null ? xu.a : $$0;
      this.c.b(this);
   }

   public xv f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public yj d(xv $$0) {
      yj $$1 = xv.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static yj a(@Nullable fcz $$0, xv $$1) {
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
   public fcz.b j() {
      return this.k;
   }

   @Override
   public fcz.b k() {
      return this.l;
   }

   public void a(fcz.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fcz.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fcz.a l() {
      return this.n;
   }

   public void a(fcz.a $$0) {
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
