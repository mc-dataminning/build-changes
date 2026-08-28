import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class fcx extends fde {
   private static final int a = 0;
   private static final int b = 1;
   private final fdc c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wp f;
   private wp g = wo.a;
   private wp h = wo.a;
   private boolean i = true;
   private boolean j = true;
   private fde.b k = fde.b.a;
   private fde.b l = fde.b.a;
   private n m = n.v;
   private fde.a n = fde.a.a;
   private final xm o;

   public fcx(fdc $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wp.b($$1);
      this.o = xm.a.a($$1).a(new wv.e(wp.b($$1)));
   }

   public fdc a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wp c() {
      return this.f;
   }

   public xd d() {
      xd $$0 = ws.a((wp)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wp $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wp $$0) {
      this.g = $$0 == null ? wo.a : $$0;
      this.c.b(this);
   }

   public wp e() {
      return this.g;
   }

   public void c(@Nullable wp $$0) {
      this.h = $$0 == null ? wo.a : $$0;
      this.c.b(this);
   }

   public wp f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xd d(wp $$0) {
      xd $$1 = wp.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xd a(@Nullable fde $$0, wp $$1) {
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
   public fde.b j() {
      return this.k;
   }

   @Override
   public fde.b k() {
      return this.l;
   }

   public void a(fde.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fde.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fde.a l() {
      return this.n;
   }

   public void a(fde.a $$0) {
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
