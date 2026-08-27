import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eim extends eiq {
   private static final int a = 0;
   private static final int b = 1;
   private final eio c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private tn f;
   private tn g = tm.a;
   private tn h = tm.a;
   private boolean i = true;
   private boolean j = true;
   private eiq.b k = eiq.b.a;
   private eiq.b l = eiq.b.a;
   private n m = n.v;
   private eiq.a n = eiq.a.a;
   private final uj o;

   public eim(eio $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = tn.b($$1);
      this.o = uj.a.a($$1).a(new ts(ts.a.a, tn.b($$1)));
   }

   public eio a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public tn c() {
      return this.f;
   }

   public ua d() {
      ua $$0 = tp.a((tn)this.f.e().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(tn $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable tn $$0) {
      this.g = $$0 == null ? tm.a : $$0;
      this.c.b(this);
   }

   public tn e() {
      return this.g;
   }

   public void c(@Nullable tn $$0) {
      this.h = $$0 == null ? tm.a : $$0;
      this.c.b(this);
   }

   public tn f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public ua d(tn $$0) {
      ua $$1 = tn.h().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static ua a(@Nullable eiq $$0, tn $$1) {
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
   public eiq.b j() {
      return this.k;
   }

   @Override
   public eiq.b k() {
      return this.l;
   }

   public void a(eiq.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eiq.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eiq.a l() {
      return this.n;
   }

   public void a(eiq.a $$0) {
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
