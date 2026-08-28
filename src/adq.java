import com.google.common.collect.Sets;
import java.util.Set;

public record adq(int b, boolean c, Set<ala<dds>> d, int e, int f, int g, boolean h, boolean i, boolean j, agl k, boolean l) implements zk<abz> {
   public static final zb<wo, adq> a = zk.a(adq::a, adq::new);

   private adq(wo $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(lv.ba)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agl($$0),
         $$0.readBoolean()
      );
   }

   private void a(wo $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, wa::b);
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
   public zm<adq> a() {
      return ago.O;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ala<dds>> f() {
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

   public agl m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
