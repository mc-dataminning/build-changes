import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eor extends eoy {
   private static final int a = 0;
   private static final int b = 1;
   private final eow c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private vq f;
   private vq g = vp.a;
   private vq h = vp.a;
   private boolean i = true;
   private boolean j = true;
   private eoy.b k = eoy.b.a;
   private eoy.b l = eoy.b.a;
   private n m = n.v;
   private eoy.a n = eoy.a.a;
   private final wn o;

   public eor(eow $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = vq.b($$1);
      this.o = wn.a.a($$1).a(new vw(vw.a.a, vq.b($$1)));
   }

   public eow a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public vq c() {
      return this.f;
   }

   public we d() {
      we $$0 = vt.a((vq)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(vq $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable vq $$0) {
      this.g = $$0 == null ? vp.a : $$0;
      this.c.b(this);
   }

   public vq e() {
      return this.g;
   }

   public void c(@Nullable vq $$0) {
      this.h = $$0 == null ? vp.a : $$0;
      this.c.b(this);
   }

   public vq f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public we d(vq $$0) {
      we $$1 = vq.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static we a(@Nullable eoy $$0, vq $$1) {
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
   public eoy.b j() {
      return this.k;
   }

   @Override
   public eoy.b k() {
      return this.l;
   }

   public void a(eoy.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eoy.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eoy.a l() {
      return this.n;
   }

   public void a(eoy.a $$0) {
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
