import javax.annotation.Nullable;

public class adl implements zv<ach> {
   public static final zm<wl, adl> a = zv.a(adl::a, adl::new);
   private final int b;
   private final byte c;

   public adl(bst $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private adl(wl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wl $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zx<adl> a() {
      return agt.D;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   @Nullable
   public bst a(dbx $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
