import com.google.common.collect.Sets;
import java.util.Set;

public record acd(int b, boolean c, Set<ajg<cwz>> d, int e, int f, int g, boolean h, boolean i, boolean j, aeu k, boolean l) implements yb<aam> {
   public static final xs<vf, acd> a = yb.a(acd::a, acd::new);

   private acd(vf $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(kj.aN)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new aeu($$0),
         $$0.readBoolean()
      );
   }

   private void a(vf $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, uu::b);
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
   public yd<acd> a() {
      return aex.O;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ajg<cwz>> f() {
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

   public aeu m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
