public interface dlx {
   boolean a(dis var1, iu var2, dzo var3);

   boolean a(dip var1, azt var2, iu var3, dzo var4);

   void a(aro var1, azt var2, iu var3, dzo var4);

   default iu a(iu $$0) {
      return switch (this.am_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dlx.a am_() {
      return dlx.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
