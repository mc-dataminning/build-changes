import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class enb extends eni {
   private static final int a = 0;
   private static final int b = 1;
   private final eng c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private vg f;
   private vg g = vf.a;
   private vg h = vf.a;
   private boolean i = true;
   private boolean j = true;
   private eni.b k = eni.b.a;
   private eni.b l = eni.b.a;
   private n m = n.v;
   private eni.a n = eni.a.a;
   private final wd o;

   public enb(eng $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = vg.b($$1);
      this.o = wd.a.a($$1).a(new vm(vm.a.a, vg.b($$1)));
   }

   public eng a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public vg c() {
      return this.f;
   }

   public vu d() {
      vu $$0 = vj.a((vg)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(vg $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable vg $$0) {
      this.g = $$0 == null ? vf.a : $$0;
      this.c.b(this);
   }

   public vg e() {
      return this.g;
   }

   public void c(@Nullable vg $$0) {
      this.h = $$0 == null ? vf.a : $$0;
      this.c.b(this);
   }

   public vg f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public vu d(vg $$0) {
      vu $$1 = vg.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static vu a(@Nullable eni $$0, vg $$1) {
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
   public eni.b j() {
      return this.k;
   }

   @Override
   public eni.b k() {
      return this.l;
   }

   public void a(eni.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(eni.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public eni.a l() {
      return this.n;
   }

   public void a(eni.a $$0) {
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
