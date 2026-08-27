import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ely extends emc {
   private static final int a = 0;
   private static final int b = 1;
   private final ema c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private vb f;
   private vb g = va.a;
   private vb h = va.a;
   private boolean i = true;
   private boolean j = true;
   private emc.b k = emc.b.a;
   private emc.b l = emc.b.a;
   private n m = n.v;
   private emc.a n = emc.a.a;
   private final vy o;

   public ely(ema $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = vb.b($$1);
      this.o = vy.a.a($$1).a(new vh(vh.a.a, vb.b($$1)));
   }

   public ema a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public vb c() {
      return this.f;
   }

   public vp d() {
      vp $$0 = ve.a((vb)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(vb $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable vb $$0) {
      this.g = $$0 == null ? va.a : $$0;
      this.c.b(this);
   }

   public vb e() {
      return this.g;
   }

   public void c(@Nullable vb $$0) {
      this.h = $$0 == null ? va.a : $$0;
      this.c.b(this);
   }

   public vb f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public vp d(vb $$0) {
      vp $$1 = vb.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static vp a(@Nullable emc $$0, vb $$1) {
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
   public emc.b j() {
      return this.k;
   }

   @Override
   public emc.b k() {
      return this.l;
   }

   public void a(emc.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(emc.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public emc.a l() {
      return this.n;
   }

   public void a(emc.a $$0) {
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
