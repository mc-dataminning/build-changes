import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eif extends eij {
   private static final int a = 0;
   private static final int b = 1;
   private final eih c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private ti f;
   private ti g = th.a;
   private ti h = th.a;
   private boolean i = true;
   private boolean j = true;
   private eij.b k = eij.b.a;
   private eij.b l = eij.b.a;
   private n m = n.v;
   private eij.a n = eij.a.a;
   private final ue o;

   public eif(eih $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = ti.b($$1);
      this.o = ue.a.a($$1).a(new tn(tn.a.a, ti.b($$1)));
   }

   public eih a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public ti c() {
      return this.f;
   }

   public tv d() {
      tv $$0 = tk.a((ti)this.f.e().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(ti $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable ti $$0) {
      this.g = $$0 == null ? th.a : $$0;
      this.c.b(this);
   }

   public ti e() {
      return this.g;
   }

   public void c(@Nullable ti $$0) {
      this.h = $$0 == null ? th.a : $$0;
      this.c.b(this);
   }

   public ti f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public tv d(ti $$0) {
      tv $$1 = ti.h().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static tv a(@Nullable eij $$0, ti $$1) {
      return $$0 == null ? $$1.e() : $$0.d($$1);
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
   public eij.b j() {
      return this.k;
   }

   @Override
   public eij.b k() {
      return this.l;
   }

   public void a(eij.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eij.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eij.a l() {
      return this.n;
   }

   public void a(eij.a $$0) {
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
