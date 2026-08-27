import java.util.BitSet;
import javax.annotation.Nullable;

public class ack implements yn<aay> {
   public static final ye<vr, ack> a = yn.a(ack::a, ack::new);
   private final int b;
   private final int c;
   private final acj d;
   private final aco e;

   public ack(drf $$0, ekh $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      cye $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new acj($$0);
      this.e = new aco($$4, $$1, $$2, $$3);
   }

   private ack(vr $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new acj($$0, this.b, this.c);
      this.e = new aco($$0, this.b, this.c);
   }

   private void a(vr $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public yp<ack> a() {
      return afj.K;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acj f() {
      return this.d;
   }

   public aco g() {
      return this.e;
   }
}
