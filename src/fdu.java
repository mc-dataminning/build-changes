import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class fdu extends feb {
   private static final int a = 0;
   private static final int b = 1;
   private final fdz c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wv f;
   private wv g = wu.a;
   private wv h = wu.a;
   private boolean i = true;
   private boolean j = true;
   private feb.b k = feb.b.a;
   private feb.b l = feb.b.a;
   private n m = n.v;
   private feb.a n = feb.a.a;
   private final xs o;

   public fdu(fdz $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wv.b($$1);
      this.o = xs.a.a($$1).a(new xb.e(wv.b($$1)));
   }

   public fdz a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wv c() {
      return this.f;
   }

   public xj d() {
      xj $$0 = wy.a((wv)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wv $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wv $$0) {
      this.g = $$0 == null ? wu.a : $$0;
      this.c.b(this);
   }

   public wv e() {
      return this.g;
   }

   public void c(@Nullable wv $$0) {
      this.h = $$0 == null ? wu.a : $$0;
      this.c.b(this);
   }

   public wv f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xj d(wv $$0) {
      xj $$1 = wv.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xj a(@Nullable feb $$0, wv $$1) {
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
   public feb.b j() {
      return this.k;
   }

   @Override
   public feb.b k() {
      return this.l;
   }

   public void a(feb.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(feb.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public feb.a l() {
      return this.n;
   }

   public void a(feb.a $$0) {
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
