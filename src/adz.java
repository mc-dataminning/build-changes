import com.google.common.collect.Sets;
import java.util.Set;

public record adz(int b, boolean c, Set<ale<dby>> d, int e, int f, int g, boolean h, boolean i, boolean j, agr k, boolean l) implements zw<aci> {
   public static final zn<xa, adz> a = zw.a(adz::a, adz::new);

   private adz(xa $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(lq.aS)),
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

   private void a(xa $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, wm::b);
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
   public zy<adz> a() {
      return agu.O;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ale<dby>> f() {
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
