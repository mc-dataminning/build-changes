import com.google.common.collect.Sets;
import java.util.Set;

public record adw(int b, boolean c, Set<ali<dfm>> d, int e, int f, int g, boolean h, boolean i, boolean j, agr k, boolean l) implements zq<acf> {
   public static final zh<wu, adw> a = zq.a(adw::a, adw::new);

   private adw(wu $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(ma.bb)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agr($$0),
         $$0.readBoolean()
      );
   }

   private void a(wu $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, wg::b);
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
   public zs<adw> a() {
      return agu.O;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ali<dfm>> f() {
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

   public agr m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
