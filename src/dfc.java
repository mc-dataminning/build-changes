public interface dfc {
   boolean b(dcb var1, iz var2, dsc var3);

   boolean a(dby var1, azh var2, iz var3, dsc var4);

   void a(arf var1, azh var2, iz var3, dsc var4);

   default iz a(iz $$0) {
      return switch (this.ap_()) {
         case a -> $$0.c();
         case b -> $$0;
      };
   }

   default dfc.a ap_() {
      return dfc.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
