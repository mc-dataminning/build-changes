import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class efe extends efi {
   private static final int a = 0;
   private static final int b = 1;
   private final efg c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private sw f;
   private sw g = sv.a;
   private sw h = sv.a;
   private boolean i = true;
   private boolean j = true;
   private efi.b k = efi.b.a;
   private efi.b l = efi.b.a;
   private n m = n.v;
   private efi.a n = efi.a.a;
   private final ts o;

   public efe(efg $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = sw.b($$1);
      this.o = ts.a.a($$1).a(new tb(tb.a.a, sw.b($$1)));
   }

   public efg a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public sw c() {
      return this.f;
   }

   public tj d() {
      tj $$0 = sy.a((sw)this.f.e().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(sw $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable sw $$0) {
      this.g = $$0 == null ? sv.a : $$0;
      this.c.b(this);
   }

   public sw e() {
      return this.g;
   }

   public void c(@Nullable sw $$0) {
      this.h = $$0 == null ? sv.a : $$0;
      this.c.b(this);
   }

   public sw f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public tj d(sw $$0) {
      tj $$1 = sw.h().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static tj a(@Nullable efi $$0, sw $$1) {
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
   public efi.b j() {
      return this.k;
   }

   @Override
   public efi.b k() {
      return this.l;
   }

   public void a(efi.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(efi.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public efi.a l() {
      return this.n;
   }

   public void a(efi.a $$0) {
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
