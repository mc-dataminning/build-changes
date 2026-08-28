public interface dfe {
   boolean b(dcd var1, iz var2, dse var3);

   boolean a(dca var1, azh var2, iz var3, dse var4);

   void a(arf var1, azh var2, iz var3, dse var4);

   default iz a(iz $$0) {
      return switch (this.ap_()) {
         case a -> $$0.c();
         case b -> $$0;
      };
   }

   default dfe.a ap_() {
      return dfe.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
