import com.google.common.collect.Lists;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

public class etu {
   final etu.f a;

   public etu(etu.f $$0) {
      this.a = $$0;
   }

   public float a(@Nullable String $$0) {
      if ($$0 == null) {
         return 0.0F;
      } else {
         MutableFloat $$1 = new MutableFloat();
         auj.c($$0, vs.a, ($$1x, $$2, $$3) -> {
            $$1.add(this.a.getWidth($$3, $$2));
            return true;
         });
         return $$1.floatValue();
      }
   }

   public float a(va $$0) {
      MutableFloat $$1 = new MutableFloat();
      auj.a($$0, vs.a, ($$1x, $$2, $$3) -> {
         $$1.add(this.a.getWidth($$3, $$2));
         return true;
      });
      return $$1.floatValue();
   }

   public float a(atc $$0) {
      MutableFloat $$1 = new MutableFloat();
      $$0.accept(($$1x, $$2, $$3) -> {
         $$1.add(this.a.getWidth($$3, $$2));
         return true;
      });
      return $$1.floatValue();
   }

   public int a(String $$0, int $$1, vs $$2) {
      etu.e $$3 = new etu.e((float)$$1);
      auj.a($$0, $$2, $$3);
      return $$3.a();
   }

   public String b(String $$0, int $$1, vs $$2) {
      return $$0.substring(0, this.a($$0, $$1, $$2));
   }

   public String c(String $$0, int $$1, vs $$2) {
      MutableFloat $$3 = new MutableFloat();
      MutableInt $$4 = new MutableInt($$0.length());
      auj.b($$0, $$2, ($$3x, $$4x, $$5) -> {
         float $$6 = $$3.addAndGet(this.a.getWidth($$5, $$4x));
         if ($$6 > (float)$$1) {
            return false;
         } else {
            $$4.setValue($$3x);
            return true;
         }
      });
      return $$0.substring($$4.intValue());
   }

   public int d(String $$0, int $$1, vs $$2) {
      etu.e $$3 = new etu.e((float)$$1);
      auj.c($$0, $$2, $$3);
      return $$3.a();
   }

   @Nullable
   public vs a(va $$0, int $$1) {
      etu.e $$2 = new etu.e((float)$$1);
      return $$0.<vs>a(($$1x, $$2x) -> auj.c($$2x, $$1x, $$2) ? Optional.empty() : Optional.of($$1x), vs.a).orElse(null);
   }

   @Nullable
   public vs a(atc $$0, int $$1) {
      etu.e $$2 = new etu.e((float)$$1);
      MutableObject<vs> $$3 = new MutableObject();
      $$0.accept(($$2x, $$3x, $$4) -> {
         if (!$$2.accept($$2x, $$3x, $$4)) {
            $$3.setValue($$3x);
            return false;
         } else {
            return true;
         }
      });
      return (vs)$$3.getValue();
   }

   public String e(String $$0, int $$1, vs $$2) {
      return $$0.substring(0, this.d($$0, $$1, $$2));
   }

   public va a(va $$0, int $$1, vs $$2) {
      final etu.e $$3 = new etu.e((float)$$1);
      return $$0.a(new va.b<va>() {
         private final esy c = new esy();

         @Override
         public Optional<va> accept(vs $$0, String $$1) {
            $$3.b();
            if (!auj.c($$1, $$0, $$3)) {
               String $$2 = $$1.substring(0, $$3.a());
               if (!$$2.isEmpty()) {
                  this.c.a(va.a($$2, $$0));
               }

               return Optional.of(this.c.b());
            } else {
               if (!$$1.isEmpty()) {
                  this.c.a(va.a($$1, $$0));
               }

               return Optional.empty();
            }
         }
      }, $$2).orElse($$0);
   }

   public int f(String $$0, int $$1, vs $$2) {
      etu.b $$3 = new etu.b((float)$$1);
      auj.c($$0, $$2, $$3);
      return $$3.a();
   }

   public static int a(String $$0, int $$1, int $$2, boolean $$3) {
      int $$4 = $$2;
      boolean $$5 = $$1 < 0;
      int $$6 = Math.abs($$1);

      for (int $$7 = 0; $$7 < $$6; $$7++) {
         if ($$5) {
            while ($$3 && $$4 > 0 && ($$0.charAt($$4 - 1) == ' ' || $$0.charAt($$4 - 1) == '\n')) {
               $$4--;
            }

            while ($$4 > 0 && $$0.charAt($$4 - 1) != ' ' && $$0.charAt($$4 - 1) != '\n') {
               $$4--;
            }
         } else {
            int $$8 = $$0.length();
            int $$9 = $$0.indexOf(32, $$4);
            int $$10 = $$0.indexOf(10, $$4);
            if ($$9 == -1 && $$10 == -1) {
               $$4 = -1;
            } else if ($$9 != -1 && $$10 != -1) {
               $$4 = Math.min($$9, $$10);
            } else if ($$9 != -1) {
               $$4 = $$9;
            } else {
               $$4 = $$10;
            }

            if ($$4 == -1) {
               $$4 = $$8;
            } else {
               while ($$3 && $$4 < $$8 && ($$0.charAt($$4) == ' ' || $$0.charAt($$4) == '\n')) {
                  $$4++;
               }
            }
         }
      }

      return $$4;
   }

   public void a(String $$0, int $$1, vs $$2, boolean $$3, etu.d $$4) {
      int $$5 = 0;
      int $$6 = $$0.length();
      vs $$7 = $$2;

      while ($$5 < $$6) {
         etu.b $$8 = new etu.b((float)$$1);
         boolean $$9 = auj.a($$0, $$5, $$7, $$2, $$8);
         if ($$9) {
            $$4.accept($$7, $$5, $$6);
            break;
         }

         int $$10 = $$8.a();
         char $$11 = $$0.charAt($$10);
         int $$12 = $$11 != '\n' && $$11 != ' ' ? $$10 : $$10 + 1;
         $$4.accept($$7, $$5, $$3 ? $$12 : $$10);
         $$5 = $$12;
         $$7 = $$8.b();
      }
   }

   public List<va> g(String $$0, int $$1, vs $$2) {
      List<va> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, false, ($$2x, $$3x, $$4) -> $$3.add(va.a($$0.substring($$3x, $$4), $$2x)));
      return $$3;
   }

   public List<va> b(va $$0, int $$1, vs $$2) {
      List<va> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, ($$1x, $$2x) -> $$3.add($$1x));
      return $$3;
   }

   public List<va> a(va $$0, int $$1, vs $$2, va $$3) {
      List<va> $$4 = Lists.newArrayList();
      this.a($$0, $$1, $$2, ($$2x, $$3x) -> $$4.add($$3x ? va.a($$3, $$2x) : $$2x));
      return $$4;
   }

   public void a(va $$0, int $$1, vs $$2, BiConsumer<va, Boolean> $$3) {
      List<etu.c> $$4 = Lists.newArrayList();
      $$0.a(($$1x, $$2x) -> {
         if (!$$2x.isEmpty()) {
            $$4.add(new etu.c($$2x, $$1x));
         }

         return Optional.empty();
      }, $$2);
      etu.a $$5 = new etu.a($$4);
      boolean $$6 = true;
      boolean $$7 = false;
      boolean $$8 = false;

      while ($$6) {
         $$6 = false;
         etu.b $$9 = new etu.b((float)$$1);

         for (etu.c $$10 : $$5.a) {
            boolean $$11 = auj.a($$10.c, 0, $$10.d, $$2, $$9);
            if (!$$11) {
               int $$12 = $$9.a();
               vs $$13 = $$9.b();
               char $$14 = $$5.a($$12);
               boolean $$15 = $$14 == '\n';
               boolean $$16 = $$15 || $$14 == ' ';
               $$7 = $$15;
               va $$17 = $$5.a($$12, $$16 ? 1 : 0, $$13);
               $$3.accept($$17, $$8);
               $$8 = !$$15;
               $$6 = true;
               break;
            }

            $$9.a($$10.c.length());
         }
      }

      va $$18 = $$5.a();
      if ($$18 != null) {
         $$3.accept($$18, $$8);
      } else if ($$7) {
         $$3.accept(va.b, false);
      }
   }

   static class a {
      final List<etu.c> a;
      private String b;

      public a(List<etu.c> $$0) {
         this.a = $$0;
         this.b = $$0.stream().map($$0x -> $$0x.c).collect(Collectors.joining());
      }

      public char a(int $$0) {
         return this.b.charAt($$0);
      }

      public va a(int $$0, int $$1, vs $$2) {
         esy $$3 = new esy();
         ListIterator<etu.c> $$4 = this.a.listIterator();
         int $$5 = $$0;
         boolean $$6 = false;

         while ($$4.hasNext()) {
            etu.c $$7 = $$4.next();
            String $$8 = $$7.c;
            int $$9 = $$8.length();
            if (!$$6) {
               if ($$5 > $$9) {
                  $$3.a($$7);
                  $$4.remove();
                  $$5 -= $$9;
               } else {
                  String $$10 = $$8.substring(0, $$5);
                  if (!$$10.isEmpty()) {
                     $$3.a(va.a($$10, $$7.d));
                  }

                  $$5 += $$1;
                  $$6 = true;
               }
            }

            if ($$6) {
               if ($$5 <= $$9) {
                  String $$11 = $$8.substring($$5);
                  if ($$11.isEmpty()) {
                     $$4.remove();
                  } else {
                     $$4.set(new etu.c($$11, $$2));
                  }
                  break;
               }

               $$4.remove();
               $$5 -= $$9;
            }
         }

         this.b = this.b.substring($$0 + $$1);
         return $$3.b();
      }

      @Nullable
      public va a() {
         esy $$0 = new esy();
         this.a.forEach($$0::a);
         this.a.clear();
         return $$0.a();
      }
   }

   class b implements atd {
      private final float b;
      private int c = -1;
      private vs d = vs.a;
      private boolean e;
      private float f;
      private int g = -1;
      private vs h = vs.a;
      private int i;
      private int j;

      public b(float $$0) {
         this.b = Math.max($$0, 1.0F);
      }

      @Override
      public boolean accept(int $$0, vs $$1, int $$2) {
         int $$3 = $$0 + this.j;
         switch ($$2) {
            case 10:
               return this.a($$3, $$1);
            case 32:
               this.g = $$3;
               this.h = $$1;
            default:
               float $$4 = etu.this.a.getWidth($$2, $$1);
               this.f += $$4;
               if (!this.e || !(this.f > this.b)) {
                  this.e |= $$4 != 0.0F;
                  this.i = $$3 + Character.charCount($$2);
                  return true;
               } else {
                  return this.g != -1 ? this.a(this.g, this.h) : this.a($$3, $$1);
               }
         }
      }

      private boolean a(int $$0, vs $$1) {
         this.c = $$0;
         this.d = $$1;
         return false;
      }

      private boolean c() {
         return this.c != -1;
      }

      public int a() {
         return this.c() ? this.c : this.i;
      }

      public vs b() {
         return this.d;
      }

      public void a(int $$0) {
         this.j += $$0;
      }
   }

   static class c implements va {
      final String c;
      final vs d;

      public c(String $$0, vs $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public <T> Optional<T> a(va.a<T> $$0) {
         return $$0.accept(this.c);
      }

      @Override
      public <T> Optional<T> a(va.b<T> $$0, vs $$1) {
         return $$0.accept(this.d.a($$1), this.c);
      }
   }

   @FunctionalInterface
   public interface d {
      void accept(vs var1, int var2, int var3);
   }

   class e implements atd {
      private float b;
      private int c;

      public e(float $$0) {
         this.b = $$0;
      }

      @Override
      public boolean accept(int $$0, vs $$1, int $$2) {
         this.b = this.b - etu.this.a.getWidth($$2, $$1);
         if (this.b >= 0.0F) {
            this.c = $$0 + Character.charCount($$2);
            return true;
         } else {
            return false;
         }
      }

      public int a() {
         return this.c;
      }

      public void b() {
         this.c = 0;
      }
   }

   @FunctionalInterface
   public interface f {
      float getWidth(int var1, vs var2);
   }
}
