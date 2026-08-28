import java.util.BitSet;
import javax.annotation.Nullable;

public class adh implements zd<abs> {
   public static final yu<vs, adh> a = zd.a(adh::a, adh::new);
   private final int b;
   private final int c;
   private final adi d;

   public adh(dhw $$0, evk $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new adi($$0, $$1, $$2, $$3);
   }

   private adh(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adi($$0, this.b, this.c);
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zf<adh> a() {
      return agl.N;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adi f() {
      return this.d;
   }
}
