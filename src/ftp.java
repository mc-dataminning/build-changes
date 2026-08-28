import com.google.common.collect.ImmutableList.Builder;

public class ftp extends fvo {
   private static final String a = "chest_bottom";
   private static final String b = "chest_lid";
   private static final String f = "chest_lock";

   public ftp(fxc $$0) {
      super($$0);
   }

   @Override
   protected Builder<fxc> a(fxc $$0) {
      Builder<fxc> $$1 = super.a($$0);
      $$1.add($$0.b("chest_bottom"));
      $$1.add($$0.b("chest_lid"));
      $$1.add($$0.b("chest_lock"));
      return $$1;
   }

   public static fxi a() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fvo.a($$1);
      $$1.a("chest_bottom", fxh.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), fxe.a(-2.0F, -10.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", fxh.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), fxe.a(-2.0F, -14.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", fxh.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), fxe.a(-1.0F, -11.1F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return fxi.a($$0, 128, 128);
   }
}
