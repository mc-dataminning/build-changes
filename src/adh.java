import javax.annotation.Nullable;

public class adh implements zo<acd> {
   public static final zf<we, adh> a = zo.a(adh::a, adh::new);
   private final int b;
   private final byte c;

   public adh(btz $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private adh(we $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(we $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zq<adh> a() {
      return ags.D;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   @Nullable
   public btz a(dev $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
