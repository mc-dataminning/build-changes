import javax.annotation.Nullable;

public class afb implements zc<abr> {
   public static final yt<vr, afb> a = zc.a(afb::a, afb::new);
   private final int b;
   private final int c;

   public afb(bvs $$0, @Nullable bvs $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private afb(vr $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vr $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public ze<afb> a() {
      return agk.aG;
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
}
