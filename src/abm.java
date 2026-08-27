import javax.annotation.Nullable;

public class abm implements xz<aai> {
   public static final xq<us, abm> a = xz.a(abm::a, abm::new);
   private final int b;
   private final byte c;

   public abm(bof $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private abm(us $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(us $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public yb<abm> a() {
      return aet.D;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   @Nullable
   public bof a(cwe $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
