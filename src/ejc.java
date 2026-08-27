import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ejc extends ejg {
   private static final int a = 0;
   private static final int b = 1;
   private final eje c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private ui f;
   private ui g = uh.a;
   private ui h = uh.a;
   private boolean i = true;
   private boolean j = true;
   private ejg.b k = ejg.b.a;
   private ejg.b l = ejg.b.a;
   private n m = n.v;
   private ejg.a n = ejg.a.a;
   private final vf o;

   public ejc(eje $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = ui.b($$1);
      this.o = vf.a.a($$1).a(new uo(uo.a.a, ui.b($$1)));
   }

   public eje a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public ui c() {
      return this.f;
   }

   public uw d() {
      uw $$0 = ul.a((ui)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(ui $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable ui $$0) {
      this.g = $$0 == null ? uh.a : $$0;
      this.c.b(this);
   }

   public ui e() {
      return this.g;
   }

   public void c(@Nullable ui $$0) {
      this.h = $$0 == null ? uh.a : $$0;
      this.c.b(this);
   }

   public ui f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public uw d(ui $$0) {
      uw $$1 = ui.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static uw a(@Nullable ejg $$0, ui $$1) {
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
   public ejg.b j() {
      return this.k;
   }

   @Override
   public ejg.b k() {
      return this.l;
   }

   public void a(ejg.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(ejg.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public ejg.a l() {
      return this.n;
   }

   public void a(ejg.a $$0) {
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
