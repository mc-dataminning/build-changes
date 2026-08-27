import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class esz extends etg {
   private static final int a = 0;
   private static final int b = 1;
   private final ete c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wg f;
   private wg g = wf.a;
   private wg h = wf.a;
   private boolean i = true;
   private boolean j = true;
   private etg.b k = etg.b.a;
   private etg.b l = etg.b.a;
   private n m = n.v;
   private etg.a n = etg.a.a;
   private final xd o;

   public esz(ete $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wg.b($$1);
      this.o = xd.a.a($$1).a(new wm(wm.a.a, wg.b($$1)));
   }

   public ete a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wg c() {
      return this.f;
   }

   public wu d() {
      wu $$0 = wj.a((wg)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wg $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wg $$0) {
      this.g = $$0 == null ? wf.a : $$0;
      this.c.b(this);
   }

   public wg e() {
      return this.g;
   }

   public void c(@Nullable wg $$0) {
      this.h = $$0 == null ? wf.a : $$0;
      this.c.b(this);
   }

   public wg f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public wu d(wg $$0) {
      wu $$1 = wg.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static wu a(@Nullable etg $$0, wg $$1) {
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
   public etg.b j() {
      return this.k;
   }

   @Override
   public etg.b k() {
      return this.l;
   }

   public void a(etg.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(etg.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public etg.a l() {
      return this.n;
   }

   public void a(etg.a $$0) {
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
