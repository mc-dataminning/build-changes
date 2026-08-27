import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class evj extends evq {
   private static final int a = 0;
   private static final int b = 1;
   private final evo c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wx f;
   private wx g = ww.a;
   private wx h = ww.a;
   private boolean i = true;
   private boolean j = true;
   private evq.b k = evq.b.a;
   private evq.b l = evq.b.a;
   private n m = n.v;
   private evq.a n = evq.a.a;
   private final xu o;

   public evj(evo $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wx.b($$1);
      this.o = xu.a.a($$1).a(new xd(xd.a.a, wx.b($$1)));
   }

   public evo a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wx c() {
      return this.f;
   }

   public xl d() {
      xl $$0 = xa.a((wx)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wx $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wx $$0) {
      this.g = $$0 == null ? ww.a : $$0;
      this.c.b(this);
   }

   public wx e() {
      return this.g;
   }

   public void c(@Nullable wx $$0) {
      this.h = $$0 == null ? ww.a : $$0;
      this.c.b(this);
   }

   public wx f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xl d(wx $$0) {
      xl $$1 = wx.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xl a(@Nullable evq $$0, wx $$1) {
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
   public evq.b j() {
      return this.k;
   }

   @Override
   public evq.b k() {
      return this.l;
   }

   public void a(evq.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(evq.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public evq.a l() {
      return this.n;
   }

   public void a(evq.a $$0) {
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
