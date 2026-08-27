import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eue extends eul {
   private static final int a = 0;
   private static final int b = 1;
   private final euj c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private ws f;
   private ws g = wr.a;
   private ws h = wr.a;
   private boolean i = true;
   private boolean j = true;
   private eul.b k = eul.b.a;
   private eul.b l = eul.b.a;
   private n m = n.v;
   private eul.a n = eul.a.a;
   private final xp o;

   public eue(euj $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = ws.b($$1);
      this.o = xp.a.a($$1).a(new wy(wy.a.a, ws.b($$1)));
   }

   public euj a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public ws c() {
      return this.f;
   }

   public xg d() {
      xg $$0 = wv.a((ws)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(ws $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable ws $$0) {
      this.g = $$0 == null ? wr.a : $$0;
      this.c.b(this);
   }

   public ws e() {
      return this.g;
   }

   public void c(@Nullable ws $$0) {
      this.h = $$0 == null ? wr.a : $$0;
      this.c.b(this);
   }

   public ws f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public xg d(ws $$0) {
      xg $$1 = ws.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static xg a(@Nullable eul $$0, ws $$1) {
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
   public eul.b j() {
      return this.k;
   }

   @Override
   public eul.b k() {
      return this.l;
   }

   public void a(eul.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eul.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eul.a l() {
      return this.n;
   }

   public void a(eul.a $$0) {
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
