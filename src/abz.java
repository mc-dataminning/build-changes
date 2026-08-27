import com.google.common.collect.Sets;
import java.util.Set;

public record abz(int b, boolean c, Set<ajb<cwe>> d, int e, int f, int g, boolean h, boolean i, boolean j, aeq k, boolean l) implements xz<aai> {
   public static final xq<vd, abz> a = xz.a(abz::a, abz::new);

   private abz(vd $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(ki.aN)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new aeq($$0),
         $$0.readBoolean()
      );
   }

   private void a(vd $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, us::b);
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
   public yb<abz> a() {
      return aet.O;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ajb<cwe>> f() {
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

   public aeq m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
