import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class exe extends exl {
   private static final int a = 0;
   private static final int b = 1;
   private final exj c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private wu f;
   private wu g = wt.a;
   private wu h = wt.a;
   private boolean i = true;
   private boolean j = true;
   private exl.b k = exl.b.a;
   private exl.b l = exl.b.a;
   private n m = n.v;
   private exl.a n = exl.a.a;
   private final xr o;

   public exe(exj $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = wu.b($$1);
      this.o = xr.a.a($$1).a(new xa(xa.a.a, wu.b($$1)));
   }

   public exj a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public wu c() {
      return this.f;
   }

   public xi d() {
      xi $$0 = wx.a((wu)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(wu $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable wu $$0) {
      this.g = $$0 == null ? wt.a : $$0;
      this.c.b(this);
   }

   public wu e() {
      return this.g;
   }

   public void c(@Nullable wu $$0) {
      this.h = $$0 == null ? wt.a : $$0;
      this.c.b(this);
   }

   public wu f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xi d(wu $$0) {
      xi $$1 = wu.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xi a(@Nullable exl $$0, wu $$1) {
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
   public exl.b j() {
      return this.k;
   }

   @Override
   public exl.b k() {
      return this.l;
   }

   public void a(exl.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(exl.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public exl.a l() {
      return this.n;
   }

   public void a(exl.a $$0) {
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
