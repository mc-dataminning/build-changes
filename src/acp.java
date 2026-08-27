import com.google.common.collect.Sets;
import java.util.Set;

public record acp(int b, boolean c, Set<ajs<cyx>> d, int e, int f, int g, boolean h, boolean i, boolean j, afg k, boolean l) implements yn<aay> {
   public static final ye<vr, acp> a = yn.a(acp::a, acp::new);

   private acp(vr $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(ks.aO)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new afg($$0),
         $$0.readBoolean()
      );
   }

   private void a(vr $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vg::b);
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
   public yp<acp> a() {
      return afj.O;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ajs<cyx>> f() {
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

   public afg m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
