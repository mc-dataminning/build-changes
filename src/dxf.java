import com.google.common.collect.UnmodifiableIterator;

public class dxf {
   public static final dxd a = a("empty", new dxb());
   public static final dxc b = a("flowing_water", new dxk.a());
   public static final dxc c = a("water", new dxk.b());
   public static final dxc d = a("flowing_lava", new dxh.a());
   public static final dxc e = a("lava", new dxh.b());

   private static <T extends dxd> T a(String $$0, T $$1) {
      return hr.a(jb.d, $$0, $$1);
   }

   static {
      for (dxd $$0 : jb.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            dxe $$1 = (dxe)var2.next();
            dxd.c.b($$1);
         }
      }
   }
}
