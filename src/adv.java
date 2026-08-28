import com.google.common.collect.Sets;
import java.util.Set;

public record adv(int b, boolean c, Set<alh<dfb>> d, int e, int f, int g, boolean h, boolean i, boolean j, agq k, boolean l) implements zp<ace> {
   public static final zg<wt, adv> a = zp.a(adv::a, adv::new);

   private adv(wt $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(lz.bb)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agq($$0),
         $$0.readBoolean()
      );
   }

   private void a(wt $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, wf::b);
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
   public zr<adv> a() {
      return agt.O;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<alh<dfb>> f() {
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

   public agq m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
