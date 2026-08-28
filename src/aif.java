import javax.annotation.Nullable;

public class aif implements zv<agv> {
   public static final zm<wl, aif> a = zv.a(aif::a, aif::new);
   private final aif.a b;
   @Nullable
   private final ale c;

   public aif(aif.a $$0, @Nullable ale $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aif a(af $$0) {
      return new aif(aif.a.a, $$0.a());
   }

   public static aif b() {
      return new aif(aif.a.b, null);
   }

   private aif(wl $$0) {
      this.b = $$0.b(aif.a.class);
      if (this.b == aif.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      if (this.b == aif.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zx<aif> a() {
      return agt.bQ;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public aif.a e() {
      return this.b;
   }

   @Nullable
   public ale f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
