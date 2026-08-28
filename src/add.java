import java.util.BitSet;
import javax.annotation.Nullable;

public class add implements zc<abr> {
   public static final yt<wg, add> a = zc.a(add::a, add::new);
   private final int b;
   private final int c;
   private final adc d;
   private final adh e;

   public add(eat $$0, eui $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dgw $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new adc($$0);
      this.e = new adh($$4, $$1, $$2, $$3);
   }

   private add(wg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adc($$0, this.b, this.c);
      this.e = new adh($$0, this.b, this.c);
   }

   private void a(wg $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public ze<add> a() {
      return agk.K;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adc f() {
      return this.d;
   }

   public adh g() {
      return this.e;
   }
}
