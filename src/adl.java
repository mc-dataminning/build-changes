import java.util.BitSet;
import javax.annotation.Nullable;

public class adl implements zk<abz> {
   public static final zb<wo, adl> a = zk.a(adl::a, adl::new);
   private final int b;
   private final int c;
   private final adk d;
   private final adp e;

   public adl(dwu $$0, eqe $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      ddm $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new adk($$0);
      this.e = new adp($$4, $$1, $$2, $$3);
   }

   private adl(wo $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adk($$0, this.b, this.c);
      this.e = new adp($$0, this.b, this.c);
   }

   private void a(wo $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zm<adl> a() {
      return ago.K;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adk f() {
      return this.d;
   }

   public adp g() {
      return this.e;
   }
}
