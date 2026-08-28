import java.util.BitSet;
import javax.annotation.Nullable;

public class adt implements zs<ach> {
   public static final zj<ww, adt> a = zs.a(adt::a, adt::new);
   private final int b;
   private final int c;
   private final ads d;
   private final adx e;

   public adt(dxt $$0, erd $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      del $$4 = $$0.f();
      this.b = $$4.g;
      this.c = $$4.h;
      this.d = new ads($$0);
      this.e = new adx($$4, $$1, $$2, $$3);
   }

   private adt(ww $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new ads($$0, this.b, this.c);
      this.e = new adx($$0, this.b, this.c);
   }

   private void a(ww $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zu<adt> a() {
      return agw.K;
   }

   public void a(ach $$0) {
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
