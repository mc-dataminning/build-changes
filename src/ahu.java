import javax.annotation.Nullable;

public class ahu implements zl<agl> {
   public static final zc<we, ahu> a = zl.a(ahu::a, ahu::new);
   private final ahu.a b;
   @Nullable
   private final akt c;

   public ahu(ahu.a $$0, @Nullable akt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahu a(ag $$0) {
      return new ahu(ahu.a.a, $$0.a());
   }

   public static ahu b() {
      return new ahu(ahu.a.b, null);
   }

   private ahu(we $$0) {
      this.b = $$0.b(ahu.a.class);
      if (this.b == ahu.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(we $$0) {
      $$0.a(this.b);
      if (this.b == ahu.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zn<ahu> a() {
      return agj.bQ;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public ahu.a e() {
      return this.b;
   }

   @Nullable
   public akt f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
