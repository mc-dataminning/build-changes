import java.util.BitSet;
import javax.annotation.Nullable;

public class adu implements zw<aci> {
   public static final zn<xa, adu> a = zw.a(adu::a, adu::new);
   private final int b;
   private final int c;
   private final adt d;
   private final ady e;

   public adu(duj $$0, enl $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dbg $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new adt($$0);
      this.e = new ady($$4, $$1, $$2, $$3);
   }

   private adu(xa $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adt($$0, this.b, this.c);
      this.e = new ady($$0, this.b, this.c);
   }

   private void a(xa $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zy<adu> a() {
      return agu.K;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adt f() {
      return this.d;
   }

   public ady g() {
      return this.e;
   }
}
