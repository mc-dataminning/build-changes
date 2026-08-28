import com.google.common.collect.Sets;
import java.util.Set;

public record adw(int b, boolean c, Set<alq<dkj>> d, int e, int f, int g, boolean h, boolean i, boolean j, agv k, boolean l) implements zo<acf> {
   public static final ze<wp, adw> a = zo.a(adw::a, adw::new);

   private adw(wp $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(mi.bp)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agv($$0),
         $$0.readBoolean()
      );
   }

   private void a(wp $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vy::b);
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
   public zq<adw> a() {
      return agy.O;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<alq<dkj>> f() {
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

   public agv m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
