import javax.annotation.Nullable;

public class adl implements zs<ach> {
   public static final zj<wi, adl> a = zs.a(adl::a, adl::new);
   private final int b;
   private final byte c;

   public adl(bui $$0, byte $$1) {
      this.b = $$0.as();
      this.c = $$1;
   }

   private adl(wi $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wi $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zu<adl> a() {
      return agw.D;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   @Nullable
   public bui a(dff $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
