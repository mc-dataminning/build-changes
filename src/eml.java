import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class eml extends ems {
   private static final int a = 0;
   private static final int b = 1;
   private final emq c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private vd f;
   private vd g = vc.a;
   private vd h = vc.a;
   private boolean i = true;
   private boolean j = true;
   private ems.b k = ems.b.a;
   private ems.b l = ems.b.a;
   private n m = n.v;
   private ems.a n = ems.a.a;
   private final wa o;

   public eml(emq $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = vd.b($$1);
      this.o = wa.a.a($$1).a(new vj(vj.a.a, vd.b($$1)));
   }

   public emq a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }

   public vd c() {
      return this.f;
   }

   public vr d() {
      vr $$0 = vg.a((vd)this.f.f().c(this.o));
      n $$1 = this.n();
      if ($$1 != n.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(vd $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable vd $$0) {
      this.g = $$0 == null ? vc.a : $$0;
      this.c.b(this);
   }

   public vd e() {
      return this.g;
   }

   public void c(@Nullable vd $$0) {
      this.h = $$0 == null ? vc.a : $$0;
      this.c.b(this);
   }

   public vd f() {
      return this.h;
   }

   @Override
   public Collection<String> g() {
      return this.e;
   }

   @Override
   public vr d(vd $$0) {
      vr $$1 = vd.i().b(this.g).b($$0).b(this.h);
      n $$2 = this.n();
      if ($$2 != n.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static vr a(@Nullable ems $$0, vd $$1) {
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
   public ems.b j() {
      return this.k;
   }

   @Override
   public ems.b k() {
      return this.l;
   }

   public void a(ems.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(ems.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public ems.a l() {
      return this.n;
   }

   public void a(ems.a $$0) {
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
