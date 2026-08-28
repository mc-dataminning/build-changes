import java.util.BitSet;
import javax.annotation.Nullable;

public class adt implements zv<ach> {
   public static final zm<wz, adt> a = zv.a(adt::a, adt::new);
   private final int b;
   private final int c;
   private final ads d;
   private final adx e;

   public adt(duh $$0, enj $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dbe $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new ads($$0);
      this.e = new adx($$4, $$1, $$2, $$3);
   }

   private adt(wz $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new ads($$0, this.b, this.c);
      this.e = new adx($$0, this.b, this.c);
   }

   private void a(wz $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zx<adt> a() {
      return agt.K;
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
