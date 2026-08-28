import javax.annotation.Nullable;

public class acv implements zd<abs> {
   public static final yu<vs, acv> a = zd.a(acv::a, acv::new);
   private final int b;
   private final byte c;

   public acv(bwa $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private acv(vs $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vs $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zf<acv> a() {
      return agl.C;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwa a(dip $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
