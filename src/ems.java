import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ems extends emz {
   private static final int a = 0;
   private static final int b = 1;
   private final emx c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private vf f;
   private vf g = ve.a;
   private vf h = ve.a;
   private boolean i = true;
   private boolean j = true;
   private emz.b k = emz.b.a;
   private emz.b l = emz.b.a;
   private n m = n.v;
   private emz.a n = emz.a.a;
   private final wc o;

   public ems(emx $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = vf.b($$1);
      this.o = wc.a.a($$1).a(new vl(vl.a.a, vf.b($$1)));
   }

   public emx a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public vf c() {
      return this.f;
   }

   public vt d() {
      vt $$0 = vi.a((vf)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(vf $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable vf $$0) {
      this.g = $$0 == null ? ve.a : $$0;
      this.c.b(this);
   }

   public vf e() {
      return this.g;
   }

   public void c(@Nullable vf $$0) {
      this.h = $$0 == null ? ve.a : $$0;
      this.c.b(this);
   }

   public vf f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public vt d(vf $$0) {
      vt $$1 = vf.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static vt a(@Nullable emz $$0, vf $$1) {
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
   public emz.b j() {
      return this.k;
   }

   @Override
   public emz.b k() {
      return this.l;
   }

   public void a(emz.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(emz.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public emz.a l() {
      return this.n;
   }

   public void a(emz.a $$0) {
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
