import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class exv extends eyc {
   private static final int a = 0;
   private static final int b = 1;
   private final eya c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wy f;
   private wy g = wx.a;
   private wy h = wx.a;
   private boolean i = true;
   private boolean j = true;
   private eyc.b k = eyc.b.a;
   private eyc.b l = eyc.b.a;
   private n m = n.v;
   private eyc.a n = eyc.a.a;
   private final xv o;

   public exv(eya $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wy.b($$1);
      this.o = xv.a.a($$1).a(new xe(xe.a.a, wy.b($$1)));
   }

   public eya a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wy c() {
      return this.f;
   }

   public xm d() {
      xm $$0 = xb.a((wy)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wy $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wy $$0) {
      this.g = $$0 == null ? wx.a : $$0;
      this.c.b(this);
   }

   public wy e() {
      return this.g;
   }

   public void c(@Nullable wy $$0) {
      this.h = $$0 == null ? wx.a : $$0;
      this.c.b(this);
   }

   public wy f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xm d(wy $$0) {
      xm $$1 = wy.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xm a(@Nullable eyc $$0, wy $$1) {
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
   public eyc.b j() {
      return this.k;
   }

   @Override
   public eyc.b k() {
      return this.l;
   }

   public void a(eyc.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eyc.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eyc.a l() {
      return this.n;
   }

   public void a(eyc.a $$0) {
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
