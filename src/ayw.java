import java.util.Optional;

public class ayw {
   private static final char a = '�';
   private static final Optional<Object> b = Optional.of(azf.a);

   private static boolean a(xu $$0, axr $$1, int $$2, char $$3) {
      return Character.isSurrogate($$3) ? $$1.accept($$2, $$0, 65533) : $$1.accept($$2, $$0, $$3);
   }

   public static boolean a(String $$0, xu $$1, axr $$2) {
      int $$3 = $$0.length();

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         char $$5 = $$0.charAt($$4);
         if (Character.isHighSurrogate($$5)) {
            if ($$4 + 1 >= $$3) {
               if (!$$2.accept($$4, $$1, 65533)) {
                  return false;
               }
               break;
            }

            char $$6 = $$0.charAt($$4 + 1);
            if (Character.isLowSurrogate($$6)) {
               if (!$$2.accept($$4, $$1, Character.toCodePoint($$5, $$6))) {
                  return false;
               }

               $$4++;
            } else if (!$$2.accept($$4, $$1, 65533)) {
               return false;
            }
         } else if (!a($$1, $$2, $$4, $$5)) {
            return false;
         }
      }

      return true;
   }

   public static boolean b(String $$0, xu $$1, axr $$2) {
      int $$3 = $$0.length();

      for (int $$4 = $$3 - 1; $$4 >= 0; $$4--) {
         char $$5 = $$0.charAt($$4);
         if (Character.isLowSurrogate($$5)) {
            if ($$4 - 1 < 0) {
               if (!$$2.accept(0, $$1, 65533)) {
                  return false;
               }
               break;
            }

            char $$6 = $$0.charAt($$4 - 1);
            if (Character.isHighSurrogate($$6)) {
               if (!$$2.accept(--$$4, $$1, Character.toCodePoint($$6, $$5))) {
                  return false;
               }
            } else if (!$$2.accept($$4, $$1, 65533)) {
               return false;
            }
         } else if (!a($$1, $$2, $$4, $$5)) {
            return false;
         }
      }

      return true;
   }

   public static boolean c(String $$0, xu $$1, axr $$2) {
      return a($$0, 0, $$1, $$2);
   }

   public static boolean a(String $$0, int $$1, xu $$2, axr $$3) {
      return a($$0, $$1, $$2, $$2, $$3);
   }

   public static boolean a(String $$0, int $$1, xu $$2, xu $$3, axr $$4) {
      int $$5 = $$0.length();
      xu $$6 = $$2;

      for (int $$7 = $$1; $$7 < $$5; $$7++) {
         char $$8 = $$0.charAt($$7);
         if ($$8 == 167) {
            if ($$7 + 1 >= $$5) {
               break;
            }

            char $$9 = $$0.charAt($$7 + 1);
            n $$10 = n.a($$9);
            if ($$10 != null) {
               $$6 = $$10 == n.v ? $$3 : $$6.c($$10);
            }

            $$7++;
         } else if (Character.isHighSurrogate($$8)) {
            if ($$7 + 1 >= $$5) {
               if (!$$4.accept($$7, $$6, 65533)) {
                  return false;
               }
               break;
            }

            char $$11 = $$0.charAt($$7 + 1);
            if (Character.isLowSurrogate($$11)) {
               if (!$$4.accept($$7, $$6, Character.toCodePoint($$8, $$11))) {
                  return false;
               }

               $$7++;
            } else if (!$$4.accept($$7, $$6, 65533)) {
               return false;
            }
         } else if (!a($$6, $$4, $$7, $$8)) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(xc $$0, xu $$1, axr $$2) {
      return $$0.a(($$1x, $$2x) -> a($$2x, 0, $$1x, $$2) ? Optional.empty() : b, $$1).isEmpty();
   }

   public static String a(String $$0) {
      StringBuilder $$1 = new StringBuilder();
      a($$0, xu.a, ($$1x, $$2, $$3) -> {
         $$1.appendCodePoint($$3);
         return true;
      });
      return $$1.toString();
   }

   public static String a(xc $$0) {
      StringBuilder $$1 = new StringBuilder();
      a($$0, xu.a, ($$1x, $$2, $$3) -> {
         $$1.appendCodePoint($$3);
         return true;
      });
      return $$1.toString();
   }
}
