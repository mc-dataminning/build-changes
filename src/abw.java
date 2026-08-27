import com.google.common.collect.Sets;
import java.util.Set;

public record abw(int b, boolean c, Set<aix<cvr>> d, int e, int f, int g, boolean h, boolean i, boolean j, aen k, boolean l) implements xx<aag> {
   public static final xo<vb, abw> a = xx.a(abw::a, abw::new);

   private abw(vb $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(kg.aM)),
         $$0.n(),
         $$0.n(),
         $$0.n(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new aen($$0),
         $$0.readBoolean()
      );
   }

   private void a(vb $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, uq::b);
      $$0.c(this.e);
      $$0.c(this.f);
      $$0.c(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.a(this.j);
      this.k.a($$0);
      $$0.a(this.l);
   }

   @Override
   public xz<abw> a() {
      return aeq.N;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<aix<cvr>> f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }

   public boolean k() {
      return this.i;
   }

   public boolean l() {
      return this.j;
   }

   public aen m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
