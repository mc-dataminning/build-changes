import com.google.common.collect.ImmutableList.Builder;

public class fuc extends ftw {
   private static final String a = "chest_bottom";
   private static final String b = "chest_lid";
   private static final String f = "chest_lock";

   public fuc(fxq $$0) {
      super($$0);
   }

   @Override
   protected Builder<fxq> a(fxq $$0) {
      Builder<fxq> $$1 = super.a($$0);
      $$1.add($$0.b("chest_bottom"));
      $$1.add($$0.b("chest_lid"));
      $$1.add($$0.b("chest_lock"));
      return $$1;
   }

   public static fxw e() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      ftw.a($$1);
      $$1.a("chest_bottom", fxv.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), fxs.a(-2.0F, -5.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", fxv.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), fxs.a(-2.0F, -9.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", fxv.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), fxs.a(-1.0F, -6.0F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return fxw.a($$0, 128, 128);
   }
}
