import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class few extends ffd {
   private static final int a = 0;
   private static final int b = 1;
   private final ffb c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private ww f;
   private ww g = wv.a;
   private ww h = wv.a;
   private boolean i = true;
   private boolean j = true;
   private ffd.b k = ffd.b.a;
   private ffd.b l = ffd.b.a;
   private n m = n.v;
   private ffd.a n = ffd.a.a;
   private final xt o;

   public few(ffb $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = ww.b($$1);
      this.o = xt.a.a($$1).a(new xc.e(ww.b($$1)));
   }

   public ffb a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public ww c() {
      return this.f;
   }

   public xk d() {
      xk $$0 = wz.a((ww)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(ww $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable ww $$0) {
      this.g = $$0 == null ? wv.a : $$0;
      this.c.b(this);
   }

   public ww e() {
      return this.g;
   }

   public void c(@Nullable ww $$0) {
      this.h = $$0 == null ? wv.a : $$0;
      this.c.b(this);
   }

   public ww f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xk d(ww $$0) {
      xk $$1 = ww.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xk a(@Nullable ffd $$0, ww $$1) {
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
   public ffd.b j() {
      return this.k;
   }

   @Override
   public ffd.b k() {
      return this.l;
   }

   public void a(ffd.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(ffd.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public ffd.a l() {
      return this.n;
   }

   public void a(ffd.a $$0) {
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
