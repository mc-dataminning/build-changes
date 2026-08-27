import com.google.common.collect.Sets;
import java.util.Set;

public record adb(int b, boolean c, Set<ake<czu>> d, int e, int f, int g, boolean h, boolean i, boolean j, afs k, boolean l) implements yz<abk> {
   public static final yq<wd, adb> a = yz.a(adb::a, adb::new);

   private adb(wd $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(ld.aR)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new afs($$0),
         $$0.readBoolean()
      );
   }

   private void a(wd $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vs::b);
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
   public zb<adb> a() {
      return afv.O;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ake<czu>> f() {
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

   public afs m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
