import com.google.common.collect.Sets;
import java.util.Set;

public record acr(int b, boolean c, Set<aju<czg>> d, int e, int f, int g, boolean h, boolean i, boolean j, afi k, boolean l) implements yp<aba> {
   public static final yg<vt, acr> a = yp.a(acr::a, acr::new);

   private acr(vt $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(ku.aP)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new afi($$0),
         $$0.readBoolean()
      );
   }

   private void a(vt $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vi::b);
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
   public yr<acr> a() {
      return afl.O;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<aju<czg>> f() {
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

   public afi m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
