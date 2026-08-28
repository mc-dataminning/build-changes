public interface dfi {
   boolean b(dcg var1, ja var2, dsh var3);

   boolean a(dcd var1, aym var2, ja var3, dsh var4);

   void a(aqk var1, aym var2, ja var3, dsh var4);

   default ja a(ja $$0) {
      return switch (this.aq_()) {
         case a -> $$0.c();
         case b -> $$0;
      };
   }

   default dfi.a aq_() {
      return dfi.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
