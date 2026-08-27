import com.google.common.collect.ImmutableList.Builder;

public class feg extends fgf {
   private static final String a = "chest_bottom";
   private static final String b = "chest_lid";
   private static final String f = "chest_lock";

   public feg(fhs $$0) {
      super($$0);
   }

   @Override
   protected Builder<fhs> a(fhs $$0) {
      Builder<fhs> $$1 = super.a($$0);
      $$1.add($$0.b("chest_bottom"));
      $$1.add($$0.b("chest_lid"));
      $$1.add($$0.b("chest_lock"));
      return $$1;
   }

   public static fhy a() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      fgf.a($$1);
      $$1.a("chest_bottom", fhx.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), fhu.a(-2.0F, -10.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", fhx.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), fhu.a(-2.0F, -14.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", fhx.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), fhu.a(-1.0F, -11.0F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return fhy.a($$0, 128, 128);
   }
}
