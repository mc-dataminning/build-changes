import javax.annotation.Nullable;

public class adm implements zw<aci> {
   public static final zn<wm, adm> a = zw.a(adm::a, adm::new);
   private final int b;
   private final byte c;

   public adm(bsv $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private adm(wm $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wm $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zy<adm> a() {
      return agu.D;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsv a(dbz $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
