import com.google.common.collect.ImmutableList.Builder;

public class fas extends fcr {
   private static final String a = "chest_bottom";
   private static final String b = "chest_lid";
   private static final String f = "chest_lock";

   public fas(fee $$0) {
      super($$0);
   }

   @Override
   protected Builder<fee> a(fee $$0) {
      Builder<fee> $$1 = super.a($$0);
      $$1.add($$0.b("chest_bottom"));
      $$1.add($$0.b("chest_lid"));
      $$1.add($$0.b("chest_lock"));
      return $$1;
   }

   public static fek a() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      fcr.a($$1);
      $$1.a("chest_bottom", fej.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), feg.a(-2.0F, -10.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lid", fej.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), feg.a(-2.0F, -14.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("chest_lock", fej.c().a(0, 59).a(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), feg.a(-1.0F, -11.0F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      return fek.a($$0, 128, 128);
   }
}
