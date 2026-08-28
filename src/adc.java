import com.google.common.collect.Sets;
import java.util.Set;

public record adc(int b, boolean c, Set<akt<dgz>> d, int e, int f, int g, boolean h, boolean i, boolean j, aga k, boolean l) implements yw<abl> {
   public static final yn<wa, adc> a = yw.a(adc::a, adc::new);

   private adc(wa $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(mc.bg)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new aga($$0),
         $$0.readBoolean()
      );
   }

   private void a(wa $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vl::b);
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
   public yy<adc> a() {
      return agd.N;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<akt<dgz>> f() {
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

   public aga m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
