import com.google.common.collect.Sets;
import java.util.Set;

public record adl(int b, boolean c, Set<akq<dcw>> d, int e, int f, int g, boolean h, boolean i, boolean j, agd k, boolean l) implements zg<abu> {
   public static final yx<wk, adl> a = zg.a(adl::a, adl::new);

   private adl(wk $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(lu.ba)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agd($$0),
         $$0.readBoolean()
      );
   }

   private void a(wk $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vw::b);
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
   public zi<adl> a() {
      return agg.O;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<akq<dcw>> f() {
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

   public agd m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
