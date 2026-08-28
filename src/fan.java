import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class fan extends fau {
   private static final int a = 0;
   private static final int b = 1;
   private final fas c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xi f;
   private xi g = xh.a;
   private xi h = xh.a;
   private boolean i = true;
   private boolean j = true;
   private fau.b k = fau.b.a;
   private fau.b l = fau.b.a;
   private n m = n.v;
   private fau.a n = fau.a.a;
   private final yf o;

   public fan(fas $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xi.b($$1);
      this.o = yf.a.a($$1).a(new xo(xo.a.a, xi.b($$1)));
   }

   public fas a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public xi c() {
      return this.f;
   }

   public xw d() {
      xw $$0 = xl.a((xi)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xi $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xi $$0) {
      this.g = $$0 == null ? xh.a : $$0;
      this.c.b(this);
   }

   public xi e() {
      return this.g;
   }

   public void c(@Nullable xi $$0) {
      this.h = $$0 == null ? xh.a : $$0;
      this.c.b(this);
   }

   public xi f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xw d(xi $$0) {
      xw $$1 = xi.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xw a(@Nullable fau $$0, xi $$1) {
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
   public fau.b j() {
      return this.k;
   }

   @Override
   public fau.b k() {
      return this.l;
   }

   public void a(fau.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fau.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fau.a l() {
      return this.n;
   }

   public void a(fau.a $$0) {
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
