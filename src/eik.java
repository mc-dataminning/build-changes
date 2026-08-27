import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eik extends eio {
   private static final int a = 0;
   private static final int b = 1;
   private final eim c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private tl f;
   private tl g = tk.a;
   private tl h = tk.a;
   private boolean i = true;
   private boolean j = true;
   private eio.b k = eio.b.a;
   private eio.b l = eio.b.a;
   private n m = n.v;
   private eio.a n = eio.a.a;
   private final uh o;

   public eik(eim $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = tl.b($$1);
      this.o = uh.a.a($$1).a(new tq(tq.a.a, tl.b($$1)));
   }

   public eim a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public tl c() {
      return this.f;
   }

   public ty d() {
      ty $$0 = tn.a((tl)this.f.e().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(tl $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable tl $$0) {
      this.g = $$0 == null ? tk.a : $$0;
      this.c.b(this);
   }

   public tl e() {
      return this.g;
   }

   public void c(@Nullable tl $$0) {
      this.h = $$0 == null ? tk.a : $$0;
      this.c.b(this);
   }

   public tl f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public ty d(tl $$0) {
      ty $$1 = tl.h().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static ty a(@Nullable eio $$0, tl $$1) {
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
   public eio.b j() {
      return this.k;
   }

   @Override
   public eio.b k() {
      return this.l;
   }

   public void a(eio.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eio.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eio.a l() {
      return this.n;
   }

   public void a(eio.a $$0) {
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
