import java.util.BitSet;
import javax.annotation.Nullable;

public class adg implements zc<abr> {
   public static final yt<vr, adg> a = zc.a(adg::a, adg::new);
   private final int b;
   private final int c;
   private final adh d;

   public adg(dgw $$0, eui $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new adh($$0, $$1, $$2, $$3);
   }

   private adg(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adh($$0, this.b, this.c);
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public ze<adg> a() {
      return agk.N;
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

   public adh f() {
      return this.d;
   }
}
