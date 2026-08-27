import javax.annotation.Nullable;

public class ack implements vd<abc> {
   private final ack.a a;
   @Nullable
   private final aew b;

   public ack(ack.a $$0, @Nullable aew $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static ack a(af $$0) {
      return new ack(ack.a.a, $$0.a());
   }

   public static ack a() {
      return new ack(ack.a.b, null);
   }

   public ack(so $$0) {
      this.a = $$0.b(ack.a.class);
      if (this.a == ack.a.a) {
         this.b = $$0.s();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      if (this.a == ack.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public ack.a d() {
      return this.a;
   }

   @Nullable
   public aew e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
