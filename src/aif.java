import javax.annotation.Nullable;

public class aif implements zo<agu> {
   public static final zf<we, aif> a = zo.a(aif::a, aif::new);
   private final aif.a b;
   @Nullable
   private final alh c;

   public aif(aif.a $$0, @Nullable alh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aif a(ag $$0) {
      return new aif(aif.a.a, $$0.a());
   }

   public static aif b() {
      return new aif(aif.a.b, null);
   }

   private aif(we $$0) {
      this.b = $$0.b(aif.a.class);
      if (this.b == aif.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(we $$0) {
      $$0.a(this.b);
      if (this.b == aif.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zq<aif> a() {
      return ags.bT;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public aif.a e() {
      return this.b;
   }

   @Nullable
   public alh f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
