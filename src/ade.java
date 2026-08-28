import com.google.common.collect.Sets;
import java.util.Set;

public record ade(int b, boolean c, Set<akj<dcd>> d, int e, int f, int g, boolean h, boolean i, boolean j, afw k, boolean l) implements zb<abn> {
   public static final ys<wf, ade> a = zb.a(ade::a, ade::new);

   private ade(wf $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(lr.aZ)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new afw($$0),
         $$0.readBoolean()
      );
   }

   private void a(wf $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vr::b);
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
   public zd<ade> a() {
      return afz.O;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<akj<dcd>> f() {
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

   public afw m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
