import java.util.BitSet;
import javax.annotation.Nullable;

public class adp implements zo<acd> {
   public static final zf<ws, adp> a = zo.a(adp::a, adp::new);
   private final int b;
   private final int c;
   private final ado d;
   private final adt e;

   public adp(dxj $$0, eqt $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      deb $$4 = $$0.f();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new ado($$0);
      this.e = new adt($$4, $$1, $$2, $$3);
   }

   private adp(ws $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new ado($$0, this.b, this.c);
      this.e = new adt($$0, this.b, this.c);
   }

   private void a(ws $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zq<adp> a() {
      return ags.K;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public ado f() {
      return this.d;
   }

   public adt g() {
      return this.e;
   }
}
