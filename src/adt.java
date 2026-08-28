import java.util.BitSet;
import javax.annotation.Nullable;

public class adt implements zr<acg> {
   public static final zi<wv, adt> a = zr.a(adt::a, adt::new);
   private final int b;
   private final int c;
   private final ads d;
   private final adx e;

   public adt(dzt $$0, etf $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dgf $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new ads($$0);
      this.e = new adx($$4, $$1, $$2, $$3);
   }

   private adt(wv $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new ads($$0, this.b, this.c);
      this.e = new adx($$0, this.b, this.c);
   }

   private void a(wv $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zt<adt> a() {
      return agz.K;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public ads f() {
      return this.d;
   }

   public adx g() {
      return this.e;
   }
}
