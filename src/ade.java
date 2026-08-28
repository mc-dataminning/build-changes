import java.util.BitSet;
import javax.annotation.Nullable;

public class ade implements zd<abs> {
   public static final yu<wh, ade> a = zd.a(ade::a, ade::new);
   private final int b;
   private final int c;
   private final add d;
   private final adi e;

   public ade(ebv $$0, evk $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dhw $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new add($$0);
      this.e = new adi($$4, $$1, $$2, $$3);
   }

   private ade(wh $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new add($$0, this.b, this.c);
      this.e = new adi($$0, this.b, this.c);
   }

   private void a(wh $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zf<ade> a() {
      return agl.K;
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

   public add f() {
      return this.d;
   }

   public adi g() {
      return this.e;
   }
}
