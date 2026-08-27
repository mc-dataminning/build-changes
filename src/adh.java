import com.google.common.collect.Sets;
import java.util.Set;

public record adh(int b, boolean c, Set<akm<daz>> d, int e, int f, int g, boolean h, boolean i, boolean j, afz k, boolean l) implements ze<abq> {
   public static final yv<wi, adh> a = ze.a(adh::a, adh::new);

   private adh(wi $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(lf.aS)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new afz($$0),
         $$0.readBoolean()
      );
   }

   private void a(wi $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vx::b);
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
   public zg<adh> a() {
      return agc.O;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<akm<daz>> f() {
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

   public afz m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
